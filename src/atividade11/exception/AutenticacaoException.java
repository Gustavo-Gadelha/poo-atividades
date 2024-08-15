package atividade11.exception;

public class AutenticacaoException extends RuntimeException {
    public AutenticacaoException() {
        super();
    }

    public AutenticacaoException(String s) {
        super(s);
    }
}
