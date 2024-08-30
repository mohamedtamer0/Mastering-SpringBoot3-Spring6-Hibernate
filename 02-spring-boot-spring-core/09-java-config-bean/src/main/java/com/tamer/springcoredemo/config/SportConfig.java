package com.tamer.springcoredemo.config;


import com.tamer.springcoredemo.Common.Coach;
import com.tamer.springcoredemo.Common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}