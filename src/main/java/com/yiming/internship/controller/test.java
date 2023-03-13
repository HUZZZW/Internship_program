package com.yiming.internship.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * test controller
 */
@RestController//@Controller+@ResponsBody 直接返回字符串
public class test {
    @RequestMapping("/justfortest" )
    public String showHelloWorld(){
        return "HelloWorld";
    }

}
