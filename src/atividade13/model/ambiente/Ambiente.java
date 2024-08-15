package atividade13.model.ambiente;

import atividade13.model.animal.Animal;

public abstract class Ambiente {
    public final String nome;
    public final double areaOcupada;
    public final Animal[] animais;

    public Ambiente(String nome, double areaOcupada, int quantidadeDeAnimais) {
        this.nome = nome;
        this.areaOcupada = areaOcupada;
        this.animais = new Animal[quantidadeDeAnimais];
    }

    public void adicionarAnimal(Animal animal) {
        for (int i = 0; i < this.animais.length; i++) {
            if (this.animais[i] == null) {
                this.animais[i] = animal;
                System.out.printf("Animal \"%s\" da especie \"%s\" adicionado ao ambiente\n", animal.nome, animal.especie);
                return;
            } else if (this.animais[i] == animal) {
                System.out.println("O animal já está neste ambiente");
                return;
            }
        }
        System.out.println("Ambiente lotado!");
    }

    public void removerAnimal(Animal animal) {
        for (int i = 0; i < this.animais.length; i++) {
            if (this.animais[i] == animal) {
                this.animais[i] = null;
                return;
            }
        }
        System.out.println("Animal não encontrado!");
    }

    public int totalOcupado() {
        int total = 0;
        for (int i = 0; i < this.animais.length; i++) {
            if (this.animais[i] != null) {
                total++;
            }
        }
        return total;
    }
}
