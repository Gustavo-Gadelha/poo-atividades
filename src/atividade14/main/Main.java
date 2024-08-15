package atividade14.main;

import atividade14.model.Hotel;
import atividade14.model.funcionario.Gerente;
import atividade14.model.funcionario.Governanta;
import atividade14.model.funcionario.Manutencao;
import atividade14.model.quarto.QuartoDeluxe;
import atividade14.model.quarto.QuartoStandard;
import atividade14.model.quarto.QuartoVIP;

public class Main {
    public static void main(String[] args) {
        QuartoStandard standard = new QuartoStandard(
                101,
                100
        );

        QuartoDeluxe deluxe = new QuartoDeluxe(
                202,
                200
        );

        QuartoVIP vip = new QuartoVIP(
                303,
                300
        );

        Gerente gerente = new Gerente(
                "João",
                "8:00-16:00",
                1400,
                10
        );

        Governanta governanta = new Governanta(
                "Marcela",
                "4:00-12:00",
                1600,
                6
        );

        Manutencao manutencao = new Manutencao(
                "Carlos",
                "6:00-16:00",
                900,
                "Eletrica"
        );

        Hotel hotel = new Hotel(
                "Ribeirão",
                "Rua de São Miguel",
                30
        );

        gerente.adicionarFuncionario(governanta);
        gerente.adicionarFuncionario(manutencao);

        governanta.adicionarQuarto(standard);
        governanta.adicionarQuarto(deluxe);
        governanta.adicionarQuarto(vip);

        hotel.adicionarQuarto(standard);
        hotel.adicionarQuarto(deluxe);
        hotel.adicionarQuarto(vip);

        hotel.adicionarFuncionario(gerente);
        hotel.adicionarFuncionario(governanta);
        hotel.adicionarFuncionario(manutencao);

        hotel.fazerReserva(101);
        hotel.fazerReserva(101);

    }
}
