package atividade6.model;


import atividade6.model.usuarios.UsuarioComum;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Mensagem {
    public final UUID id;
    public final UsuarioComum autor;
    public String conteudo;
    public final LocalDate data;
    public final LocalTime hora;

    public Mensagem(UsuarioComum autor, String conteudo) {
        this.id = UUID.randomUUID();
        this.autor = autor;
        this.conteudo = conteudo;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public void exibirInfo() {
        System.out.printf("Autor da mensagem: %s\n", this.autor.nomeUsuario);
        System.out.printf("Conteúdo da mensagem: \n - %s\n", this.conteudo);
        System.out.println("Data da mensagem: " + this.data);
        System.out.println("Hora da mensagem: " + this.hora);
        System.out.println();
    }

    /*
    Atributos:
        Autor (referência ao usuário que escreveu a mensagem)
        Conteúdo da Mensagem
        Data e Hora de Publicação
    Métodos:
        exibirInfo(): Exibe informações detalhadas sobre a mensagem.
    */
}
