package atividade11.model;


import atividade11.exception.AutenticacaoException;
import atividade11.exception.LoginMuitoCurtoException;
import atividade11.exception.SenhaMuitoCurtaException;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.setLogin(login);
        this.setSenha(senha);
    }

    public void autenticar(String login, String senha) throws AutenticacaoException {
        try {
            if (!this.login.equals(login) || !this.senha.equals(senha)) {
                throw new AutenticacaoException("Erro de autenticação");
            } else {
                System.out.println("Sucesso");
            }
        } catch (AutenticacaoException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setLogin(String login) throws LoginMuitoCurtoException {
        try {
            if (login.length() < 5) {
                throw new LoginMuitoCurtoException("Seu login deve ter 5 ou mais caracteres");
            } else {
                this.login = login;
            }
        } catch (LoginMuitoCurtoException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setSenha(String senha) throws SenhaMuitoCurtaException {
        try {
            if (senha.length() < 5) {
                throw new SenhaMuitoCurtaException("Sua Senha deve ter 5 ou mais caracteres");
            } else {
                this.senha = senha;
            }
        } catch (SenhaMuitoCurtaException e) {
            System.err.println(e.getMessage());
        }
    }
}
