package atividade6.model.usuarios;


import atividade6.model.Foto;
import atividade6.model.Mensagem;

import java.time.LocalDate;

public class UsuarioComum extends Usuario {
    public final LocalDate dataDeNascimento;
    public final UsuarioComum[] amigos = new UsuarioComum[10];
    public final Mensagem[] mensagens = new Mensagem[20];
    public final Foto[] fotos = new Foto[10];

    public UsuarioComum(String nomeUsuario, String nomeReal, LocalDate dataDeNascimento) {
        super(nomeUsuario, nomeReal);
        this.dataDeNascimento = dataDeNascimento;
    }

    public void adicionarAmigo(UsuarioComum usuario) {
        for (int i = 0; i < this.amigos.length; i++) {
            if (this.amigos[i] == null) {
                this.amigos[i] = usuario;
                return;
            }
        }
        System.out.println("Espaço insuficiente para mais Amigos");
    }

    private void adicionarMensagem(Mensagem mensagem) {
        for (int i = 0; i < this.mensagens.length; i++) {
            if (this.mensagens[i] == null) {
                this.mensagens[i] = mensagem;
                return;
            }
        }
        System.out.println("Espaço insuficiente para mais Mensagens");
    }

    private void adicionarFoto(Foto foto) {
        for (int i = 0; i < this.fotos.length; i++) {
            if (this.fotos[i] == null) {
                this.fotos[i] = foto;
                return;
            }
        }
        System.out.println("Espaço insuficiente para mais Fotos");
    }

    public void compartilharMensagem(String conteudo) {
        Mensagem mensagem = new Mensagem(this, conteudo);
        this.adicionarMensagem(mensagem);
        for (int i = 0; i < this.amigos.length; i++) {
            if (this.amigos[i] != null) {
                this.amigos[i].adicionarMensagem(mensagem);
            }
        }
    }

    public void compartilharFoto(String descricao, String url) {
        Foto foto = new Foto(this, descricao, url);
        this.adicionarFoto(foto);
        for (int i = 0; i < this.amigos.length; i++) {
            if (this.amigos[i] != null) {
                this.amigos[i].adicionarFoto(foto);
            }
        }
    }

    public void verFeedNoticias() {
        System.out.printf("Mensagens compartilhadas com \"%s\": \n", this.nomeUsuario);
        for (int i = 0; i < this.mensagens.length; i++) {
            if (this.mensagens[i] != null) {
                this.mensagens[i].exibirInfo();
            }
        }

        System.out.printf("Fotos compartilhadas com \"%s\": \n", this.nomeUsuario);
        for (int i = 0; i < this.fotos.length; i++) {
            if (this.fotos[i] != null) {
                this.fotos[i].exibirInfo();
            }
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        System.out.println("Amigos: ");
        for (int i = 0; i < this.amigos.length; i++) {
            if (this.amigos[i] != null) {
                System.out.println(" - " + this.amigos[i].nomeUsuario);
            }
        }
    }
}
