package com.rafiki.psicologia.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date fechaFactura;
    private double importe;
    private int numeroCitas;
    private long idCliente;
    private boolean isPaid;

}
