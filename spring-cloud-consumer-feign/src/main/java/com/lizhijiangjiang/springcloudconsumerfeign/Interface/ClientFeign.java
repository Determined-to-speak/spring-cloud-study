package com.lizhijiangjiang.springcloudconsumerfeign.Interface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface ClientFeign {
    @GetMapping("/dc")
    String consumer();

}
