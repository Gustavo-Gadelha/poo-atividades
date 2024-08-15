package atividade14.model.funcionario;


import atividade14.model.quarto.Quarto;

public class Governanta extends Funcionario {
    public final Quarto[] quartos;

    public Governanta(String nome, String horario, double salario, int limite) {
        super(nome, horario, salario);
        this.quartos = new Quarto[limite];
    }

    public void adicionarQuarto(Quarto quarto) {
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] == null) {
                this.quartos[i] = quarto;
                return;
            }
        }
        System.out.println("A lista de quartos desta governanta está cheia");
    }
}
