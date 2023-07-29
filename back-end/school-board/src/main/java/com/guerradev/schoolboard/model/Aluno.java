package com.guerradev.schoolboard.model;

import com.guerradev.schoolboard.Enum.Status;
import jakarta.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "curso", nullable = false)
    private Long cursoId;
    @Column(name = "matricula", nullable = false, length = 12, unique = true)
    private String matricula;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "turno", nullable = false)
    private String turno;

}
