package atividade4.main;

import atividade4.model.Animal;
import atividade4.model.Casa;
import atividade4.model.Pessoa;
import atividade4.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Questão 1 ====================================================================================
        System.out.println("Questão 1");
        Pessoa pessoa1 = new Pessoa("Carlos", "111.111.111-11", 21, 178, 82);
        Pessoa pessoa2 = new Pessoa("João", "222.222.222-22", 36, 190, 97);
        Pessoa pessoa3 = new Pessoa("Maria", "333.333.333-33", 12, 167, 68);
        Pessoa pessoa4 = new Pessoa("José", "444.444.444-44", 27, 195, 93);

        pessoa1.digaOi();
        System.out.printf("%s nasceu em %d\n", pessoa1.nome, pessoa1.calcularAnoDeNascimento());

        // Questão 2 ====================================================================================
        System.out.println("\nQuestão 2");
        Veiculo carro1 = new Veiculo("Vermelho", "QTP5F71", 4);
        Veiculo carro2 = new Veiculo("Azul", "CXZ7B41", 4);
        Veiculo moto1 = new Veiculo("Preta", "BOK3C58", 2);
        Veiculo moto2 = new Veiculo("Branca", "MSK9B10", 2);
        Veiculo moto3 = new Veiculo("Laranja", "MSK9B10", 2);

        carro1.acelerar(100);
        moto1.pintarVeiculo("Amarelo");

        // Questão 3 ====================================================================================
        System.out.println("\nQuestão 3");
        Animal cachorro = new Animal("Bilu", 6, 30, 15);
        Animal gato = new Animal("Miau", 3, 25, 5);

        cachorro.dormir();
        gato.falar();

        // Questão 4 ====================================================================================
        System.out.println("\nQuestão 4");
        Casa casa = new Casa(4, 5, 2);
        casa.adicionarPessoa(pessoa1, pessoa2, pessoa3, pessoa4);
        casa.adicionarVeiculo(carro1, carro2, moto1, moto2, moto3);
        casa.adicionarAnimal(cachorro, gato);

        System.out.println(casa);
    }
}