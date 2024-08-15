package atividade10.main;

import atividade10.exception.DivisaoPorZeroException;
import atividade10.model.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        try {
            System.out.print("Digite um número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite outro número: ");
            double b = scanner.nextDouble();
            System.out.print("Digite um operador: ");
            char operador = scanner.next().charAt(0);

            switch (operador) {
                case '+' -> resultado = Calculadora.somar(a, b);
                case '-' -> resultado = Calculadora.subtrair(a, b);
                case '/' -> resultado = Calculadora.dividir(a, b);
                case '*' -> resultado = Calculadora.multiplicar(a, b);
                default -> System.out.println("Operador invalido");
            }
            System.out.println("\nResultado: " + resultado);
        } catch (InputMismatchException e) {
            System.err.println("Erro: valor digitado invalido");
        } catch (DivisaoPorZeroException e) {
            System.err.println("Erro: Divisão por zero");
        } finally {
            System.out.println("\nOperação concluída");
        }
    }
}