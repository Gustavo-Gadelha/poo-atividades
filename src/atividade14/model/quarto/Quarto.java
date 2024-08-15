package atividade14.model.quarto;

import java.util.UUID;

public abstract class Quarto {
    public final UUID id;
    public final int numero;
    public double precoPorNoite;
    public boolean estaReservado;

    public Quarto(int numero, double precoPorNoite) {
        this.id = UUID.randomUUID();
        this.numero = numero;
        this.precoPorNoite = precoPorNoite;
        this.estaReservado = false;
    }

    public void reservarQuarto() {
        this.estaReservado = true;
    }

    public void cancelarReserva() {
        this.estaReservado = false;
    }
}
