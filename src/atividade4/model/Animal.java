package atividade4.model;

public class Animal {
    final String nome;
    final int idade;
    final double alturaEmCentimetros;
    final double pesoEmKilogramas;

    public Animal(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.alturaEmCentimetros = altura;
        this.pesoEmKilogramas = peso;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public void falar() {
        System.out.println("O animal fez um som");
    }
}
