package com.matula.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuotesConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
