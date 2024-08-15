package atividade8.main;


import atividade8.model.sistemas.SistemaBancario;
import atividade8.model.sistemas.SistemaFies;
import atividade8.model.usuarios.UsuarioComum;
import atividade8.model.usuarios.UsuarioFies;

public class Main {
    public static void main(String[] args) {
        // Exemplo:
        // Sistema bancário com níveis de acesso para usuários Comuns e usuários FIES

        UsuarioComum usuarioComum = new UsuarioComum("login1", "senha1");
        UsuarioFies usuarioFies = new UsuarioFies("login1", "senha1");

        SistemaBancario sistemaBancario = new SistemaBancario();
        SistemaFies sistemaFies = new SistemaFies();

        sistemaBancario.login(usuarioComum);
        sistemaBancario.logout(usuarioComum);

        usuarioComum.depositarValor(1000);
        usuarioComum.sacarValor(1000);
        usuarioComum.retirarExtrado();

        sistemaFies.login(usuarioFies);
        sistemaFies.logout(usuarioFies);

        usuarioFies.renovarContrato();
        usuarioFies.verContrato();
    }
}
