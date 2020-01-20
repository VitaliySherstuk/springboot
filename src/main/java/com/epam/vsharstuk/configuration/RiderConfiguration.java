package com.epam.vsharstuk.configuration;

import com.epam.vsharstuk.domain.Rider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:riders.properties")
public class RiderConfiguration {

    @Value("${riderNameA}")
    private String riderNameA;
    @Value("${ageRiderA}")
    private int riderAgeA;
    @Value("${sexRiderA}")
    private Character riderSexA;
    @Value("${riderNameB}")
    private String riderNameB;
    @Value("${ageRiderB}")
    private int riderAgeB;
    @Value("${sexRiderB}")
    private Character riderSexB;
    @Value("${riderNameC}")
    private String riderNameC;
    @Value("${ageRiderC}")
    private int riderAgeC;
    @Value("${sexRiderC}")
    private Character riderSexC;
    @Value("${riderNameD}")
    private String riderNameD;
    @Value("${ageRiderD}")
    private int riderAgeD;
    @Value("${sexRiderD}")
    private Character riderSexD;
    @Value("${riderNameE}")
    private String riderNameE;
    @Value("${ageRiderE}")
    private int riderAgeE;
    @Value("${sexRiderE}")
    private Character riderSexE;
    @Value("${riderNameF}")
    private String riderNameF;
    @Value("${ageRiderF}")
    private int riderAgeF;
    @Value("${sexRiderF}")
    private Character riderSexF;
    @Value("${riderNameG}")
    private String riderNameG;
    @Value("${ageRiderG}")
    private int riderAgeG;
    @Value("${sexRiderG}")
    private Character riderSexG;
    @Value("${riderNameH}")
    private String riderNameH;
    @Value("${ageRiderH}")
    private int riderAgeH;
    @Value("${sexRiderH}")
    private Character riderSexH;
    @Value("${riderNameI}")
    private String riderNameI;
    @Value("${ageRiderI}")
    private int riderAgeI;
    @Value("${sexRiderI}")
    private Character riderSexI;
    @Value("${riderNameJ}")
    private String riderNameJ;
    @Value("${ageRiderJ}")
    private int riderAgeJ;
    @Value("${sexRiderJ}")
    private Character riderSexJ;
    @Value("${riderNameK}")
    private String riderNameK;
    @Value("${ageRiderK}")
    private int riderAgeK;
    @Value("${sexRiderK}")
    private Character riderSexK;
    @Value("${riderNameL}")
    private String riderNameL;
    @Value("${ageRiderL}")
    private int riderAgeL;
    @Value("${sexRiderL}")
    private Character riderSexL;
    @Value("${riderNameM}")
    private String riderNameM;
    @Value("${ageRiderM}")
    private int riderAgeM;
    @Value("${sexRiderM}")
    private Character riderSexM;
    @Value("${riderNameN}")
    private String riderNameN;
    @Value("${ageRiderN}")
    private int riderAgeN;
    @Value("${sexRiderN}")
    private Character riderSexN;
    @Value("${riderNameO}")
    private String riderNameO;
    @Value("${ageRiderO}")
    private int riderAgeO;
    @Value("${sexRiderO}")
    private Character riderSexO;

    @Bean(name = "riderA")
    public Rider getRiderA() {
        Rider rider = new Rider();
        rider.setName(riderNameA);
        rider.setAge(riderAgeA);
        rider.setSex(riderSexA);
        return rider;
    }

    @Bean(name = "riderB")
    public Rider getRiderB() {
        Rider rider = new Rider();
        rider.setName(riderNameB);
        rider.setAge(riderAgeB);
        rider.setSex(riderSexB);
        return rider;
    }

    @Bean(name = "riderC")
    public Rider getRiderC() {
        Rider rider = new Rider();
        rider.setName(riderNameC);
        rider.setAge(riderAgeC);
        rider.setSex(riderSexC);
        return rider;
    }

    @Bean(name = "riderD")
    public Rider getRiderD() {
        Rider rider = new Rider();
        rider.setName(riderNameD);
        rider.setAge(riderAgeD);
        rider.setSex(riderSexD);
        return rider;
    }

    @Bean(name = "riderE")
    public Rider getRiderE() {
        Rider rider = new Rider();
        rider.setName(riderNameE);
        rider.setAge(riderAgeE);
        rider.setSex(riderSexE);
        return rider;
    }

    @Bean(name = "riderF")
    public Rider getRiderF() {
        Rider rider = new Rider();
        rider.setName(riderNameF);
        rider.setAge(riderAgeF);
        rider.setSex(riderSexF);
        return rider;
    }

    @Bean(name = "riderG")
    public Rider getRiderG() {
        Rider rider = new Rider();
        rider.setName(riderNameG);
        rider.setAge(riderAgeG);
        rider.setSex(riderSexG);
        return rider;
    }

    @Bean(name = "riderH")
    public Rider getRiderH() {
        Rider rider = new Rider();
        rider.setName(riderNameH);
        rider.setAge(riderAgeH);
        rider.setSex(riderSexH);
        return rider;
    }

    @Bean(name = "riderI")
    public Rider getRiderI() {
        Rider rider = new Rider();
        rider.setName(riderNameI);
        rider.setAge(riderAgeI);
        rider.setSex(riderSexI);
        return rider;
    }

    @Bean(name = "riderJ")
    public Rider getRiderJ() {
        Rider rider = new Rider();
        rider.setName(riderNameJ);
        rider.setAge(riderAgeJ);
        rider.setSex(riderSexJ);
        return rider;
    }

    @Bean(name = "riderK")
    public Rider getRiderK() {
        Rider rider = new Rider();
        rider.setName(riderNameK);
        rider.setAge(riderAgeK);
        rider.setSex(riderSexK);
        return rider;
    }

    @Bean(name = "rideL")
    public Rider getRiderL() {
        Rider rider = new Rider();
        rider.setName(riderNameL);
        rider.setAge(riderAgeL);
        rider.setSex(riderSexL);
        return rider;
    }

    @Bean(name = "riderM")
    public Rider getRiderM() {
        Rider rider = new Rider();
        rider.setName(riderNameM);
        rider.setAge(riderAgeM);
        rider.setSex(riderSexM);
        return rider;
    }

    @Bean(name = "riderN")
    public Rider getRiderN() {
        Rider rider = new Rider();
        rider.setName(riderNameN);
        rider.setAge(riderAgeN);
        rider.setSex(riderSexN);
        return rider;
    }

    @Bean(name = "riderO")
    public Rider getRiderO() {
        Rider rider = new Rider();
        rider.setName(riderNameO);
        rider.setAge(riderAgeO);
        rider.setSex(riderSexO);
        return rider;
    }
}
