package com.mubin.fraud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class fraudService{

    @Autowired
    private final fraudRepository fraudRepository;

    public fraudService(com.mubin.fraud.fraudRepository fraudRepository) {
        this.fraudRepository = fraudRepository;
    }


    boolean isFraud(Integer customerID){
        fraudRepository.save(
            fraudChecker.builder()
                    .customerId(customerID)
                    .isfraudster(false)
                    .createdAt(LocalDateTime.now())
                    .build()
    );

    return false;
    }

}
