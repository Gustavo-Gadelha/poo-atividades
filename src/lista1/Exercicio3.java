package lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.print("Reprovado");
        }

        scanner.close();
    }
}
