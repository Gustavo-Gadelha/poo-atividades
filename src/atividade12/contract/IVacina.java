package atividade12.contract;

import java.time.LocalDate;

public interface IVacina {
    String getTipo();

    LocalDate getDataValidade();

    String getLote();

    boolean estaVencida();
}
