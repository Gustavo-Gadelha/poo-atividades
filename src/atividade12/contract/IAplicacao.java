package atividade12.contract;

import java.time.LocalDate;

public interface IAplicacao {
    IPaciente getPaciente();

    IVacina getVacina();

    LocalDate getDataAplicacao();
}
