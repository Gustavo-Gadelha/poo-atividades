package lista1;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] respostas = new boolean[5];

        System.out.println("Telefonou para vítima? (true/false)");
        respostas[0] = scanner.nextBoolean();
        System.out.println("Esteve no local do crime? (true/false)");
        respostas[1] = scanner.nextBoolean();
        System.out.println("Mora perto da vítima? (true/false)");
        respostas[2] = scanner.nextBoolean();
        System.out.println("Devia para a vítima? (true/false)");
        respostas[3] = scanner.nextBoolean();
        System.out.println("Já trabalhou com a vítima? (true/false)");
        respostas[4] = scanner.nextBoolean();

        int contador = 0;
        for (boolean resposta : respostas) if (resposta) contador++;

        switch (contador) {
            case 5 -> System.out.println("Assasino!");
            case 3, 4 -> System.out.println("Cumplice!");
            case 2 -> System.out.println("Suspeito!");
            default -> System.out.println("Inocente!");
        }

        scanner.close();
    }
}
