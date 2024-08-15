package atividade14.model;


import atividade14.model.funcionario.Funcionario;
import atividade14.model.quarto.Quarto;

public class Hotel {
    public final String nome;
    public final String endereco;
    public final Funcionario[] funcionarios;
    public final Quarto[] quartos;

    public Hotel(String nome, String endereco, int limite) {
        this.nome = nome;
        this.endereco = endereco;
        this.funcionarios = new Funcionario[limite];
        this.quartos = new Quarto[limite];
    }

    public void fazerReserva(int numeroDoQuarto) {
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] != null && this.quartos[i].numero == numeroDoQuarto) {
                if (this.quartos[i].estaReservado) {
                    System.out.println("Este quarto já está reservado");
                } else {
                    this.quartos[i].reservarQuarto();
                    System.out.println("Reserva realizada com sucesso");
                }
                return;
            }
        }
    }

    public void cancelarReserva(int numeroDoQuarto) {
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] != null && this.quartos[i].numero == numeroDoQuarto) {
                if (this.quartos[i].estaReservado) {
                    this.quartos[i].cancelarReserva();
                    System.out.println("Reserva cancelada com sucesso");
                } else {
                    System.out.println("Este quarto não está reservado");
                }
                return;
            }
        }
    }

    public void adicionarQuarto(Quarto quarto) {
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] != null && this.quartos[i].numero == quarto.numero) {
                System.out.println("Número de quarto já cadastrado");
                return;
            } else if (this.quartos[i] == null) {
                this.quartos[i] = quarto;
                return;
            }
        }
        System.out.println("Lista de quartos está cheia");
    }

    public void removerQuarto(Quarto quarto) {
        for (int i = 0; i < this.quartos.length; i++) {
            if (this.quartos[i] != null && this.quartos[i] == quarto) {
                this.quartos[i] = null;
                return;
            }
        }
        System.out.println("Quarto não encontrado");
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < this.funcionarios.length; i++) {
            if (this.funcionarios[i] == null) {
                this.funcionarios[i] = funcionario;
                return;
            }
        }
        System.out.println("Lista de funcionários está cheia");
    }

    public void removerFuncionario(Funcionario funcionario) {
        for (int i = 0; i < this.funcionarios.length; i++) {
            if (this.funcionarios[i] != null && this.funcionarios[i] == funcionario) {
                this.funcionarios[i] = null;
                return;
            }
        }
        System.out.println("Funcionário não encontrado");
    }
}
