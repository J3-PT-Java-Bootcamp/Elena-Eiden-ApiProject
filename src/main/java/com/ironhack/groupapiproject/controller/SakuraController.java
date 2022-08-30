package com.ironhack.groupapiproject.controller;

import com.ironhack.groupapiproject.model.SakuraCard;
import com.ironhack.groupapiproject.service.SakuraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/sakura")
public class SakuraController {

    @Autowired
    SakuraService sakuraService;

    @GetMapping("/greeting")
    public String helloSakura(){
        return "Hello Sakura's player";
    }
    @GetMapping("/{id}")
    public SakuraCard getById(@PathParam("id") Long id){
        return sakuraService.findById(id);
    }


}
