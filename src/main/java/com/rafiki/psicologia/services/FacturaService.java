package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Factura;

import java.util.List;

public interface FacturaService {

    List<Factura> findAll();
    List<Factura> findByIdCliente(long id);
    List<Factura> findUnpaid();
    Factura findById(Long id);
    Factura save(Factura factura);
    void delete(Factura factura);

}
