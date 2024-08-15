package atividade15.main;


import atividade15.model.Biblioteca;
import atividade15.model.Livro;
import atividade15.model.Usuario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "exemplo",
                "exemplo@email.com");

        Livro livro = new Livro(
                "Admiravel mundo novo",
                "Adous Huxley",
                "250-3347-2",
                LocalDate.of(1932, 5, 12),
                10);

        Livro livro2 = new Livro(
                "Neuromancer",
                "William Gibson",
                "0-441-56956-0",
                LocalDate.of(1984, 7, 1),
                10);

        Livro livro3 = new Livro(
                "1984",
                "George Orwell",
                "0-141-18295-4",
                LocalDate.of(1949, 6, 8),
                8);

        Biblioteca biblioteca = new Biblioteca(
                "Corujão",
                "Rua dos bobos");


        biblioteca.cadastrarLivro(livro);
        biblioteca.cadastrarLivro(livro2);

        if (biblioteca.verificarDisponibilidade(livro)) {
            System.out.println("Livro disponível");
        } else {
            System.out.println("Livro indisponível");
        }

        biblioteca.emprestarLivro(livro);
        biblioteca.devolverLivro(livro2);

        biblioteca.emprestarLivro(livro3);
        biblioteca.devolverLivro(livro3);

        System.out.println();
        biblioteca.exibirInfo();
    }
}