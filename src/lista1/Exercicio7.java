package lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        double aumento;
        if (salario < 280) aumento = 0.2;
        else if (salario < 700) aumento = 0.15;
        else if (salario < 1500) aumento = 0.1;
        else aumento = 0.05;

        System.out.println("Salário antes do reajuste: " + salario);
        System.out.printf("Percentual do reajuste: %.0f%% \n", (aumento * 100));
        System.out.println("Valor do aumento: " + (salario * aumento));
        System.out.println("Novo salário, após o aumento: " + (salario * (aumento + 1)));

        scanner.close();
    }
}
