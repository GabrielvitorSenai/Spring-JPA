package com.senai.appalunodb.service;

import org.springframework.stereotype.Service;

import com.senai.appalunodb.dto.AlunoDTO;
import com.senai.appalunodb.model.Aluno;
import com.senai.appalunodb.repository.AlunoRepository;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    // Injeção de dependência via construtor
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    
    //CRUD - Create, Read, Update, Delete

    // Criação do método para criar um novo aluno (Usando o nome e email como parâmetros)
    //public void criarAluno(String nome, String email) {
        // Aqui você pode adicionar lógica de validação por exemplo, para verificar se o nome e email são válidos
        //if (nome == null || nome.isEmpty()) {
            //throw new IllegalArgumentException("O nome do aluno não pode ser vazio.");
        //}
        
        //Aluno aluno = new Aluno(nome, email);
       // alunoRepository.save(aluno);
    //}
    
    //Criação do método para criar um novo aluno(Usando o DTO como parâmetro)
    public AlunoDTO criarAluno(AlunoDTO alunoDTO) {

        Aluno entity = new Aluno(alunoDTO.nome(), alunoDTO.email());
        
        Aluno alunoSalvo = alunoRepository.save(entity);

        return new AlunoDTO(entity.getId(), entity.getNome(), entity.getEmail());
       
    }
}
