package lista2;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double porHora = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();

        double salario = horas * porHora;
        double IR = salario * 0.11;
        double INSS = salario * 0.08;
        double sindicato = salario * 0.05;

        System.out.println("+ Salário bruto: R$" + salario);
        System.out.println("- IR (11%): R$" + IR);
        System.out.println("- INSS (8%): R$" + INSS);
        System.out.println("- Sindicato (5%): R$" + sindicato);
        System.out.println("= Salário liquido: R$" + (salario - IR - INSS - sindicato));
    }
}