package com.lizhijiangjiang.springcloudconsumerribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudconsumerribbonApplication {


    /**
     * 使用ribbon进行负载均衡
     * 使用时输入的是实现负载均衡的url（spring-cloud-consumer），会自动在spring-cloud-consumer和eureka-client之间切换
     *
     * @return Resttemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
      new  SpringApplicationBuilder(SpringcloudconsumerribbonApplication.class).web(true).run(args);
    }


}
