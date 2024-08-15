package atividade13.model;


import atividade13.model.ambiente.Ambiente;

public class Zoologico {
    public final String nome;
    public final String endereco;
    public final int quantidadeDeFuncionarios;
    public final double areaHectares;
    public final Ambiente[] ambientes;

    public Zoologico(String nome, String endereco, int quantidadeDeFuncionarios, double areaEmHectares, int quantidadeDeAmbientes) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
        this.areaHectares = areaEmHectares;
        this.ambientes = new Ambiente[quantidadeDeAmbientes];
    }

    public boolean temEspacoVetor() {
        for (int i = 0; i < this.ambientes.length; i++) {
            if (this.ambientes[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void exibirTotalDeAnimais() {
        int total = 0;
        for (int i = 0; i < this.ambientes.length; i++) {
            if (this.ambientes[i] != null) {
                total += this.ambientes[i].totalOcupado();
            }
        }
        System.out.println("Total de animais neste Zoologico: " + total);
    }

    public void adicionarAmbiente(Ambiente ambiente) {
        if (!this.temEspacoVetor()) {
            System.out.println("Lista de ambientes lotada!");
        } else {
            for (int i = 0; i < this.ambientes.length; i++) {
                if (this.ambientes[i] == null) {
                    this.ambientes[i] = ambiente;
                    return;
                } else if (this.ambientes[i] == ambiente) {
                    System.out.println("Ambiente já está na lista");
                    return;
                }
            }
        }
    }

    public void removerAmbiente(Ambiente ambiente) {
        for (int i = 0; i < this.ambientes.length; i++) {
            if (this.ambientes[i] == ambiente) {
                this.ambientes[i] = null;
                return;
            }
        }
        System.out.println("Ambiente não encontrado!");
    }

    public void exibirInfo() {
        System.out.println("\nNome do zoologico: " + this.nome);
        System.out.println("Endereço do zoologico: " + this.endereco);
        System.out.printf("Area em hectares do zoologico: %.2f hectares\n\n", this.areaHectares);
    }
}
