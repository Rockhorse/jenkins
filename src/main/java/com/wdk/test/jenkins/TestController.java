package com.wdk.test.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/hello")
    public String sayHello(){

        return "Hello World!";
    }
}
