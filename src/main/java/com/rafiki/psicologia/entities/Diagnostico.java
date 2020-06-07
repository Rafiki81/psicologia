package com.rafiki.psicologia.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long idCliente;
    private long idPsicologo;
    private String antecedentes;
    private String situacionActual;
    private String diagnostico;

}
