package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente findByDni(String dni);
    Cliente findByTelefono(String telefono);
    Cliente save(Cliente cliente);
    void delete(Cliente cliente);

}
