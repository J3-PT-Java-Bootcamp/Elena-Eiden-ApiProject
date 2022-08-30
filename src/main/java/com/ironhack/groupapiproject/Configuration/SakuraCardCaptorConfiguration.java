package com.ironhack.groupapiproject.Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

public class SakuraCardCaptorConfiguration {

@Autowired
//@Bean
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET, value = "/sakura/{name}")
    public String getSakura(@PathVariable String name) {
        String sakuraApiUrl = "https://sakura-card-captor-api.herokuapp.com/api/v1/sakura/" + name;
        ResponseEntity<String> response = restTemplate.getForEntity(sakuraApiUrl, String.class);
        return response.getBody();
    }
}