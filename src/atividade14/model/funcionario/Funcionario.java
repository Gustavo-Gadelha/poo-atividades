package atividade14.model.funcionario;

import java.util.UUID;

public abstract class Funcionario {
    public final UUID id;
    public final String nome;
    public String horario;
    public final double salario;

    public Funcionario(String nome, String horario, double salario) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.horario = horario;
        this.salario = salario;
    }

    public void digaOi() {
        System.out.println(this.nome + " disse oi");
    }

    public void mudarHorario(String horario) {
        this.horario = horario;
    }
}
