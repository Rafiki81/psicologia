package com.rafiki.psicologia.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class IndexController {

    @GetMapping("/")
    public ResponseEntity index(){

        return new ResponseEntity("Bienvenidos a la aplicacion Psicologia", HttpStatus.OK);
    }
}
