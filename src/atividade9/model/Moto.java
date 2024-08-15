package atividade9.model;


import atividade9.contract.IMotoComportamento;
import atividade9.contract.IVeiculoComportamento;

public class Moto implements IVeiculoComportamento, IMotoComportamento {
    protected String placa;
    protected String marca;
    protected double valor;
    protected double velocidade;

    public Moto(String placa, String marca, double valor, int velocidade) {
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
        this.velocidade = velocidade;
    }

    public Moto() {

    }

    @Override
    public void acelerar(int valor) {
        this.velocidade += (valor * 1.2);
        System.out.printf("A moto acelerou em %dKm/h\n", valor);
        System.out.printf("Velocidade atual: %fKm/h\n", this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade = 0;
        System.out.println("A moto freou totalmente");
        System.out.printf("Velocidade atual: %fKm/h\n", this.velocidade);
    }

    @Override
    public void passarMarcha(int valor) {
        System.out.printf("A moto passou a macha para %d\n", valor);
    }

    @Override
    public void empinar() {
        System.out.println("A moto está empinando");
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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
