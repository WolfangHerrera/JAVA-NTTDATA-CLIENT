package com.wolfandevs.bdb.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolfandevs.bdb.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}