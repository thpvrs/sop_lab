package com.example.week01;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class demoService {
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello world";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable() String name) {
        return "hello world " + ' ' + name;
    }
}