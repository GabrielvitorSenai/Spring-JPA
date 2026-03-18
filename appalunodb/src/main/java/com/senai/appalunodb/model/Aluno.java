package com.senai.appalunodb.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos") // Permite um nome de tabela diferente do nome da classe, se necessário
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    
    private Long id;
    private String nome;
    private String email;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com parâmetros
    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
       
    }
        

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
