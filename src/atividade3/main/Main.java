package atividade3.main;


import atividade3.model.Perfil;

public class Main {
    public static void main(String[] args) {

        Perfil perfil = new Perfil(
                "url-alguma-coisa",
                "erlonjr",
                "Erlon Dantas",
                "Sei nao"
        );

        perfil.adicionarRedeSocial("facebook");
        perfil.adicionarRedeSocial("X");
        perfil.adicionarRedeSocial("Instagram");
        perfil.adicionarRedeSocial("Privacy");
        perfil.removerRedeSocial(6);
        perfil.adicionarRedeSocial("Inner Cycle");

        System.out.println(perfil.redesSociais[0]);
        System.out.println(perfil.redesSociais[1]);
        System.out.println(perfil.redesSociais[2]);
        System.out.println(perfil.redesSociais[3]);

    }
}