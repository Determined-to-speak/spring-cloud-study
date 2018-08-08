package com.lizhijiangjiang.configservergit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerGitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerGitApplication.class).web(true).run(args);
    }
}
