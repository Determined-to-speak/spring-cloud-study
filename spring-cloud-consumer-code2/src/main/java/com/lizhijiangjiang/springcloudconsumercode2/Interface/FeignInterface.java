package com.lizhijiangjiang.springcloudconsumercode2.Interface;


import com.lizhijiangjiang.springcloudconsumercode2.Controller.FeignInterfaceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client", fallback = FeignInterfaceHystrix.class)
public interface FeignInterface {
    @GetMapping("/dc")
    String consumer();
}
