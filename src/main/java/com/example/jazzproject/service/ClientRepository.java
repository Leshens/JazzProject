package com.example.jazzproject.service;

import com.example.jazzproject.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT s FROM Client s where s.name = ?1")
    Optional<Client> findByName(String name);
}
