package com.epam.vsharstuk.springboot;

import com.epam.vsharstuk.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.epam.vsharstuk")
public class SpringbootApplication {


	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
        Client client = context.getBean(Client.class);
        client.run();
	}

}
