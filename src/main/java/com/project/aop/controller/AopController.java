package com.project.aop.controller;

import com.project.aop.service.Myinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @Autowired
    private Myinterface myinterface;

    @GetMapping("/testaop")
    public String checkAop(){
      return myinterface.testAop();
    }
}
