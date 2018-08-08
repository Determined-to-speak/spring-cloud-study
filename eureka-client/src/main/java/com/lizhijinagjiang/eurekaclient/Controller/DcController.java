package com.lizhijinagjiang.eurekaclient.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DcController {
    private static final Logger logger= LoggerFactory.getLogger(DcController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public java.lang.String dc(){
        java.lang.String service="Services:"+ discoveryClient.getServices();
        System.out.println(service);
        logger.info("I am eureka");
        return service;
    }
}
