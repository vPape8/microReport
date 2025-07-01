package com.cordy.reporte.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cordy.reporte.model.Buque;

@Repository
public interface BuqueRepository extends JpaRepository<Buque, String>{
}

