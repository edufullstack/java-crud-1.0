package com.sventas.sventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sventas.sventas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
