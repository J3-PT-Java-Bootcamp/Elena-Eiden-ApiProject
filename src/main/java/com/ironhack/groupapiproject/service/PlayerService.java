package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

  Player create(Player player);
  Optional<Player> getPlayerById(Long id);
  List<Player> getAllPlayers();

}
