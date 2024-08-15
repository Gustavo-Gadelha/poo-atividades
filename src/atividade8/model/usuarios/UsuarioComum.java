package atividade8.model.usuarios;


import atividade8.contract.IComportamentosSaldos;

public class UsuarioComum extends Usuario implements IComportamentosSaldos {
    public final double saldo;

    public UsuarioComum(String login, String senha) {
        super(login, senha);
        this.saldo = 0;
    }

    @Override
    public void retirarExtrado() {
        System.out.println("Retirando extrato...");
    }

    @Override
    public void depositarValor(double valor) {
        System.out.printf("R$%.2f depositados na conta\n", valor);
    }

    @Override
    public void sacarValor(double valor) {
        System.out.printf("R$%.2f sacados da conta\n", valor);
    }

    @Override
    public String toString() {
        return "UsuarioComum{" +
                "saldo=" + saldo +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
