package atividade15.model;

import java.util.UUID;

public class Usuario {
    public String nome;
    public UUID id;
    public String email;
    public Livro[] livrosEmPosse = new Livro[5];

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = UUID.randomUUID();
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Email: %s \n", this.email);
    }

}
