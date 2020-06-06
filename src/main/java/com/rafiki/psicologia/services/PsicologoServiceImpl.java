package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Psicologo;
import com.rafiki.psicologia.repositories.PsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PsicologoServiceImpl implements PsicologoService {
    @Autowired
    PsicologoRepository repository;

    @Override
    public Psicologo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Psicologo save(Psicologo psicologo) {
        return repository.save(psicologo);
    }

    @Override
    public void delete(Psicologo psicologo) {
        repository.delete(psicologo);
    }
}
