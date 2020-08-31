package com.heeseong.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public String index(){
        System.out.println("어드민 컨트롤러 입니다.");
        return "admin";
    }
}
