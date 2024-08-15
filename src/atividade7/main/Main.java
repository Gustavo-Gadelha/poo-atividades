package atividade7.main;


import atividade7.model.Papagaio;
import atividade7.model.Pinguim;

public class Main {
    public static void main(String[] args) {

        Papagaio papaGaio = new Papagaio();

        papaGaio.falar();
        papaGaio.voar();
        papaGaio.porOvo();
        papaGaio.porOvo(5);

        Pinguim pinguim = new Pinguim();
        pinguim.nadar();
        pinguim.porOvo();
        pinguim.porOvo(5);

    }
}