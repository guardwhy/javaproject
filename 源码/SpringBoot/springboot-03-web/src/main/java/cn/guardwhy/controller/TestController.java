package cn.guardwhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class TestController {
    @RequestMapping("/t1")
    public String test01(Model model){
        model.addAttribute("message", "<h2>hello,Thymeleaf!!!<h2>");
        model.addAttribute("lists", Arrays.asList("harden", "james","kobe"));
        return "test";
    }
}
