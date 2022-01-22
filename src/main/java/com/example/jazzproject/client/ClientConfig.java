package com.example.jazzproject.client;

import com.example.jazzproject.client.Client;
import com.example.jazzproject.service.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository ClientRepository){
        return args -> {
            Client jan = new Client(
            "Jan","Kowalski", LocalDate.of(2021, Month.DECEMBER,25),2022.21
            );
                    Client alex = new Client(
                            "Alex","Flont",LocalDate.of(2021,Month.DECEMBER,28),1548.28
                    );
/*        ClientRepository.saveAll(
                List.of(jan,alex)
        );
  */      };
    }
}
