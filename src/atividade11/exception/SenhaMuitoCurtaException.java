package atividade11.exception;

public class SenhaMuitoCurtaException extends RuntimeException {
    public SenhaMuitoCurtaException() {
        super();
    }

    public SenhaMuitoCurtaException(String s) {
        super(s);
    }
}
