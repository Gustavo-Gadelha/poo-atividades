package atividade9.main;


import atividade9.model.Carro;
import atividade9.model.Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("123-AB123", "Honda", 1200, 0);
        Moto motoNull = new Moto();

        Carro carro = new Carro("123-AB123", "Ford", 2800, 0);
        Carro carroNull = new Carro();

        // getters e setters de Moto
        motoNull.setPlaca("321-BA321");
        motoNull.setMarca("Toyota");
        motoNull.setValor(2000);
        motoNull.setVelocidade(0);
        System.out.println("Moto null" +
                "\nPlaca: " + motoNull.getPlaca() +
                "\nMarca: " + motoNull.getMarca() +
                "\nValor: " + motoNull.getValor() +
                "\nVelocidade: " + motoNull.getVelocidade() + "\n"
        );

        // getters e setters de Carro
        carroNull.setPlaca("321-BA321");
        carroNull.setMarca("Volkswagen");
        carroNull.setValor(3000);
        carroNull.setVelocidade(0);
        System.out.println("Carro null" +
                "\nPlaca: " + carroNull.getPlaca() +
                "\nMarca: " + carroNull.getMarca() +
                "\nValor: " + carroNull.getValor() +
                "\nVelocidade: " + carroNull.getVelocidade() + "\n"
        );

        // Métodos de moto
        System.out.println("\nMétodos de Moto");
        moto.acelerar(10);
        moto.frear();
        moto.passarMarcha(2);

        // Métodos únicos de moto
        moto.empinar();

        // Métodos de Carro
        System.out.println("\nMétodos de Carro");
        carro.acelerar(10);
        carro.frear();
        carro.passarMarcha(2);

        // Métodos únicos de Carro
        carro.abrirPorta(3);
        carro.abrirPortaMala();

    }
}