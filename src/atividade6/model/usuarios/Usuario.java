package atividade6.model.usuarios;

import java.util.UUID;

public abstract class Usuario {
    public final UUID id;
    public final String nomeUsuario;
    public final String nomeReal;

    public Usuario(String nomeUsuario, String nomeReal) {
        this.id = UUID.randomUUID();
        this.nomeUsuario = nomeUsuario;
        this.nomeReal = nomeReal;
    }

    public void exibirInfo() {
        System.out.printf("Nome de Usuario: %s\n", this.nomeUsuario);
        System.out.printf("Nome Real: %s\n", this.nomeReal);
    }

    /*
    Atributos:
        ID do Usuário
        Nome de Usuário
        Nome Real
        Data de Nascimento
        Lista de Amigos (limite de amigos)
        Lista de Mensagens (limite de mensagens)
        Lista de Fotos (limite de fotos)
    Métodos:
        exibirInfo(): Exibe informações detalhadas sobre o usuário.
        adicionarAmigo(): Permite aos usuários adicionar outros usuários como amigos.
        compartilharMensagem(): Permite aos usuários compartilharem mensagens com seus amigos.
        compartilharFoto(): Permite aos usuários compartilharem fotos com seus amigos.
        verFeedNoticias(): Exibe o feed de notícias do usuário, mostrando mensagens e fotos compartilhadas por amigos.
    */
}
