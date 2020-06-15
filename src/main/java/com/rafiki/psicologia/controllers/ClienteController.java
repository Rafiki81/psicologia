package com.rafiki.psicologia.controllers;

import com.rafiki.psicologia.entities.Cliente;
import com.rafiki.psicologia.repositories.ClienteRepository;
import com.rafiki.psicologia.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping("/clientes")
    List<Cliente> all() {
        return service.findAll();
    }

}
