package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> lista = new ArrayList<>();
        double nota;
        do {
            System.out.print("Digite uma nota de 0 a 10, ou -1 para encerrar: ");
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) lista.add(nota);
            else if (nota != -1) System.out.println("Valor invalido!");

        } while (nota != -1);

        ArrayList<Double> rev_lista = new ArrayList<>();
        for (Double valor : lista) rev_lista.add(0, valor);

        double soma = 0;
        for (Double valor : lista) soma += valor;

        double media = soma / lista.size();

        int acima = 0, abaixo = 0;
        for (Double valor : lista) {
            if (valor > media) acima++;
            if (valor < 7) abaixo++;
        }

        System.out.println("\n<--- Resultado --->");
        System.out.println("Total de valores lidos: " + lista.size());
        System.out.println("Valores lidos: " + lista);
        System.out.println("Valores lidos em ordem inversa: " + rev_lista);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media dos valores: " + media);
        System.out.println("Quantidade de valores acima da media: " + acima);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixo);
        System.out.println("Progama encerrado.");

        scanner.close();
    }
}