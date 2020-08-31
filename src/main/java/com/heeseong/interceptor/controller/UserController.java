package com.heeseong.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t")
    public String index0(){
        System.out.println("주소 조건이 /user/? 주소가 한글자 일때만 걸립니다.");
        return "user";
    }

    @GetMapping("/tt")
    public String index1(){
        System.out.println("주소 조건이 /user/* 1뎁스 일때만 걸립니다.");
        return "user";
    }

    @GetMapping("/t/test")
    public String index2(){
        System.out.println("주소 조건이 /user/** 2뎁스 이상일때 걸립니다.");
        return "user";
    }

    @GetMapping("/ttt/test1/test2/test3")
    public String index3(){
        System.out.println("주소 조건이 /user/** 2뎁스 이상일때 걸립니다.");
        return "user";
    }
}
