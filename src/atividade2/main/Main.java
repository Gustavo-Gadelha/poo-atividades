package atividade2.main;


import atividade2.model.Usuario;
import atividade2.model.Video;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("examplo@email.com", "exemplo123");
        Video video = new Video("Me at the zoo", "first video on youtube", 2.5);
        Video video2 = new Video("Me at college", "second video on youtube", 5);

        ArrayList<Video> playlist = new ArrayList<>();
        playlist.add(video);
        playlist.add(video2);

        System.out.println("Teste de fazerLogin");
        if (usuario.fazerLogin("examplo@email.com", "exemplo123")) {
            System.out.println("Login realizado com sucesso");
        }

        System.out.println("\nTeste de comprarPremium");
        if (usuario.comprarPremium(100)) {
            System.out.println("Youtube Premium comprado!");
        }

        System.out.println("\nTeste de assistirVideo e do atributo histórico");
        usuario.assistirVideo(video);
        usuario.assistirVideo(video);
        System.out.println("Visualizações de video: " + video.numeroDeVisualizacoes);
        System.out.println("Histórico de usuário: " + usuario.historico);

        System.out.println("\nTeste de deixarComentário");
        usuario.deixarComentario(video, "Olá Mundo!");
        System.out.println("Comentários de video: " + video.comentarios);

        System.out.println("\nTeste de salvarPlaylist");
        usuario.salvarPlaylist(playlist);
        System.out.println("Playlists: " + usuario.playlistsSalvas);

        System.out.println("\nTeste de alterarTitulo e alterarDescrição");
        video2.alterarTitulo("Me at home");
        video2.alterarDescricao("Second** video on youtube");
        System.out.println("video2 pós-edição: " + video2);

    }
}