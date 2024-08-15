package atividade8.contract;

public interface IAcessoComum {
    void login(IComportamentosSaldos usuario);

    void logout(IComportamentosSaldos usuario);
}
