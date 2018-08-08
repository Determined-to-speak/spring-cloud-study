package com.lizhijiangjiang.springcloudconsumerfeign.Controller;


import com.lizhijiangjiang.springcloudconsumerfeign.Interface.ClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    ClientFeign clientFeign;

    @GetMapping("/consumer")
    public String dc() {
        return clientFeign.consumer();
    }

}
