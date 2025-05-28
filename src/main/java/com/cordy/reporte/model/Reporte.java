package com.cordy.reporte.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "reporte")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reporte {

    @Column(nullable=false)
    private String codigo;

    @Column(nullable=false)
    private String descripcion;

    @Column(nullable=false)
    private String fecha;

    @Column(nullable=false)
    private String codigoFuncionario;

}
