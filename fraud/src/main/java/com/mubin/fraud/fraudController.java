package com.mubin.fraud;


import com.mubin.clients.fraud.fraudResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/api/fraud-check")
@AllArgsConstructor
public class fraudController {
    @Autowired
    private final  fraudService fraudService;

    @GetMapping(path="{id}")
    public fraudResponse isfraudster(@PathVariable("id") Integer id){
        boolean check = fraudService.isFraud(id);

        log.info("fraud req for the id is " + id);
        return new fraudResponse(check);


    }

}
