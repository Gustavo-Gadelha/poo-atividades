package lista1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Montar tabuada de: ");
        int num = scanner.nextInt();
        System.out.print("Começar por: ");
        int start = scanner.nextInt();
        System.out.print("Terminar em: ");
        int end = scanner.nextInt();

        System.out.printf("\nVou montar a tabuada do %d começando em %d e terminando em %d: \n", num, start, end);
        for (int mult = start; mult <= end; mult++) {
            System.out.printf("%d x %d = %d\n", num, mult, num * mult);
        }

        scanner.close();
    }
}
