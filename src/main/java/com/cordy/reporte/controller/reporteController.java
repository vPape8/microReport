package com.cordy.reporte.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cordy.reporte.DTO.ReporteDTO;
import com.cordy.reporte.service.ReporteService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/api/reporte")
@RequiredArgsConstructor
@Tag(name = "Reporte", description = "Obtener reportes de boletas")
public class reporteController {
     
    private final ReporteService reporteService;

    @Operation(summary = "Obtener reportes de boletas",description = "Obtener reportes de boletas")
    @GetMapping("/GetReporte")
    public ResponseEntity<CollectionModel<EntityModel<ReporteDTO>>> obtenerReportes(){
        List<ReporteDTO> reportes = reporteService.obtenerDatosReporte();
        List<EntityModel<ReporteDTO>> modelos = reportes.stream()
            .map(r -> EntityModel.of(r,
                linkTo(methodOn(reporteController.class).obtenerReportesPorFuncionario(r.getId())).withRel("porFuncionario")
            ))
            .collect(Collectors.toList());
        return ResponseEntity.ok(CollectionModel.of(modelos));
    }

    @Operation(summary = "Obtener reportes de boletas por funcionario",description = "Obtener reportes de boletas por ID de funcionario")
    @GetMapping("/GetReporte/funcionario/{idFuncionario}")
    public ResponseEntity<List<ReporteDTO>> obtenerReportesPorFuncionario(
            @PathVariable Integer idFuncionario){
        List<ReporteDTO> reportes = reporteService.obtenerDatosReportePorFuncionario(idFuncionario);
        return ResponseEntity.ok(reportes);
    }
    
}
