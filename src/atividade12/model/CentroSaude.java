package atividade12.model;

import atividade12.contract.ICentroSaude;

public class CentroSaude implements ICentroSaude {
    private String nome;
    private int capacidade;

    public CentroSaude(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCapacidadeArmazenamento() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public boolean temEquipamentoAdequado() {
        return (this.capacidade > 10);
    }

    @Override
    public String toString() {
        return "CentroSaude{" +
                "nome='" + nome + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
