package com.geekster.govinda.deploymentProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/home")

public class awsController {
    HashMap<String ,String> map= new HashMap <String,String>();

    @GetMapping("/aws")
    public HashMap<String ,String> getAll(){
        map.put("Name","Govinda Mishra");
        return map;
    }
}
