package lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double[] saltos = new double[5];
        double maior = 0, menor = 0, soma = 0;

        System.out.print("Atleta: ");
        nome = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d° Salto: ", i + 1);
            saltos[i] = scanner.nextDouble();
            if (saltos[i] > maior) maior = saltos[i];
            if (saltos[i] < menor || i == 0) menor = saltos[i];
            soma += saltos[i];
        }

        System.out.println("Melhor salto: " + maior);
        System.out.println("Pior salto: " + menor);
        System.out.println("Media de saltos: " + (soma / 5));
        System.out.println("\nResultado \n" + nome + ": " + (soma / 5));

        scanner.close();
    }
}
