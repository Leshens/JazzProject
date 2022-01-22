package com.example.jazzproject.service;

import com.example.jazzproject.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository dataRepository;

    @Autowired
    public ClientService(ClientRepository dataRepository){
        this.dataRepository = dataRepository;
    }


    public List<Client> displayData(){
        return dataRepository.findAll();
    }
}
