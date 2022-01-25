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

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getClientCode() {
        return clientCode;
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


