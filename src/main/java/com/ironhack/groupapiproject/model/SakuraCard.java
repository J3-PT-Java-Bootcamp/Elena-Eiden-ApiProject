package com.ironhack.groupapiproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SakuraCard {
    @Id
    private String _id;

    private int cardNumber;
    private String spanishName;
    private String englishName;
    private String clowCard;
    private String sakuraCard;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "player_id")
    private Player player;

    public SakuraCard(int cardNumber, String spanishName, String englishName, String clowCard, String sakuraCard) {
        this.cardNumber = cardNumber;
        this.spanishName = spanishName;
        this.englishName = englishName;
        this.clowCard = clowCard;
        this.sakuraCard = sakuraCard;
    }
}