package atividade15.model;

import java.time.LocalDate;

public class Livro {
    public String titulo;
    public String autor;
    public String ISBM;
    public LocalDate anoDePublicacao;
    public int quantidadeEmEstoque;

    public Livro(String titulo, String autor, String ISBM, LocalDate anoDePublicacao, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBM = ISBM;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInfo() {
        System.out.printf("\nTitulo: %s", this.titulo);
        System.out.printf("\nAutor: %s", this.autor);
        System.out.printf("\nISBM: %s", this.ISBM);
        System.out.printf("\nAno de publicação: %s", this.anoDePublicacao);
        System.out.printf("\nQuantidade em estoque: %s\n", this.quantidadeEmEstoque);
    }
}
