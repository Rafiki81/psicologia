package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Psicologo;

public interface PsicologoService {

    Psicologo findById(Long id);
    Psicologo login(String email, String password);
    Psicologo save(Psicologo psicologo);
    void delete(Psicologo psicologo);

}
