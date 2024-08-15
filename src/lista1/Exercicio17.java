package lista1;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor, total = 0;
        int atraso, quantidade = 0;

        do {
            System.out.print("\nDigite o valor de cada prestação: ");
            valor = scanner.nextDouble();
            System.out.print("Digite o número de dias em atraso: ");
            atraso = scanner.nextInt();

            if (valor > 0 && atraso >= 0) {
                total += valorPagamento(valor, atraso);
                quantidade++;
            }

        } while (valor != 0);

        System.out.println("\nRelatório do dia");
        System.out.println("Quantidade de prestações pagas: " + quantidade);
        System.out.printf("Valor total de prestações pagas: R$%.2f", total);

        scanner.close();
    }

    public static double valorPagamento(double valor, int atraso) {
        double multa = 0;
        if (atraso > 0) multa = 0.03 + atraso * 0.001;

        return valor * (1 + multa);
    }
}
