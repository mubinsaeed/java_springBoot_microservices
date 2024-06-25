package com.mubin.clients.fraud;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Any microservice that want to communicate with the fraud api can use this
@FeignClient("fraud")
public interface FraudClient {

    //The function definition below is given which is implemented in the fraud controller


    @GetMapping(path="/api/fraud-check/{id}")
     fraudResponse isfraudster(@PathVariable("id") Integer id);

}
