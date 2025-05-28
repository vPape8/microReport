package com.cordy.reporte.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cordy.reporte.DTO.ReporteDTO;
import com.cordy.reporte.model.Boleta;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, String> {
        @Query("SELECT new com.cordy.reporte.DTO.ReporteDTO(f.id, f.nombre,f.appaterno, b.idBoleta, bu.nombreBuque, b.monto, p.nombre_puerto, b.fecha_emision) " +
           "FROM Boleta b " +
           "JOIN b.funcionario f " +
           "JOIN b.buque bu " +
           "JOIN b.puerto p")
    List<ReporteDTO> obtenerDatosParaReporte();

    @Query("SELECT new com.cordy.reporte.DTO.ReporteDTO(f.id, f.nombre, f.appaterno, b.idBoleta, bu.nombreBuque, b.monto, p.nombre_puerto, b.fecha_emision) " +
           "FROM Boleta b " +
           "JOIN b.funcionario f " +
           "JOIN b.buque bu " +
           "JOIN b.puerto p " +
           "WHERE f.id = :idFuncionario")
    List<ReporteDTO> obtenerDatosParaReportePorFuncionario(@Param("idFuncionario") Integer idFuncionario);
}