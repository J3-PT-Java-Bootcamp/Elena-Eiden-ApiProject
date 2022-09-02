package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.SakuraCard;
import reactor.core.publisher.Flux;

import java.util.List;

public interface SakuraService {
    List<String> findAll();
    SakuraCard findById(Long id);

    Flux<SakuraCard> getSakuraCards();
}
