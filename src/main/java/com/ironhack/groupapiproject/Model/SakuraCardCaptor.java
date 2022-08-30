package com.ironhack.groupapiproject.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SakuraCardCaptor {
    private String name;

    private List<SakuraCard> sakuraCards;
}