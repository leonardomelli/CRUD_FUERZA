package com.fuerza.fuerza.controller;


import com.fuerza.fuerza.model.Funcionario;
import com.fuerza.fuerza.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class FuncionarioController {


    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public ResponseEntity<List<Funcionario>> getAll(){
        return ResponseEntity.ok(funcionarioRepository.findAll());

    }


    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getById(@PathVariable Long id){
        return funcionarioRepository.findById(id)
                .map(resposta -> ResponseEntity.ok(resposta))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Funcionario> post(@Valid @RequestBody Funcionario funcionario){
     return ResponseEntity.status(HttpStatus.CREATED)
        .body(funcionarioRepository.save(funcionario));
    }
}
