package atividade6.model.usuarios;

import atividade6.model.Mensagem;
import atividade6.model.RedeSocial;

import java.util.UUID;

public class UsuarioAdmin extends Usuario {
    public final RedeSocial redeSocial;

    public UsuarioAdmin(String nomeUsuario, String nomeReal, RedeSocial redeSocial) {
        super(nomeUsuario, nomeReal);
        this.redeSocial = redeSocial;
    }

    public void mostrarIDPorMensagem(UsuarioComum usuario) {
        System.out.printf("Usuario \"%s\" id: %s\n", usuario.nomeUsuario, usuario.id);

        System.out.println("Mensagens: ");
        for (int i = 0; i < usuario.mensagens.length; i++) {
            if (usuario.mensagens[i] != null) {
                System.out.printf("\tMensagem %d id: %s\n", i + 1, usuario.mensagens[i].id);
            }
        }
        System.out.println();
    }

    public void mostrarIDPorFoto(UsuarioComum usuario) {
        System.out.printf("Usuario \"%s\" id: %s\n", usuario.nomeUsuario, usuario.id);

        System.out.println("Fotos: ");
        for (int i = 0; i < usuario.fotos.length; i++) {
            if (usuario.fotos[i] != null) {
                System.out.printf("\tMensagem %d id: %s\n", i + 1, usuario.fotos[i].id);
            }
        }
        System.out.println();
    }

    public Mensagem buscarMensagemPorID(UsuarioComum usuario, UUID id) {
        for (int i = 0; i < usuario.mensagens.length; i++) {
            if (usuario.mensagens[i] != null && usuario.mensagens[i].id.equals(id)) {
                return usuario.mensagens[i];
            }
        }
        return null;
    }

    public void editarMenssagem(UsuarioComum usuario, UUID id, String conteudo) {
        Mensagem mensagem = this.buscarMensagemPorID(usuario, id);
        if (mensagem != null) {
            mensagem.conteudo = conteudo;
        } else {
            System.out.println("Mensagem não econtrada neste usuario");
        }
    }

    public void deletarMenssagem(UsuarioComum usuario, UUID id) {
        Mensagem mensagem = this.buscarMensagemPorID(usuario, id);
        if (mensagem != null) {
            mensagem.conteudo = "Mensagem deletada :(";
        } else {
            System.out.println("Mensagem não econtrada neste usuario");
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Rede Social admininstrada: %s", this.redeSocial);
    }
}
