package atividade12.model;

import atividade12.contract.IAplicacao;
import atividade12.contract.IPaciente;
import atividade12.contract.IVacina;

import java.time.LocalDate;

public class Aplicacao implements IAplicacao {
    private IPaciente paciente;
    private IVacina vacina;
    private LocalDate dataDeAplicacao;

    public Aplicacao(IPaciente paciente, IVacina vacina) {
        this.paciente = paciente;
        this.vacina = vacina;
        this.dataDeAplicacao = LocalDate.now();
    }

    @Override
    public IPaciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(IPaciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public IVacina getVacina() {
        return this.vacina;
    }

    public void setVacina(IVacina vacina) {
        this.vacina = vacina;
    }

    @Override
    public LocalDate getDataAplicacao() {
        return this.dataDeAplicacao;
    }

    public void setDataDeAplicacao(LocalDate dataDeAplicacao) {
        this.dataDeAplicacao = dataDeAplicacao;
    }

    @Override
    public String toString() {
        return "Aplicacao{" +
                "paciente=" + paciente +
                ", vacina=" + vacina +
                ", dataDeAplicacao=" + dataDeAplicacao +
                '}';
    }
}
