package com.lizhijiangjiang.springcloudconsumercode3.Controller;


import com.lizhijiangjiang.springcloudconsumercode3.Interface.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
    @Autowired
    public FeignInterface feignInterface;

    @GetMapping("/consumer")
    public String dc() {
        return "hello this is second";
    }

}
