package com.guerradev.schoolboard.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME", nullable = false)
    private String nome;
    @ElementCollection(targetClass = String.class, fetch = FetchType.LAZY)
    @CollectionTable(name = "DISCIPLINA", joinColumns = @JoinColumn(name = "curso_id"))
    @Column(name = "DISCIPLINA", nullable = false)
    private List<String> disciplinas = new ArrayList<>();

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

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
