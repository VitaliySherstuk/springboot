package com.epam.vsharstuk.service.impl;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.domain.Rider;
import com.epam.vsharstuk.service.HorseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Service to manage horses
 */
@Service
public class HorseServiceImpl implements HorseService, ApplicationContextAware {

    private ApplicationContext applicationContext;
    private Logger LOG = LogManager.getLogger(HorseServiceImpl.class);

    @Override
    public List<Horse> getAllHorses() {
        LOG.debug("Get all horses");
        return new ArrayList<>(applicationContext.getBeansOfType(Horse.class).values());
    }

    @Override
    public List<Horse> getRandomHourseList() {
        List<Horse> horses = getAllHorses();
        LOG.debug("Shuffle horses");
        Collections.shuffle(horses);
        LOG.debug("Get first seven of horses");
        return horses.subList(0, 7);
    }

    @Override
    public Horse findHorseByHorseName(String name) {
        LOG.debug("Find horse by name");
        return getAllHorses().stream()
                .filter(horse -> horse.getRider().equals(name)).findFirst().get();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
