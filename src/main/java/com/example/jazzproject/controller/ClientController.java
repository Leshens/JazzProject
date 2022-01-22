package com.example.jazzproject.controller;

import com.example.jazzproject.client.Client;
import com.example.jazzproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    ClientService dataService;

    @Autowired
    public ClientController(ClientService dataService){this.dataService = dataService;}

    @GetMapping("/data")
    public List<Client> showData(){
        return dataService.displayData();
    }

}
