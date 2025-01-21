package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/demo")
    public DemoRecordDto demo() {
        return new DemoRecordDto("Marian", "marian@example.com");
    }

    @GetMapping(value = "/lombokdemo")
    public DemoDto lombokDemo() {
        return new DemoDto("Marian", "marian@example.com");
    }

}
