package atividade4.model;

import java.util.Arrays;

public class Casa {
    final Pessoa[] listaDePessoas;
    final Veiculo[] listaDeVeiculos;
    final Animal[] listaDeAnimais;

    public Casa(int numeroDePessoas, int numeroDeVeiculos, int numeroDeAnimais) {
        this.listaDePessoas = new Pessoa[numeroDePessoas];
        this.listaDeVeiculos = new Veiculo[numeroDeVeiculos];
        this.listaDeAnimais = new Animal[numeroDeAnimais];
    }

    public void adicionarPessoa(Pessoa... pessoas) {
        for (int args = 0; args < pessoas.length; args++) {
            for (int i = 0; i < this.listaDePessoas.length; i++) {
                if (this.listaDePessoas[i] == null) {
                    this.listaDePessoas[i] = pessoas[args];
                }
            }
        }
    }

    public void adicionarVeiculo(Veiculo... veiculos) {
        for (int args = 0; args < veiculos.length; args++) {
            for (int i = 0; i < this.listaDeVeiculos.length; i++) {
                if (this.listaDeVeiculos[i] == null) {
                    this.listaDeVeiculos[i] = veiculos[args];
                }
            }
        }
    }

    public void adicionarAnimal(Animal... animais) {
        for (int args = 0; args < animais.length; args++) {
            for (int i = 0; i < this.listaDeAnimais.length; i++) {
                if (this.listaDeAnimais[i] == null) {
                    this.listaDeAnimais[i] = animais[args];
                }
            }
        }
    }

    @Override
    public String toString() {
        return "atividade4.Model.Casa: " +
                "\nlistaDePessoas = " + Arrays.toString(listaDePessoas) +
                "\nlistaDeVeiculos = " + Arrays.toString(listaDeVeiculos) +
                "\nlistaDeAnimais = " + Arrays.toString(listaDeAnimais);
    }
}
