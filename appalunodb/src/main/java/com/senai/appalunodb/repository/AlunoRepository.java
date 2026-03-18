package com.senai.appalunodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.appalunodb.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
