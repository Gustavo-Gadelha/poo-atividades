package atividade7.model;

public class Cuidador extends Pessoa {

    final int quantidadeDeAnimais;

    public Cuidador(String nome, int idade, String documento, int quantidade) {
        super(nome, idade, documento);
        this.quantidadeDeAnimais = quantidade;
    }

}
