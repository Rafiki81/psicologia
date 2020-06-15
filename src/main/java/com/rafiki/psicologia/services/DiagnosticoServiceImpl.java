package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Diagnostico;
import com.rafiki.psicologia.entities.Factura;
import com.rafiki.psicologia.repositories.DiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DiagnosticoServiceImpl implements DiagnosticoService {
    @Autowired
    DiagnosticoRepository repository;

    @Override
    public List<Diagnostico> findAll() {
        return (List<Diagnostico>) repository.findAll();
    }

    @Override
    public List<Diagnostico> findByIdCliente(long id) {
        List<Diagnostico> diagnosticos = (List<Diagnostico>) repository.findAll();
        return diagnosticos.stream().filter(x -> x.getIdCliente()==id).collect(Collectors.toList());
    }

    @Override
    public Diagnostico findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Diagnostico save(Diagnostico diagnostico) {
        return repository.save(diagnostico);
    }

    @Override
    public void delete(Diagnostico diagnostico) {
        repository.delete(diagnostico);
    }
}
