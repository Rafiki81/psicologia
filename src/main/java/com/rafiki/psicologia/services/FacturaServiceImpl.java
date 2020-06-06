package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Factura;
import com.rafiki.psicologia.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FacturaServiceImpl implements FacturaService {
    @Autowired
    FacturaRepository repository;


    @Override
    public List<Factura> findAll() {
        return (List<Factura>) repository.findAll();
    }

    @Override
    public List<Factura> findByIdCliente(long id) {
        List<Factura> facturas = (List<Factura>) repository.findAll();
        return facturas.stream().filter(x -> x.getIdCliente()==id).collect(Collectors.toList());
    }

    @Override
    public List<Factura> findUnpaid() {

        Predicate<Factura> isPaid = Factura::isPaid;
        List<Factura> facturas = (List<Factura>) repository.findAll();
        return facturas.stream().filter(isPaid).collect(Collectors.toList());

    }

    @Override
    public Factura findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Factura save(Factura factura) {
        return repository.save(factura);
    }

    @Override
    public void delete(Factura factura) {
        repository.delete(factura);
    }
}
