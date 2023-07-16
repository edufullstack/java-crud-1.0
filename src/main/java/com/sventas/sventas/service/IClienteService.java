package com.sventas.sventas.service;

import java.util.List;

import com.sventas.sventas.model.Cliente;

public interface IClienteService {

  Cliente create(Cliente cliente);

  Cliente update(Cliente cliente);

  Cliente findById(Integer id);

  List<Cliente> findAll();

  void delete(Integer id);
}
