package com.cordy.reporte.repository;

import com.cordy.bol.model.Puerto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuertoRepository extends JpaRepository<Puerto, Integer> {

}
