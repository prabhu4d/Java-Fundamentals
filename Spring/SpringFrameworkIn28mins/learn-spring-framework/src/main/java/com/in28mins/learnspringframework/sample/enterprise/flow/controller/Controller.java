package com.in28mins.learnspringframework.sample.enterprise.flow.controller;

import com.in28mins.learnspringframework.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



// Sending Response in the right format
@RestController
public class Controller {
    // "/sum" => 100

    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calculateSum();
    }
}




