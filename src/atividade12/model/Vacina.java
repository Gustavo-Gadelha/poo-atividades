package atividade12.model;

import atividade12.contract.IVacina;

import java.time.LocalDate;

public class Vacina implements IVacina {
    private String tipo;
    private String lote;
    private LocalDate dataDeValidade;


    public Vacina(String tipo, String lote, LocalDate dataDeValidade) {
        this.tipo = tipo;
        this.lote = lote;
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public LocalDate getDataValidade() {
        return this.dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public boolean estaVencida() {
        return LocalDate.now().isAfter(this.dataDeValidade);
    }
}
