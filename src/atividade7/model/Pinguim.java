package atividade7.model;


import atividade7.contract.IComportamentoAquatico;

public class Pinguim extends Ave implements IComportamentoAquatico {

    @Override
    public void nadar() {
        System.out.println("Pinguim nadando");
    }


}
