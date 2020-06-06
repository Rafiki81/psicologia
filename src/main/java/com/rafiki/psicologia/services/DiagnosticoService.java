package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Diagnostico;

import java.util.List;

public interface DiagnosticoService {

    List<Diagnostico> findAll();
    List<Diagnostico> findByIdCliente(long id);
    Diagnostico findById(Long id);
    Diagnostico save(Diagnostico diagnostico);
    void delete(Diagnostico diagnostico);

}
