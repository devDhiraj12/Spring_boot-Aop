package com.project.aop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

    @After("execution (* com.project.aop.serviceimpl.Aopimpl.testAop(..))")
    void executeAopCheck(){
        System.out.println("hello from Aop side");
    }}
