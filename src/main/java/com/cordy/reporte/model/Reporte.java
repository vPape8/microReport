package com.cordy.reporte.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "reporte")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reporte {

    @Id
    private String codigo;

    @Column(nullable=false)
    private String descripcion;

    @Column(nullable=false)
    private String fecha;

    @Column(nullable=false)
    private String codigoFuncionario;

    @ManyToOne
    @JoinColumn(name = "id_funcionario", nullable = false)
    private Funcionario funcionario;

}
