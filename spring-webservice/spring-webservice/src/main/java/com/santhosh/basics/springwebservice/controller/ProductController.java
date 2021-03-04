package com.santhosh.basics.springwebservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public String getProduct(){
        return "product";
    }

}
