package atividade10.model;

import atividade10.exception.DivisaoPorZeroException;

public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double dividir(double a, double b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Não é possível dividir por zero");
        } else {
            return a / b;
        }
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }
}
