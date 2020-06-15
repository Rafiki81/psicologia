package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Psicologo;
import com.rafiki.psicologia.repositories.PsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
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

        List<Psicologo> psicologos = (List<Psicologo>)repository.findAll();
        Predicate<Psicologo> emailMatch = p ->p.getEmail().equals(psicologo.getEmail());
        Predicate<Psicologo> dniMatch = p ->p.getDni().equals(psicologo.getDni());
        if(!psicologos.stream().filter(emailMatch).findFirst().equals(null) || !psicologos.stream().filter(dniMatch).findFirst().equals(null) ) {
            return null;
        }
        return repository.save(psicologo);
    }

    @Override
    public void delete(Psicologo psicologo) {
        repository.delete(psicologo);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, Psicologo psicologo) {
        repository.deleteById(id);
        repository.save(psicologo);

    }

    @Override
    public List<Psicologo> findAll() {
        return(List<Psicologo>)repository.findAll();
    }
}
