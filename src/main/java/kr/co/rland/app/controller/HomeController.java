package kr.co.rland.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/hellooo")
    @ResponseBody
    public String hello(){

        return "hello";
    }
}
