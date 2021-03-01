package com.git.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/ping1")
    public String ping1() {
        return "pong1";
    }

    @GetMapping("/ping3")
    public String ping3() {
        return "pong3";
    }


}
