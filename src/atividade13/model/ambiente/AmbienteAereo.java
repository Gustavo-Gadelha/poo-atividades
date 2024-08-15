package atividade13.model.ambiente;

import br.com.fesfafic.qst1.Model.Animal.Animal;
import br.com.fesfafic.qst1.Model.Animal.AnimalAereo;

public class AmbienteAereo extends Ambiente {
    public final double temperaturaCelsius;
    public final String tipoDeVegetacao;

    public AmbienteAereo(String nome, double areaOcupada, int quantidadeDeAnimais, double temperaturaCelsius, String tipoDeVegetacao) {
        super(nome, areaOcupada, quantidadeDeAnimais);
        this.temperaturaCelsius = temperaturaCelsius;
        this.tipoDeVegetacao = tipoDeVegetacao;
    }

    @Override
    public void adicionarAnimal(Animal animal) {
        if (animal instanceof AnimalAereo) {
            super.adicionarAnimal(animal);
        } else {
            System.out.println("Esse animal não pode ser inserido neste ambiente");
        }
    }
}
