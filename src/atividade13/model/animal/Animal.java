package atividade13.model.animal;

public abstract class Animal {
    public final String nome;
    public final String especie;
    public final String genero;
    public final int idade;
    public final double pesoKg;

    public Animal(String nome, String especie, String genero, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.genero = genero;
        this.idade = idade;
        this.pesoKg = peso;
    }

    public abstract void comer();

    public abstract void dormir();

    public abstract void falar();

    public void exibirNome() {
        System.out.printf("O nome animal é \"%s\"\n", this.nome);
    }
}
