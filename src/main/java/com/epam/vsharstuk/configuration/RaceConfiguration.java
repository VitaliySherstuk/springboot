package com.epam.vsharstuk.configuration;

import com.epam.vsharstuk.domain.Race;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class RaceConfiguration {

    @Bean(name = "raceA")
    public Race getRaceA() {
        Race race = new Race();
        race.setPlace("Minsk");
        race.setRaceNumber(1);
        race.setDate(LocalDate.parse("2019-11-19"));
        return race;
    }

    @Bean(name = "raceB")
    public Race getRaceB() {
        Race race = new Race();
        race.setPlace("Minsk");
        race.setRaceNumber(2);
        race.setDate(LocalDate.parse("2019-11-20"));
        return race;
    }
}
