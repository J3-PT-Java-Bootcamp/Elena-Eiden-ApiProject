package com.ironhack.groupapiproject.controller;


import com.ironhack.groupapiproject.model.Player;
import com.ironhack.groupapiproject.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

  @Autowired
  PlayerService playerService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Player create(@RequestBody Player player){
    return playerService.create(player);
  }
}
