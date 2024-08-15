package atividade9.model;


import atividade9.contract.ICarroComportamento;
import atividade9.contract.IVeiculoComportamento;

public class Carro implements IVeiculoComportamento, ICarroComportamento {
    protected String placa;
    protected String marca;
    protected double valor;
    protected int velocidade;

    public Carro(String placa, String marca, double valor, int velocidade) {
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
        this.velocidade = velocidade;
    }

    public Carro() {

    }

    @Override
    public void acelerar(int valor) {
        this.velocidade += valor;
        System.out.printf("O carro acelerou em %dKm/h\n", valor);
        System.out.printf("Velocidade atual: %dKm/h\n", this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade -= 2;
        System.out.println("O carro freou");
        System.out.printf("Velocidade atual: %dKm/h\n", this.velocidade);
    }

    @Override
    public void passarMarcha(int valor) {
        System.out.printf("O carro passou a macha para %d\n", valor);
    }

    @Override
    public void abrirPorta(int posicaoPorta) {
        switch (posicaoPorta) {
            case 1 -> System.out.println("Porta 1 aberta");
            case 2 -> System.out.println("Porta 2 aberta");
            case 3 -> System.out.println("Porta 3 aberta");
            case 4 -> System.out.println("Porta 4 aberta");
            case 5 -> System.out.println("Porta 5 aberta");
            case 6 -> System.out.println("Porta 6 aberta");
            default -> System.out.println("Valor da porta inválido");
        }
    }

    @Override
    public void abrirPortaMala() {
        System.out.println("O porta-malas do carro foi aberto");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
