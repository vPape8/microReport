package com.cordy.reporte.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="boleta")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Boleta {

    @Id
    private String idBoleta;

    @Column(name="monto")
    private double monto;

    @Column(name="fecha_emision")
    private Date fecha_emision;

}
