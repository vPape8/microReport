package com.cordy.reporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cordy.reporte.model.Puerto;

@Repository
public interface PuertoRepository extends JpaRepository<Puerto, Integer> {

}
