package atividade7.model;


import atividade7.contract.IComportamentoVoador;
import atividade7.contract.IOutrosComportamentos;

public class Papagaio extends Ave implements IComportamentoVoador, IOutrosComportamentos {
    @Override
    public void voar() {
        System.out.println("Esta ave voando");
    }

    @Override
    public void falar() {
        System.out.println("Esta ave falando");
    }
}
