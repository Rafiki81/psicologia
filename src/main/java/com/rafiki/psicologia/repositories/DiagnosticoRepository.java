package com.rafiki.psicologia.repositories;

import com.rafiki.psicologia.entities.Diagnostico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DiagnosticoRepository extends CrudRepository<Diagnostico,Long> {

}
