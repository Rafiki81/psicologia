package com.rafiki.psicologia.repositories;

import com.rafiki.psicologia.entities.Psicologo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PsicologoRepository extends CrudRepository<Psicologo,Long> {


}
