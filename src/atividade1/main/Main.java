package atividade1.main;


import atividade1.model.Casa;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua Castelo Branco", 5, 21, 250);

        System.out.println("Endereço: " + casa.endereco);
        System.out.println("Quantidade de quartos: " + casa.quantidadeDeQuartos);
        System.out.println("Número da casa: " + casa.numero);
        System.out.println("Area do terreno: " + casa.areaDoTerreno);
    }
}