package com.mubin.customer;

import com.mubin.customer.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;


    public void registerCustomer(CustomerRegistrationReq customerRequest) {
        Customer customer = Customer.builder().firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();

        customerRepository.saveAndFlush(customer);

        //It is hitting the endpoint of the fraud which in turn saves the data in fraud
        //param1: url
        //param2: class type
        //param3: data to be send as payload parameter in this case is the id


        //It is consuming the api from the fraud module
//        fraudResponse response = restTemplate.getForObject("http://localhost:8081/api/fraud-check/{id}", fraudResponse.class,
//                customer.getId());

        //USING THE EUREKA SERVICE
        fraudResponse response = restTemplate.getForObject("http://fraud/api/fraud-check/{id}", fraudResponse.class,
                customer.getId());


        if (response.success()) {
            throw new IllegalStateException("fraudster");
        }


    }
}
