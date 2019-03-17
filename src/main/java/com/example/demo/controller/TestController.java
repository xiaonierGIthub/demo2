package com.example.demo.controller;

import com.example.demo.domain.Hi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arya on 2019/3/17.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "ok";
    }

    @GetMapping("hi")
    public Hi hi() {
        Hi hi = new Hi();
        hi.setAge(27);
        hi.setName("Xiangxiang");
        return hi;
    }

}
