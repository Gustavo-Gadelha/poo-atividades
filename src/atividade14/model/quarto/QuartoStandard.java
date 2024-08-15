package atividade14.model.quarto;

public class QuartoStandard extends Quarto {
    public final double taxa = 1.15;

    public QuartoStandard(int numero, double precoPorNoite) {
        super(numero, precoPorNoite);
        this.precoPorNoite *= this.taxa;
    }
}
