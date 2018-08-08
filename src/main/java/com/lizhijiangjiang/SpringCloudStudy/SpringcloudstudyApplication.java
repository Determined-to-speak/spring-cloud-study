package com.lizhijiangjiang.SpringCloudStudy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringcloudstudyApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringcloudstudyApplication.class).web(true).run(args);
    }
}