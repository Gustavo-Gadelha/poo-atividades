package atividade7.model;

public class Guarda extends Pessoa {

    public final int nivelDeAcesso;

    public Guarda(String nome, int idade, String documento, int nivel) {
        super(nome, idade, documento);
        this.nivelDeAcesso = nivel;
    }
}
