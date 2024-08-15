package atividade8.model.sistemas;


import atividade8.contract.IAcessoComum;
import atividade8.contract.IComportamentosSaldos;

public class SistemaBancario implements IAcessoComum {
    @Override
    public void login(IComportamentosSaldos usuario) {
        System.out.println("Usuario acessou o sitema");
    }

    @Override
    public void logout(IComportamentosSaldos usuario) {
        System.out.println("Usuario saiu do sistema");
    }

}
