package com.rafiki.psicologia.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date fechaEntrada;
    private Date fechaSalida;
    private long psicologoId;
    private long clienteId;
    private String resumen;
}
