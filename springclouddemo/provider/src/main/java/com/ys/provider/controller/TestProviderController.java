package com.ys.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oscary
 */
@RestController
public class TestProviderController {

    @RequestMapping("/hello")
    public String getHello(){
        return "Hello! I am Provider.";
    }
}
