package com.example.jazzproject.client;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Client {
   @Id
     @SequenceGenerator( name = "client_sequence",
                        sequenceName = "client_sequence",
                        allocationSize = 1
    )
    @GeneratedValue(    strategy = GenerationType.SEQUENCE,
                        generator = "Client"
    )
    private Long id;
    private String name;
    private String surname;
    private LocalDate date;
    private double payment;

    public Client() {
    }

    public Client(String name, String surname, LocalDate date, double payment) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subname='" + surname + '\'' +
                ", date=" + date +
                ", payment=" + payment +
                '}';
    }
}


