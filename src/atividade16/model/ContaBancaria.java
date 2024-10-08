package atividade16.model;

import java.util.ArrayList;

public class ContaBancaria {
    public Pessoa titular;
    public double saldo;
    public double limite;
    public ArrayList<String> historico;
    public static ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

    public ContaBancaria(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0;
        this.limite = 1000;
        this.historico = new ArrayList<>();
        ContaBancaria.listaDeContas.add(this);
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            historico.add("Deposito de " + valor);
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }

    public boolean sacar(double valor) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            historico.add("Saque de " + valor);
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }

    public void transferePara(ContaBancaria destinatario, double valor) {
        if (this.sacar(valor) == true) {
            destinatario.depositar(valor);
            historico.add("Transferência para " + destinatario.getNomeDoTitular() + " de " + valor);
        } else {
            System.out.println("Não foi possível fazer o saque");
        }
    }

    public String getNomeDoTitular() {
        return this.titular.nome;
    }

    public void exibirHistorico() {
        System.out.println("Histórico de " + this.getNomeDoTitular());
        for (int i = 0; i < historico.size(); i++) {
            System.out.println(" - " + historico.get(i));
        }
    }
}
