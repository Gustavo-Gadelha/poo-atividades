package atividade8.model.usuarios;

import br.com.fesfafic.Contract.IComportamentosBoletos;

public abstract class Usuario implements IComportamentosBoletos {
    public final String login;
    public final String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override
    public void pagarBoleto() {
        System.out.println("Pagando boleto...");
    }

    @Override
    public void imprimirBoleto() {
        System.out.println("Imprimindo boleto...");
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
