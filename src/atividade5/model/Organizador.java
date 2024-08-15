package atividade5.model;

import java.util.UUID;

public class Organizador {
    public final UUID id;
    public final String nome;
    public final String Email;
    public final Evento[] eventosOrganizados;

    public Organizador(String nome, String Email, int limite) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.Email = Email;
        this.eventosOrganizados = new Evento[limite];
    }

    public boolean temEspacoParaEventos() {
        for (int i = 0; i < this.eventosOrganizados.length; i++) {
            if (this.eventosOrganizados[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void adicionarEvento(Evento evento) {
        for (int i = 0; i < this.eventosOrganizados.length; i++) {
            if (this.eventosOrganizados[i] == null) {
                this.eventosOrganizados[i] = evento;
                System.out.printf("Evento \"%s\" adicionado a %s \n", evento.nome, this.nome);
                return;
            }
        }
    }

    public void removerEvento(Evento evento) {
        for (int i = 0; i < this.eventosOrganizados.length; i++) {
            if (this.eventosOrganizados[i] == evento) {
                this.eventosOrganizados[i] = null;
                System.out.printf("Evento \"%s\" removido de %s \n", evento.nome, this.nome);
                return;
            }
        }
    }

    public void exibirInfo() {
        System.out.println("|======= Organizador Info =======|");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.Email);
        System.out.println("|== Eventos Organizados Inicio ==|");
        for (int i = 0; i < this.eventosOrganizados.length; i++) {
            if (this.eventosOrganizados[i] != null) {
                this.eventosOrganizados[i].exibirInfo();
            }
        }
        System.out.println("|== Eventos Organizados Fim =====|\n");
    }

    /*
    Atributos:
        Nome
        ID
        E-mail
        Eventos Organizados (uma lista de objetos de evento, com limite de eventos por organizador)
    Métodos:
        exibirInfo(): Exibe informações detalhadas sobre o organizador
    */

}