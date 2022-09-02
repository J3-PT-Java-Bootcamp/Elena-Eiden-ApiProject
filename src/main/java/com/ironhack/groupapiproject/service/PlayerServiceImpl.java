package com.ironhack.groupapiproject.service;


import com.ironhack.groupapiproject.model.Player;
import com.ironhack.groupapiproject.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

  @Autowired
  PlayerRepository repository;


  @Override
  public Player create(Player player) {
    return repository.save(player);
  }

  @Override
  public Player getPlayerById(Long id) {
    return null;
  }

  @Override
  public List<Player> findAllPlayers() {
    return null;
  }
}
