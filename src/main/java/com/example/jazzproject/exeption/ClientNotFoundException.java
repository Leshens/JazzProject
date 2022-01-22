package com.example.jazzproject.exeption;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(){super("DataNotFound");}
}
