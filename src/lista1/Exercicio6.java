package lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite em que turno você estuda: ");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        char turno = scanner.nextLine().charAt(0);

        switch (turno) {
            case 'M', 'm' -> System.out.println("Bom dia!");
            case 'V', 'v' -> System.out.println("Boa tarde!");
            case 'N', 'n' -> System.out.println("Boa noite!");
            default -> System.out.println("Valor inválido");
        }

        scanner.close();
    }
}
