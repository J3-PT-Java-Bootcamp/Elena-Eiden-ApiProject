package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.SakuraCard;
import reactor.core.publisher.Flux;

import java.net.URISyntaxException;
import java.util.List;

public interface SakuraService {
    List<String> findAll() throws URISyntaxException;
    SakuraCard getRandomSakuraCard();
    Flux<SakuraCard> getSakuraCards();
    List<SakuraCard> getAllSakuraCards();
    SakuraCard findById(String id);
}
