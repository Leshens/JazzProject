package com.example.jazzproject.client;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private LocalDate date;
    private double payment;
    private double tax;
    private String clientCode;

    public Client() {
    }

    public Client(String name, String surname, LocalDate date, double payment, double tax) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.payment = payment;
        this.tax = tax;
    }

    public Long getId() {
        return id;
    }
    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", payment=" + payment +
                ", tax=" + tax +
                ", clientCode='" + clientCode + '\'' +
                '}';
    }
}


