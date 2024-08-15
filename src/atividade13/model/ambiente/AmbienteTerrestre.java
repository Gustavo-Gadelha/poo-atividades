package atividade13.model.ambiente;


import atividade13.model.animal.Animal;
import atividade13.model.animal.AnimalTerrestre;

public class AmbienteTerrestre extends Ambiente {
    public final double temperaturaCelsius;
    public final String tipoDeVegetacao;

    public AmbienteTerrestre(String nome, double areaOcupada, int quantidadeDeAnimais, double temperaturaCelsius, String tipoDeVegetacao) {
        super(nome, areaOcupada, quantidadeDeAnimais);
        this.temperaturaCelsius = temperaturaCelsius;
        this.tipoDeVegetacao = tipoDeVegetacao;
    }

    @Override
    public void adicionarAnimal(Animal animal) {
        if (animal instanceof AnimalTerrestre) {
            super.adicionarAnimal(animal);
        } else {
            System.out.println("Esse animal não pode ser inserido neste ambiente");
        }
    }
}
