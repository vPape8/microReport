package com.cordy.reporte.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReporteDTO {
    private Integer id; // Funcionario ID
    private String nombre;
    private String appaterno; 
    private String idBoleta;
    private String nombreBuque;
    private Double monto;
    private String nombre_puerto;
    private Date fecha_emision;

}
