package com.hxc.demo.AspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 基于注解的aop开发
 */
@Aspect
@Component
public class PersonAspectJ {
    /**
     * 前置通知
     */
    @Before("execution(* com.hxc.demo.service..*.*(..))")
    public void before(){
        System.out.println("before");
    }

    /**
     * 后置通知
     */
    @After("execution(* com.hxc.demo.service..*.*(..))")
    public void after(){
        System.out.println("after");
    }

    /**
     * 异常通知
     * @param throwable
     */
    @AfterThrowing(value = "execution(* com.hxc.demo.service..*.*(..))",throwing = "throwable")
    public void exceptionHandler(Throwable throwable){
        System.out.println(throwable.getClass().getName()+"\n"+throwable.getMessage().toString());
    }

}