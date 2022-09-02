package com.ironhack.groupapiproject.service;


import com.ironhack.groupapiproject.model.Player;
import com.ironhack.groupapiproject.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

  @Autowired
  PlayerRepository repository;


  @Override
  public Player create(Player player) {
    return repository.save(player);
  }

  @Override
  public Optional<Player> getPlayerById(Long id) {
    return repository.findById(id);
  }

  @Override
  public List<Player> getAllPlayers() {
    return repository.findAll();
  }
}
