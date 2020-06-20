package com.rafiki.psicologia.repositories;

import com.rafiki.psicologia.entities.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {

}
