package com.lizhijiangjiang.springcloudconsumercode2.Controller;


import com.lizhijiangjiang.springcloudconsumercode2.Interface.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
    @Autowired
    private FeignInterface feignInterface;

    @GetMapping("/consumer")
    public String dc() {
        return feignInterface.consumer();
    }

}
