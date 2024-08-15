package lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("É um número positivo");
        } else if (num < 0) {
            System.out.println("É um número negativo");
        } else {
            System.out.println("É nulo");
        }

        scanner.close();
    }
}
