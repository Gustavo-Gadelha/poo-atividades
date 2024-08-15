package lista1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int termos = scanner.nextInt();

        double H = 0;
        for (int i = 1; i <= termos; i++) H += (double) 1 / i;
        System.out.printf("H = %.4f", H);

        scanner.close();
    }
}
