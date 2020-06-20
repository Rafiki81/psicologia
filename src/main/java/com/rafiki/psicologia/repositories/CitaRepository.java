package com.rafiki.psicologia.repositories;

import com.rafiki.psicologia.entities.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends CrudRepository<Cita,Long> {

}
