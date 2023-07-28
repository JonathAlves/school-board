package com.guerradev.schoolboard.Enum;

public enum Curso {
    ADMINISTRACAO("Administracao"),
    CIENCIA_DA_COMPUTACAO("Ciencia da Computacao"),
    NUTRICAO("Nutricao"),
    MEDICINA("Medicina"),
    DIREITO("Direito"),
    JOGOS_DIGITAIS("Jogos Digitais"),
    ENFERMAGEM("Enfermagem"),
    GESTAO_PUBLICA("Gestao Publica"),
    GEOGRAFIA("Geografia"),
    ENGENHARIA_DE_SOFTWARE("Engenharia de software");

    private String curso;

    private Curso(String curso){
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
