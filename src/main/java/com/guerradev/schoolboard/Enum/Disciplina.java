package com.guerradev.schoolboard.Enum;

public enum Disciplina {
    PORTUGUES_INSTRUMENTAL("Portugues"),
    CALCULO_1("Calculo 1"),
    CALCULO_2("Calculo 2"),
    CALCULO_3("Calculo 3"),
    MATEMATICA_DISCRETA("Matematica Discreta"),
    ALGORITMOS("Algoritmos"),
    LOGICA_DE_PROGRAMACAO("Logica de programacao"),
    ESTRUTURA_DE_DADOS("Estrutura de dados"),
    DIREITO_CONSTITUCIONAL("Direito Constitucional"),
    ESTATISTICA("Estatistica"),
    LINGUAGEM_DE_PROGRAMACAO_1("Linguagem de programacao 1"),
    LINGUAGEM_DE_PROGRAMACAO_2("Linguagem de programacao 2"),
    LINGUAGEM_DE_PROGRAMACAO_3("Linguagem de programacao 3"),
    TCC_1("Tcc 1"),
    TCC_2("Tcc 2"),
    METODOLOGIA_CIENTIFICA("Metodologia Cientifica"),
    INGLES_INSTRUMENTAL("Ingles Instrumental"),
    LABORATORIO_DE_PROGRAMACAO_1("Laboratorio de Programacao 1"),
    LABORATORIO_DE_PROGRAMACAO_2("Laboratorio de Programacao 2"),
    LABORATORIO_DE_PROGRAMACAO_3("Laboratorio de Programacao 3");

    private String disciplina;

    private Disciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
