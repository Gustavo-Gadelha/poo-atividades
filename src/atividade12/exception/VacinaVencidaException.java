package atividade12.exception;

public class VacinaVencidaException extends RuntimeException {
    public VacinaVencidaException() {
        super();
    }

    public VacinaVencidaException(String message) {
        super(message);
    }
}
