package com.ironhack.groupapiproject.controller;

import com.ironhack.groupapiproject.model.SakuraCard;
import com.ironhack.groupapiproject.service.SakuraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.websocket.server.PathParam;
import java.net.URISyntaxException;
import java.util.List;

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

    @GetMapping("/all")  // no funciona porque da error -> no se puede serializar
    public List<String> getAll() throws URISyntaxException {
        return sakuraService.findAll();
    }

    @GetMapping("/demoflux") // no funciona devuelve un array de 1 solo elemento y vacío
    public Flux<SakuraCard> getAllSakuraCards(){
        return sakuraService.getSakuraCards();
    }




}
