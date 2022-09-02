package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.SakuraCard;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class SakuraCardServiceConnected implements SakuraService {
    WebClient client = WebClient.create("https://protected-taiga-89091.herokuapp.com");



    @Override
    public List<SakuraCard> findAll() {
        return null;
    }

    @Override
    public SakuraCard findById(Long id) {


            SakuraCard sakuraCardMono = client.get()
                    .uri("/api/card/603a5d82e708590015ca94cc")
                    .retrieve()
                    .bodyToMono(SakuraCard.class)
                    .block();
            //SakuraCard sakuraCard = new SakuraCard();
            //sakuraCard.setCardNumber(sakura.getCardNumber());
            return sakuraCardMono;

    }
}
