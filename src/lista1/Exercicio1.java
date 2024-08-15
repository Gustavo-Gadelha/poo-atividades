package lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o 2° número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("o 1° número é maior que o 2° número!");
        } else {
            System.out.println("O 2° número é maior que o 1° número!");
        }

        scanner.close();
    }
}
