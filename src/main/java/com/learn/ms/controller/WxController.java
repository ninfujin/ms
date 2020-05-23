package com.learn.ms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learn.ms.bean.*;
@RestController
@RequestMapping("/wx")
public class WxController {

    @RequestMapping("/login")
    public ResponseBean login(){
        return new ResponseBean();
    }
}
