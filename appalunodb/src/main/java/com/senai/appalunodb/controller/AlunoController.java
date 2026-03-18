package com.senai.appalunodb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.appalunodb.dto.AlunoDTO;
import com.senai.appalunodb.service.AlunoService;


@RestController
@RequestMapping("/alunos") // Define a rota base para os endpoints relacionados a alunos
public class AlunoController {
    private final AlunoService alunoService;

    // Injeção de dependência via construtor
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // Endpoint para criar um novo aluno usando o DTO como parâmetro
    @PostMapping("/salvar")
    public ResponseEntity<AlunoDTO> criarAluno(@RequestBody AlunoDTO alunoDTO) {
        AlunoDTO alunoSalvo = alunoService.criarAluno(alunoDTO);

        
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
    }
    

}
