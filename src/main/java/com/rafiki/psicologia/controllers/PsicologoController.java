package com.rafiki.psicologia.controllers;


import com.rafiki.psicologia.entities.Psicologo;
import com.rafiki.psicologia.services.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/psicologos")
@ResponseBody
public class PsicologoController {

    @Autowired
    PsicologoService service;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{psicologoId}")
    public ResponseEntity<?> findById(@PathVariable Long psicologoId){
        return new ResponseEntity<>(service.findById(psicologoId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Psicologo> save(@RequestBody Psicologo psicologo){
       return new ResponseEntity<>(service.save(psicologo),HttpStatus.OK);
    }

    @DeleteMapping("/{psicologoId}")
    public void delete(@PathVariable("psicologoId") Long psicologoId){
        service.deleteById(psicologoId);
    }

    @PutMapping("/{psicologoId}")
    public void update(@PathVariable("psicologoId") Long psicologoId, Psicologo psicologo){
        service.update(psicologoId,psicologo);
    }

}
