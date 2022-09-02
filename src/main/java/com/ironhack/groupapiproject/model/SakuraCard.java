package com.ironhack.groupapiproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SakuraCard {
    @Id
    private String _id;

    private int cardNumber;
    private String spanishName;
    private String englishName;
    private String clowCard;
    private String sakuraCard;

    public SakuraCard(int cardNumber, String spanishName, String englishName, String clowCard, String sakuraCard) {
        this.cardNumber = cardNumber;
        this.spanishName = spanishName;
        this.englishName = englishName;
        this.clowCard = clowCard;
        this.sakuraCard = sakuraCard;
    }
}