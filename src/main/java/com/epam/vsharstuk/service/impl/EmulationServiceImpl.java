package com.epam.vsharstuk.service.impl;

import com.epam.vsharstuk.domain.Horse;
import com.epam.vsharstuk.domain.Race;
import com.epam.vsharstuk.service.EmulationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.IntStream;

@Service
public class EmulationServiceImpl implements EmulationService {

    private Logger LOG = LogManager.getLogger(EmulationServiceImpl.class);

    @Autowired
    private RaceServiceImpl raceService;

    private final static int COUNT_ROUND = 5;

    @Override
    public void start() {
        Race race = raceService.getRace();

        if(race == null) {
            LOG.info("We do not have any races.");
            return;
        }

        List<Horse> participients = race.getHorses();
        LOG.info("RACE: " + race.getDate() + "   " + race.getPlace());
        LOG.info("Participients: ");
        IntStream.iterate(1, i -> i+1).limit(participients.size()).forEach(item -> {
            String result = String.format("[%s]     %s      %s", item, participients.get(item - 1).getName(), participients.get(item - 1).getRider().getName());
            LOG.info(result);
        });

        Map<String, Integer> bet = makeBet(race);
        IntStream.iterate(0, i -> i + 1)
                .limit(COUNT_ROUND + 1)
                .peek(item -> {
                    if (item < COUNT_ROUND) {
                        LOG.info("Round: " + (item + 1));
                    } else {
                        LOG.info("Finish: ");
                    }
                })
                .forEach(round -> {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Collections.shuffle(participients);
                    IntStream.iterate(1, i -> i + 1).limit(participients.size()).forEach(item -> {
                        String result = String.format("[%s]     %s      %s", item, participients.get(item - 1).getName(), participients.get(item - 1).getRider().getName());
                        LOG.info(result);

                    });
                    });
        LOG.info("==================================");

        Optional<Map.Entry<String, Integer>> betEntry = bet.entrySet().stream().findFirst();
        int betValue = betEntry.isPresent() ? betEntry.get().getValue() : 0;
        double prise = getPrise(betValue, raceService.getPriseKoeff(participients), bet.containsKey(participients.get(0).getName()));
        LOG.info("Prise: " + prise + "$");
    }

    double getPrise(int bet, double koeff, boolean isWinner) {
        if (!isWinner) {
            return 0.0;
        }
        return koeff * bet + bet;
    }

    Map<String, Integer> makeBet(Race race) {
        Scanner myObj = new Scanner(System.in);
        LOG.info("Enter name: ");
        String nameHorse = myObj.nextLine();
        LOG.info("Enter bet: ");
        int bet = myObj.nextInt();
        return Collections.singletonMap(nameHorse, bet);
    }
}
