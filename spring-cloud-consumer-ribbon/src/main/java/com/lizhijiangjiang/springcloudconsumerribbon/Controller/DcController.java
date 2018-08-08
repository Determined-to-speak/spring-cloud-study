package com.lizhijiangjiang.springcloudconsumerribbon.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {
    private static final Logger logger= LoggerFactory.getLogger(DcController.class);


    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        logger.info("I am spring-cloud-consumer-ribbon");
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

}
