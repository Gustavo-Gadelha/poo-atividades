package atividade14.model.quarto;

public class QuartoVIP extends Quarto {
    public final double taxa = 1.65;

    public QuartoVIP(int numero, double precoPorNoite) {
        super(numero, precoPorNoite);
        this.precoPorNoite *= this.taxa;
    }
}
