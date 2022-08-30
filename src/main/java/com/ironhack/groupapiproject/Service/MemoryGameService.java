package com.ironhack.groupapiproject.Service;

import com.ironhack.groupapiproject.Model.SakuraCard;

import java.util.List;

public class MemoryGameService {
    private List<SakuraCard> cards;

    public List<SakuraCard> getCards() {
        return cards;
    }

    public void setCards(List<SakuraCard> cards) {
        this.cards = cards;
    }
}
