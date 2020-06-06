package com.rafiki.psicologia.repositories;

import com.rafiki.psicologia.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {

}
