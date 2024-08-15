package atividade7.model;

import java.time.LocalTime;

public class Visitante extends Pessoa {

    public final LocalTime tempoPermanencia;

    public Visitante(String nome, int idade, String documento, LocalTime tempo) {
        super(nome, idade, documento);
        this.tempoPermanencia = tempo;
    }

}
