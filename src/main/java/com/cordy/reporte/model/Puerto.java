package com.cordy.reporte.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Puerto")
@NoArgsConstructor
@AllArgsConstructor

public class Puerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_puerto;
    
    @Column(nullable=false)
    private boolean dispo;

    @Column
    private String nombre_puerto;

    @Column(nullable=false)
    private float tarifa_hora;

    @Column
    private float tarifa_eslora;


}