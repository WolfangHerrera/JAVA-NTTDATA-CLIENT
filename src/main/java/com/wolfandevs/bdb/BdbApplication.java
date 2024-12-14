package com.wolfandevs.bdb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wolfandevs.bdb.model.Client;
import com.wolfandevs.bdb.service.ClientRepository;

@SpringBootApplication
public class BdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdbApplication.class, args);
	}

    @Bean
    public CommandLineRunner init(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client("Wolfang", "Andrey", "Herrera", "Casallas", "3134508405", "123 Main St", "New York", "C", 23445322L));
        };
    }

}
