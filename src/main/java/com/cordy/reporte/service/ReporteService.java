package com.cordy.reporte.service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cordy.reporte.DTO.ReporteDTO;
import com.cordy.reporte.repository.BoletaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReporteService {

    
    private final BoletaRepository boletaRepository;

    public List<ReporteDTO> obtenerDatosReporte() {
        return boletaRepository.obtenerDatosParaReporte();
    }

       public List<ReporteDTO> obtenerDatosReportePorFuncionario(Integer idFuncionario) {
        List<ReporteDTO> todos = boletaRepository.obtenerDatosParaReporte();
        return todos.stream()
                .filter(reporte -> reporte.getId().equals(idFuncionario))
                .collect(Collectors.toList());

    }
}
