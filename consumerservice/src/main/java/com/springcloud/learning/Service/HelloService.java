package com.springcloud.learning.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by fengli on 2018/2/27.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String hiService(String name){
       return restTemplate.getForObject("http://PROVIDERSERVICE-V1/provider/hi?name="+name,String.class);
    }


}
