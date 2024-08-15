package atividade8.model.sistemas;


import atividade8.contract.IAcessoFIES;
import atividade8.contract.IComportamentosFIES;

public class SistemaFies implements IAcessoFIES {

    @Override
    public void login(IComportamentosFIES usuario) {
        System.out.println("Usuario acessou o sistema FIES");
    }

    @Override
    public void logout(IComportamentosFIES usuario) {
        System.out.println("Usuario saiu do sistema");
    }
}
