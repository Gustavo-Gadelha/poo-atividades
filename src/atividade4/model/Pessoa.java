package atividade4.model;

import java.time.LocalDate;

public class Pessoa {
    public final String nome;
    public final String cpf;
    public final int idade;
    public final double alturaEmCentimetros;
    public final double pesoEmKilogramas;

    public Pessoa(String nome, String cpf, int idade, double altura, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.alturaEmCentimetros = altura;
        this.pesoEmKilogramas = peso;
    }

    public int calcularAnoDeNascimento() {
        return LocalDate.now().getYear() - this.idade;
    }

    public void digaOi() {
        System.out.printf("%s disse oi\n", this.nome);
    }
}
