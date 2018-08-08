package com.lizhijiangjiang.springcloudconsumercode2.Controller;


import com.lizhijiangjiang.springcloudconsumercode2.Interface.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class FeignInterfaceHystrix implements FeignInterface {

    public String consumer() {
        return "node 2 message error";
    }
}
