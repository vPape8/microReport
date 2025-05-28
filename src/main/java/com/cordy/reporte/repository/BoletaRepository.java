package com.cordy.reporte.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cordy.reporte.model.Boleta;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, String> {
}