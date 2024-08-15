package atividade8.model.usuarios;


import atividade8.contract.IComportamentosFIES;

public class UsuarioFies extends Usuario implements IComportamentosFIES {
    public UsuarioFies(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void verContrato() {
        System.out.println("Exibindo contrato...");
    }

    @Override
    public void renovarContrato() {
        System.out.println("Renovando contrato...");
    }

}
