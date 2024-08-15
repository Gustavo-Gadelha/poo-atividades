package lista1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número termos: ");
        int termos = scanner.nextInt();

        for (int linha = 1; linha <= termos; linha++) {
            for (int num = 1; num <= linha; num++) System.out.print(num + " ");
            System.out.println();
        }

        scanner.close();
    }
}
