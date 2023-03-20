package com.fuerza.fuerza.repository;

import com.fuerza.fuerza.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository  <Cliente,Long>{
}
