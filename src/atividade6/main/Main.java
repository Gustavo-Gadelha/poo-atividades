package atividade6.main;


import atividade6.model.RedeSocial;
import atividade6.model.usuarios.UsuarioAdmin;
import atividade6.model.usuarios.UsuarioComum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        UsuarioComum user1 = new UsuarioComum(
                "ohmagah",
                "Carlos",
                LocalDate.of(2000, 12, 30)
        );

        UsuarioComum user2 = new UsuarioComum(
                "goodame",
                "Carlos",
                LocalDate.of(2000, 12, 30)
        );

        UsuarioAdmin admin = new UsuarioAdmin(
                "admin",
                "Joaquim",
                redeSocial
        );

        redeSocial.inserirUsuario(user1);
        redeSocial.inserirUsuario(user2);

        user1.adicionarAmigo(user2);
        user1.compartilharMensagem("Repudio o curso de Letras!");
        user1.compartilharMensagem("Repudio o curso de Letras!!!!");
        user1.compartilharFoto("Me at home", "www.imgur.com");

        admin.deletarMenssagem(user1, user1.mensagens[1].id);

        admin.mostrarIDPorMensagem(user1);
        admin.mostrarIDPorMensagem(user2);

        user2.verFeedNoticias();
        user1.exibirInfo();
    }
}