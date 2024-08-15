package atividade3.model;

public class Login {
    public final String username;
    public final String senha;

    public Login(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public boolean entrar(String login, String senha) {
        return this.username.equals(login) && this.senha.equals(senha);
    }
}
