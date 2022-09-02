package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.SakuraCard;
import reactor.core.publisher.Flux;

import java.net.URISyntaxException;
import java.util.List;

public interface SakuraService {
    List<String> findAll() throws URISyntaxException;
    SakuraCard findById(Long id);

    Flux<SakuraCard> getSakuraCards();
}
