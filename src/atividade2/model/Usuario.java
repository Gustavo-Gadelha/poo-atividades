package atividade2.model;

import java.util.ArrayList;

public class Usuario {
    public final String email;
    public final String senha;
    public boolean ePremium;
    public final ArrayList<Video> historico;
    public final ArrayList<ArrayList<Video>> playlistsSalvas;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.ePremium = false;
        this.historico = new ArrayList<>();
        this.playlistsSalvas = new ArrayList<>();
    }

    public boolean fazerLogin(String email, String senha) {
        return (this.email.equals(email) && this.senha.equals(senha));
    }

    public boolean comprarPremium(double valor) {
        if (this.ePremium) {
            System.out.println("Você já é um usuário Premium");

        } else if (valor >= 30) {
            valor -= 30;
            if (valor > 0) System.out.println("Restante: " + valor);

            this.ePremium = true;
            return true;
        }

        return false;
    }

    public void assistirVideo(Video video) {
        video.numeroDeVisualizacoes += 1;
        for (int i = 0; i < this.historico.size(); i++) {
            if (this.historico.get(i) == video) return;
        }
        this.historico.add(video);
    }

    public void salvarPlaylist(ArrayList<Video> playlist) {
        this.playlistsSalvas.add(playlist);
    }

    public void deixarComentario(Video video, String comentario) {
        video.comentarios.add(comentario);
    }

}
