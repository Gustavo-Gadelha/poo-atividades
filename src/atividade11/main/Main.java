package atividade11.main;


import atividade11.model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario("login", "senha");

        System.out.print("Digite seu email: ");
        String login = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        usuario.autenticar(login, senha);
    }
}