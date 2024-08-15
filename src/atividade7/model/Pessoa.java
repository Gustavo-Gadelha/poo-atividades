package atividade7.model;

public abstract class Pessoa {

    public final String nome;
    public final int idade;
    public final String documento;

    public Pessoa(String nome, int idade, String documento) {
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
    }


}
