package com.example.jazzproject.service;

import com.example.jazzproject.client.Client;
import com.example.jazzproject.exeption.ClientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }


    public List<Client> displayClients(){
        return clientRepository.findAll();
    }

    public Client addClient(Client client){
        client.setClientCode(UUID.randomUUID().toString());
        return clientRepository.save(client);
    }
    public Client updateClient(Client client){
        if (!clientRepository.existsById(client.getId())){
            throw new ClientNotFoundException("User by id: "+client.getId()+" was not found");
        }
        return clientRepository.save(client);
    }

    public void deleteClient(Long id){
        if (!clientRepository.existsById(id)){
            throw new ClientNotFoundException("User by id: "+id+" was not found");
        }
        clientRepository.deleteClientById(id);
    }

    public Client findClientById(Long id){
        return clientRepository.findClientById(id).orElseThrow(() -> new ClientNotFoundException("User by id: "+id+" was not found"));
    }
}
