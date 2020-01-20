package com.epam.vsharstuk.service.impl;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.domain.Race;
import com.epam.vsharstuk.service.HorseService;
import com.epam.vsharstuk.service.RaceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class RaceServiceImpl implements RaceService, ApplicationContextAware {

    @Autowired
    private HorseServiceImpl horseService;

    private ApplicationContext applicationContext;
    private Logger LOG = LogManager.getLogger(EmulationServiceImpl.class);

    @Override
    public Race getRace() {
        List<Horse> horses = horseService.getRandomHourseList();
        LOG.debug("Get current race");
        Race currentRace = getCurrentRace().isPresent() ? getCurrentRace().get() : null;

        if (currentRace != null) {
            LOG.debug("Find current race: " + currentRace.getDate());
            LOG.debug("Include horses to race: " + horses);
            currentRace.setHorses(horses);
        }

        return currentRace;
    }

    Optional<Race> getCurrentRace() {
        LocalDate now = LocalDate.now();
        List<Race> races = new ArrayList<>(applicationContext.getBeansOfType(Race.class).values());
        return races.stream().filter(item -> item.getDate().isBefore(now)).sorted(Comparator.comparing(Race::getDate)).findFirst();
    }

    @Override
    public double getPriseKoeff(List<Horse> horses) {
        LOG.debug("Get prise koeff");
        Horse lider = horses.get(0);
        int maxSpeed = horses.stream().max(Comparator.comparing(Horse::getSpeed)).get().getSpeed();
        int koeff = 1 - (lider.getSpeed() / maxSpeed);
        return koeff == 0 ? 0.1 : koeff;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
