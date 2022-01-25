package com.example.jazzproject.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT )
public class ClientAlreadyExistException extends RuntimeException{
    public ClientAlreadyExistException(){super("Client already exists");}
}
