package atividade10.exception;

public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException() {
        super();
    }

    public DivisaoPorZeroException(String s) {
        super(s);
    }
}
