package com.ironhack.groupapiproject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.groupapiproject.model.SakuraCard;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SakuraCardServiceConnected implements SakuraService {
    WebClient client = WebClient.create("https://protected-taiga-89091.herokuapp.com");

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public SakuraCard findById(Long id) {
        SakuraCard sakuraCardMono = client.get()
                .uri("/api/card/603a5d82e708590015ca94cc")
                .retrieve()
                .bodyToMono(SakuraCard.class)
                .block();
        return sakuraCardMono;
    }

    @Override
    public Flux<SakuraCard> getSakuraCards() {
        return null;
    }

    @Override
    public List<String> findAll() {
        return null;
    }


}
