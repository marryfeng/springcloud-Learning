package com.springcloud.learning.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by fengli on 2018/3/2.
 */
@Component
public class HystrixFeignService implements FeignService{

    @Override
    public String feignCall(String name) {
        return "sorry"+name;
    }
}
