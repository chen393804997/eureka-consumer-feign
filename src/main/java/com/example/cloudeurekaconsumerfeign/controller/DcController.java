package com.example.cloudeurekaconsumerfeign.controller;

import com.example.cloudeurekaconsumerfeign.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: czw
 * @Date: 2018-11-30 13:52
 **/
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String consumer(){
        return dcClient.consumer();
    }
}
