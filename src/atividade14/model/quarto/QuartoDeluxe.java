package atividade14.model.quarto;

public class QuartoDeluxe extends Quarto {
    public final double taxa = 1.35;

    public QuartoDeluxe(int numero, double precoPorNoite) {
        super(numero, precoPorNoite);
        this.precoPorNoite *= this.taxa;
    }
}
