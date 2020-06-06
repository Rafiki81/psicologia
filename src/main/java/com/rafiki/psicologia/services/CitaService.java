package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Cita;
import com.rafiki.psicologia.entities.Diagnostico;

import java.util.Date;
import java.util.List;

public interface CitaService {

    List<Cita> findAll();
    List<Cita> findByIdCliente(long id);
    List<Cita> findByDate(Date date);
    Cita findById(Long id);
    Cita save(Cita cita);
    void delete(Cita cita);


}
