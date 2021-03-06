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

    @GetMapping("/ping4")
    public String ping4() {
        return "pong4";
    }

    @GetMapping("/ping5")
    public String ping5() {
        return "pong5";
    }

    @GetMapping("/ping100")
    public String ping100() {
        return "pong5";
    }


    @GetMapping("/ping99")
    public String ping9() {
        return "pong99";
    }


    @GetMapping("/ping200")
    public String ping200() {
        return "pong200";
    }


}
