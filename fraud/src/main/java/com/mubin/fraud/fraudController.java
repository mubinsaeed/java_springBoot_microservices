package com.mubin.fraud;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud-check")
@AllArgsConstructor
public class fraudController {
    @Autowired
    private final  fraudService fraudService;

    @GetMapping(path="{id}")
    public fraudResponse isfraudster(@PathVariable("id") Integer id){
        boolean check = fraudService.isFraud(id);
        return new fraudResponse(check);


    }

}
