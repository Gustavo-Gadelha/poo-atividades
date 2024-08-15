package atividade4.model;

public class Veiculo {
    String cor;
    final String numeroDaPlaca;
    final int numeroDeRodas;
    double velocidadeKMpH;

    public Veiculo(String cor, String numeroDaPlaca, int numeroDeRodas) {
        this.cor = cor;
        this.numeroDaPlaca = numeroDaPlaca;
        this.numeroDeRodas = numeroDeRodas;
        this.velocidadeKMpH = 0;
    }

    public void pintarVeiculo(String cor) {
        this.cor = cor;
        System.out.printf("Cor do veiculo %s\n", this.cor);
    }

    public void acelerar(double KMpH) {
        this.velocidadeKMpH += KMpH;
        System.out.printf("Velocidade do veiculo %.2fKm/h\n", this.velocidadeKMpH);
    }
}
