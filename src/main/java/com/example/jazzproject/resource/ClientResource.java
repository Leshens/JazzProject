package com.example.jazzproject.resource;

import com.example.jazzproject.client.Client;
import com.example.jazzproject.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api")
public class ClientResource {

    private final ClientService clientService;

    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients (){
        List<Client> clientList = clientService.displayClients();
        return new ResponseEntity<>(clientList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Client> getClientsById (@PathVariable("id")Long id){
        Client clientList = clientService.findClientById(id);
        return new ResponseEntity<>(clientList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Client> addClients(@RequestBody Client client){
        Client newClient = clientService.addClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }
        @PostMapping("/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client){
        Client newClient = clientService.updateClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClient (@PathVariable("id")Long id){
        clientService.deleteClient(id);
        return new ResponseEntity<>( id.toString(), HttpStatus.OK  );
    }


}
