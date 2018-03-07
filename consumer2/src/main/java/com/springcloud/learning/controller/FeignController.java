package com.springcloud.learning.controller;

import com.springcloud.learning.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengli on 2018/2/28.
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/feign/")
    public String feignCall(@RequestParam String name){
        return feignService.feignCall(name);
    }

}
