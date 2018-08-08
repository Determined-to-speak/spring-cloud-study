package com.lizhijiangjiang.springcloudconsumercode1.Controller;

import com.lizhijiangjiang.springcloudconsumercode1.Interface.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class FeignInterfaceHystrix implements FeignInterface {

    public String consumer() {
        return "node 1 message error";
    }
}
