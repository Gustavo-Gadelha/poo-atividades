package lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o 2° número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o 3° número: ");
        double num3 = scanner.nextDouble();

        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println("Todos os números são iguais");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("O 1° número é o maior número");
            if (num2 > num3) System.out.println("O 3° número é o menor número");
            else System.out.println("O 2° número é o menor número");
        } else if (num2 > num3) {
            System.out.println("O 2° número é o maior número");
            if (num1 > num3) System.out.println("O 3° número é o menor número");
            else System.out.println("O 1° número é o menor número");
        } else {
            System.out.println("O 3° número é o maior número");
            if (num1 > num2) System.out.println("O 2° número é o menor número");
            else System.out.println("O 1° número é o menor número");
        }

        scanner.close();
    }
}
