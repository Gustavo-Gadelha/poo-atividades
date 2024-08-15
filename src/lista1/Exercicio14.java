package lista1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número termos: ");
        int termos = scanner.nextInt();

        for (int linha = 1; linha <= termos; linha++) {
            for (int num = 1; num <= linha; num++) System.out.print(linha + " ");
            System.out.println();
        }

        scanner.close();
    }
}
