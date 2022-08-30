package com.ironhack.groupapiproject.service;

import com.ironhack.groupapiproject.model.SakuraCard;

import java.util.List;

public interface SakuraService {
    List<SakuraCard> findAll();
    SakuraCard findById(Long id);
}
