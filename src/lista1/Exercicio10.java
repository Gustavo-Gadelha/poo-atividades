package lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para exibir sua tabuada: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada de " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        scanner.close();
    }
}
