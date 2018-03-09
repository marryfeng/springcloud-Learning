package com.springcloud.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengli on 2018/2/8.
 */
@RestController
@RequestMapping("/provider/")
public class ProviderController {
    @Value("${server.port}")
    String port;
    @RequestMapping("hi")
    public String home(@RequestParam String name){
        return "hi "+name+" i am from"+port;

    }
}
