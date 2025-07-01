package com.cordy.reporte.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "buque")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Buque {

    @Id
    private String cod_buque;

    @Column(nullable = false)
    private float eslora;

    @Column(nullable = false)
    private Date fecha_llegada;

    @Column(nullable = false)
    private Date fecha_partida;
    
    @Column(nullable = false)
    private String nombreBuque;
}
