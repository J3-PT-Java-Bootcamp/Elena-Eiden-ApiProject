package com.ironhack.groupapiproject.Controller;

import com.ironhack.groupapiproject.Model.SakuraCardCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MemoryGameController {

    @Autowired

    private SakuraCardCaptor sakuraCardCaptor;

    @GetMapping("/memory-game")

    public MemoryGameDto getMemoryGame() {

        MemoryGameDto memoryGameDto = new MemoryGameDto();

        memoryGameDto.setSakuraCardCaptor(sakuraCardCaptor);

        return memoryGameDto;
    }
}