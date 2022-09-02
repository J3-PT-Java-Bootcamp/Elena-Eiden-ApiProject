package com.ironhack.groupapiproject.controller;


import com.ironhack.groupapiproject.model.Player;
import com.ironhack.groupapiproject.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {

  @Autowired
  PlayerService playerService;

  @GetMapping("/id/{id}")
  public Optional<Player> getPlayerById(@PathVariable("id") Long id){
    return playerService.getPlayerById(id);
  }

  @GetMapping("/all")
  public List<Player> getPlayers(){
    return playerService.getAllPlayers();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Player create(@RequestBody Player player){
    return playerService.create(player);
  }

}
