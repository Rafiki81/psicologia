package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Cliente;
import com.rafiki.psicologia.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.Predicate;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) repository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Cliente findByDni(String dni) {
        List<Cliente> clientes = (List<Cliente>)repository.findAll();
        Predicate<Cliente> dniMatch = p ->p.getDni().equals(dni);
        return clientes.stream().filter(dniMatch).findFirst().orElse(null);
    }

    @Override
    public Cliente findByTelefono(String telefono) {
        List<Cliente> clientes = (List<Cliente>)repository.findAll();
        Predicate<Cliente> telefonoMatch = p ->p.getTelefono().equals(telefono);
        return clientes.stream().filter(telefonoMatch).findFirst().orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {

        List<Cliente> clientes = (List<Cliente>)repository.findAll();
        Predicate<Cliente> emailMatch = p ->p.getEmail().equals(cliente.getEmail());
        Predicate<Cliente> dniMatch = p ->p.getDni().equals(cliente.getDni());
        Predicate<Cliente> emailAndDniMatch = emailMatch.or(dniMatch);

        if(!clientes.stream().filter(emailAndDniMatch).findAny().equals(null)) {
            return null;
        }
        return repository.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {

        repository.delete(cliente);

    }
}
