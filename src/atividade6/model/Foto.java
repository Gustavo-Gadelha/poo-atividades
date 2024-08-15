package atividade6.model;


import atividade6.model.usuarios.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Foto {
    public final UUID id;
    public final Usuario autor;
    public final String descricao;
    public final LocalDate data;
    public final LocalTime hora;
    public final String url;

    public Foto(Usuario autor, String descricao, String url) {
        this.id = UUID.randomUUID();
        this.autor = autor;
        this.descricao = descricao;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.url = url;
    }

    public void exibirInfo() {
        System.out.printf("Autor da foto: %s\n", this.autor.nomeUsuario);
        System.out.printf("Descrição da foto: \n - %s\n", this.descricao);
        System.out.println("Data da mensagem: " + this.data);
        System.out.println("Hora da mensagem: " + this.hora);
        System.out.println("Url da mensagem: " + this.url);
        System.out.println();
    }

    /*
    Atributos:
        Autor (referência ao usuário que compartilhou a foto)
        Descrição da Foto
        Data e Hora de Upload
        URL da Imagem
    Métodos:
        exibirInfo(): Exibe informações detalhadas sobre a foto.
    */
}
