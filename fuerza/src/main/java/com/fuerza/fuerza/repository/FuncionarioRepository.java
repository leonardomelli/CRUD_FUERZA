package com.fuerza.fuerza.repository;

import com.fuerza.fuerza.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario,Long> {

}
