package com.guerradev.schoolboard.Enum;

public enum Turno {
    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite"),
    INTEGRAL("Integral");

    private String turno;

    private Turno(String turno){
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
}
