package com.springbootdemo2.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1 {

    @RequestMapping("/")
    public String Thymeleaf_1(@RequestHeader(value = "Accept-Language") String language){
        System.out.println(language);
        //System.out.println("----------Test1()----------");
        return "publish";
    }
}
