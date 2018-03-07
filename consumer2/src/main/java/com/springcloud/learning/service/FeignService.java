package com.springcloud.learning.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fengli on 2018/2/28.
 */
@FeignClient(value = "providerservice",fallback = HystrixFeignService.class)
public interface FeignService {
    @GetMapping("/provider/hi")
    //@RequestMapping(value = "/provider/hi",method = RequestMethod.GET)
    String feignCall(@RequestParam(value ="name") String name);


}
