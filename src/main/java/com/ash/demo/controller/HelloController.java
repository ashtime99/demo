package com.ash.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * hello
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/8/22 15:20
 */
@RequestMapping("/test")
@RestController
public class HelloController {

    @GetMapping("hello")
    public String sayHello(){
        return "hello world";
    }

}
