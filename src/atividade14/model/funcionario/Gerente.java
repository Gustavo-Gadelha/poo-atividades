package atividade14.model.funcionario;

public class Gerente extends Funcionario {
    public final Funcionario[] supervisionados;

    public Gerente(String nome, String horario, double salario, int limite) {
        super(nome, horario, salario);
        this.supervisionados = new Funcionario[limite];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < this.supervisionados.length; i++) {
            if (this.supervisionados[i] == null) {
                this.supervisionados[i] = funcionario;
                return;
            }
        }
        System.out.println("A lista de funcionarios deste gerente está cheia");
    }
}
