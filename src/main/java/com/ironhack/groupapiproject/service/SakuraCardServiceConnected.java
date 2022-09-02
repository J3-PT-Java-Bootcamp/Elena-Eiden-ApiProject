package com.ironhack.groupapiproject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.groupapiproject.model.SakuraCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.ironhack.groupapiproject.util.Util.getRandomSakuraCardId;

@Service
public class SakuraCardServiceConnected implements SakuraService {
    WebClient client = WebClient.create("https://protected-taiga-89091.herokuapp.com");
    ObjectMapper mapper = new ObjectMapper();


    @Override
    public SakuraCard findById(Long id) {

        SakuraCard sakuraCardMono = client.get()
                .uri("/api/card/" + getRandomSakuraCardId())
                .retrieve()
                .bodyToMono(SakuraCard.class)
                .block();
        return sakuraCardMono;
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
