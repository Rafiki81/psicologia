package com.rafiki.psicologia.services;

import com.rafiki.psicologia.entities.Cita;
import com.rafiki.psicologia.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Service
public class CitaServiceImpl implements CitaService {
    @Autowired
    CitaRepository repository;


    @Override
    public List<Cita> findAll() {
        return (List<Cita>) repository.findAll();
    }

    @Override
    public List<Cita> findByIdCliente(long id) {

        List<Cita> citas = (List<Cita>) repository.findAll();
        Predicate<Cita> idCLienteMatch = p -> p.getClienteId() == id;
        return citas.stream().filter(idCLienteMatch).collect(Collectors.toList());
    }

    @Override
    public List<Cita> findByDate(Date date) {
        List<Cita> citas = (List<Cita>) repository.findAll();
        Predicate<Cita> dateMatch = p -> p.getFechaEntrada().equals(date);
        return citas.stream().filter(dateMatch).collect(Collectors.toList());
    }

    @Override
    public Cita findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Cita save(Cita cita) {
        return repository.save(cita);
    }

    @Override
    public void delete(Cita cita) {

        repository.delete(cita);

    }
}
