package atividade14.model.funcionario;

public class Manutencao extends Funcionario {
    public String tipoDeManutencao;

    public Manutencao(String nome, String horario, double salario, String tipoDeManutencao) {
        super(nome, horario, salario);
        this.tipoDeManutencao = tipoDeManutencao;
    }

    public void alterarTipoDeManutencao(String tipoDeManutencao) {
        this.tipoDeManutencao = tipoDeManutencao;
    }
}
