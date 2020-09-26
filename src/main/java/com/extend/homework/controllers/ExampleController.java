package com.extend.homework.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Value("${movies.apikey}")
    private String API_KEY;

    @RequestMapping("/")
    public String index() {

        return "Test Endpoint! " + API_KEY;
    }

}
