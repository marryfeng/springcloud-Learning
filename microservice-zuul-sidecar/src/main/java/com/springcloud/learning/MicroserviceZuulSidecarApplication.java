package com.springcloud.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class MicroserviceZuulSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulSidecarApplication.class, args);
	}
}
