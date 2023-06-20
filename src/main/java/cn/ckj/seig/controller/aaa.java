package cn.ckj.seig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aaa {
//陈凯键
    @Value("${name}")
    private String name;
    @RequestMapping("/aaa")
    public String sss(){
        return "fffff"+name;
    }

}
