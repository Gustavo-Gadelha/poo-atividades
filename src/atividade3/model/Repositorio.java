package atividade3.model;

public class Repositorio {

    public final String nome;
    public final String descricao;
    public boolean publico;

    public Repositorio(String nome, String descricao, boolean publico) {
        this.descricao = descricao;
        this.nome = nome;
        this.publico = publico;
    }

    public void mudarVisibilidade() {
        this.publico = !this.publico;
    }

}
