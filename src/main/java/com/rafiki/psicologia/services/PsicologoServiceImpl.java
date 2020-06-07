package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Psicologo;
import com.rafiki.psicologia.repositories.PsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.Predicate;

public class PsicologoServiceImpl implements PsicologoService {

    @Autowired
    PsicologoRepository repository;

    @Override
    public Psicologo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Psicologo login(String email, String password) {
        Predicate<Psicologo> emailMatch = p ->p.getEmail().equals(email);
        Predicate<Psicologo> passwordMatch = p ->p.getPassword().equals(password);
        List<Psicologo> psicologos = (List<Psicologo>)repository.findAll();
        return psicologos.stream().filter(emailMatch).filter(passwordMatch).findFirst().orElse(null);
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
