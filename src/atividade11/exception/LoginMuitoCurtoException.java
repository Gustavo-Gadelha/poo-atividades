package atividade11.exception;

public class LoginMuitoCurtoException extends RuntimeException {
    public LoginMuitoCurtoException() {
        super();
    }

    public LoginMuitoCurtoException(String s) {
        super(s);
    }
}
