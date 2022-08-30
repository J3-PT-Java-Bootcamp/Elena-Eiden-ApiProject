package com.ironhack.groupapiproject.Configuration;

import com.ironhack.groupapiproject.Model.SakuraCardCaptor;
import org.springframework.context.annotation.Bean;

public class SakuraCardCaptorConfiguration {
    @Bean

    public SakuraCardCaptor sakuraCardCaptor() {

        return new SakuraCardCaptor();

    }
}