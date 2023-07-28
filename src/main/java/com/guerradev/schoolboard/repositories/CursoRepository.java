package com.guerradev.schoolboard.repositories;

import com.guerradev.schoolboard.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
