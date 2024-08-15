package atividade12.main;


import atividade12.model.CentroSaude;
import atividade12.model.Paciente;
import atividade12.model.SistemaGestao;
import atividade12.model.Vacina;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vacina vacina = new Vacina(
                "Intramuscular",
                "COVID-19",
                LocalDate.of(2023, 12, 30)
        );

        Vacina vacinaVencida = new Vacina(
                "Intramuscular",
                "Tetano",
                LocalDate.of(2023, 8, 30)
        );

        Paciente paciente = new Paciente(
                "Carlos",
                "111.111.111-11"
        );

        CentroSaude centroSaude = new CentroSaude(
                "De Medici institute",
                10
        );

        SistemaGestao gestao = new SistemaGestao(10, 10);

        gestao.registrarAplicacao(paciente, vacina);
        gestao.registrarAplicacao(paciente, vacinaVencida);
    }
}