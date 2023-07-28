package com.guerradev.schoolboard.model;

import com.guerradev.schoolboard.Enum.Curso;
import com.guerradev.schoolboard.Enum.Status;
import jakarta.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "CURSO", nullable = false)
    @Enumerated(EnumType.STRING)
    private Curso curso;
    @Column(name = "MATRICULA", nullable = false, length = 12, unique = true)
    private String matricula;
    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "TURNO", nullable = false)
    private String turno;

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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
