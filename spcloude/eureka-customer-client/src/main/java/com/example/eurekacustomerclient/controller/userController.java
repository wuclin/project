package com.example.eurekacustomerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hihi")
    public String getx(){
        List<ServiceInstance> instances = discoveryClient.getInstances("provider");
        for (ServiceInstance instance : instances)
            System.out.println(instance.getHost() + "nmsl" + instance.getPort() + instance.getServiceId());
        return restTemplate.getForObject("http://provider/hi",String.class);
    }
}
