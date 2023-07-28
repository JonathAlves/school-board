package com.guerradev.schoolboard.repositories;

import com.guerradev.schoolboard.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
