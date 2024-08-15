package lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double porHora = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();
        double salario = horas * porHora;

        double prct = 0;
        if (salario >= 2500) prct = 0.2;
        else if (salario >= 1500) prct = 0.1;
        else if (salario >= 900) prct = 0.05;

        double IR = salario * prct;
        double INSS = salario * 0.1;
        double FGTS = salario * 0.11;
        System.out.printf("+ Salário bruto (%.2f * %.2f) : R$%.2f\n", porHora, horas, salario);
        System.out.printf("- IR (%.0f%%): R$%.2f\n", prct * 100, IR);
        System.out.println("- INSS (10%): R$" + INSS);
        System.out.println("FGTS (11%): R$" + FGTS);
        System.out.println("Total de Descontos: R$" + IR + INSS);
        System.out.println("= Salário liquido: R$" + (salario - IR - INSS));

        scanner.close();
    }
}