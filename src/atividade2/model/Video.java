package atividade2.model;

import java.util.ArrayList;

public class Video {
    public String titulo;
    public String descricao;
    public final double duracaoEmMinutos;
    public int numeroDeVisualizacoes;
    public final ArrayList<String> comentarios;

    public Video(String titulo, String descricao, double duracaoEmMinutos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.numeroDeVisualizacoes = 0;
        this.comentarios = new ArrayList<>();
    }

    public void alterarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void alterarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Titulo: " + this.titulo + ", Descrição: " + this.descricao + "\n";
    }

}
