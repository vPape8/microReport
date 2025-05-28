package com.cordy.reporte.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cordy.reporte.DTO.ReporteDTO;
import com.cordy.reporte.service.ReporteService;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/api/reporte")
@RequiredArgsConstructor
public class reporteController {
     
    private final ReporteService reporteService;
    
    @GetMapping("/GetReporte")
    public ResponseEntity<List<ReporteDTO>> obtenerReportes(){
        List<ReporteDTO> reportes = reporteService.obtenerDatosReporte();
        return ResponseEntity.ok(reportes);
    }

    @GetMapping("/GetReporte/funcionario/{idFuncionario}")
    public ResponseEntity<List<ReporteDTO>> obtenerReportesPorFuncionario(
            @PathVariable Integer idFuncionario){
        List<ReporteDTO> reportes = reporteService.obtenerDatosReportePorFuncionario(idFuncionario);
        return ResponseEntity.ok(reportes);
    }
    
}
