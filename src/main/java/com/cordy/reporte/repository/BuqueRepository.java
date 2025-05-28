package com.cordy.reporte.repository;


import com.cordy.bol.model.Buque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuqueRepository extends JpaRepository<Buque, String>{
}

