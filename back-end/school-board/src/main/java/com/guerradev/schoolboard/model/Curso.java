package com.guerradev.schoolboard.model;

import com.guerradev.schoolboard.Enum.Turno;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "turno")
    private Turno turno;


}
