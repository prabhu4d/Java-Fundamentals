package com.in28mins.learnspringframework.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Getting Data
@Component
public class DataService{
    public List<Integer> retrieveData(){
        return Arrays.asList(12,24,36,48);
    }
}