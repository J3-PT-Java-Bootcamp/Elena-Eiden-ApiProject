package com.ironhack.groupapiproject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.groupapiproject.model.SakuraCard;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.ironhack.groupapiproject.util.Util.*;

@Service
public class SakuraServiceImpl implements SakuraService {
    WebClient client = WebClient.create("https://protected-taiga-89091.herokuapp.com");
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public SakuraCard getRandomSakuraCard() {
        SakuraCard sakuraCardMono = client.get()
                .uri("/api/card/" + getRandomSakuraCardId())
                .retrieve()
                .bodyToMono(SakuraCard.class)
                .block();
        return sakuraCardMono;
    }

    @Override
    public SakuraCard findById(String id) {
        SakuraCard sakuraCardMono = client.get()
                .uri("/api/card/" + id)
                .retrieve()
                .bodyToMono(SakuraCard.class)
                .block();
        return sakuraCardMono;
    }

    @Override
    public List<SakuraCard> getAllSakuraCards() {
        List<SakuraCard> sakuraCardList = new ArrayList<>();
        SakuraCard actualSakuraCard = new SakuraCard();
        for (String id: getIdsSakuraCard()) {
            actualSakuraCard = findById(id);
            sakuraCardList.add(actualSakuraCard);
        }
        return sakuraCardList;
    }


    @Override
    public Flux<SakuraCard> getSakuraCards() {
        Flux<SakuraCard> employeeFlux = client.get()
                .uri("/api/card")
                .retrieve()
                .bodyToFlux(SakuraCard.class);

        employeeFlux.subscribe(System.out::println);
        return employeeFlux;
    }



    @Override
    public List<String> findAll() throws URISyntaxException {
        Mono<SakuraCard[]> response = client.get()
                .uri("/api/card")
                .accept(MediaType.APPLICATION_JSON )
                .retrieve()
                .bodyToMono(SakuraCard[].class).log();

        SakuraCard[] sakuraCards = response.block();

        return Arrays.stream(sakuraCards)
                .map(sakuraCard -> mapper.convertValue(sakuraCard, SakuraCard.class))
                .map(SakuraCard::getEnglishName)
                .collect(Collectors.toList());
    }





}
