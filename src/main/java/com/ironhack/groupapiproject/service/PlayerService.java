package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.Player;

import java.util.List;

public interface PlayerService {

  Player create(Player player);
  Player getPlayerById(Long id);
  List<Player> findAllPlayers();

}
