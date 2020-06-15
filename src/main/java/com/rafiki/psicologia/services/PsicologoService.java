package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Psicologo;

import java.util.List;

public interface PsicologoService {

    Psicologo findById(Long id);
    Psicologo login(String email, String password);
    Psicologo save(Psicologo psicologo);
    void delete(Psicologo psicologo);
    void deleteById(Long id);
    void update(Long id, Psicologo psicologo);
    List<Psicologo> findAll();
}
