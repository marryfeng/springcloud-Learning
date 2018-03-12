package com.springcloud.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengli on 2018/3/12.
 */
@RestController
public class ConfigController {


    @Value("${profile}}")
    private String profile;

    @GetMapping("/profile")
    public String configProfile(){
        return profile;
    }
}
