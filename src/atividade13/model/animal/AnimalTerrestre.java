package atividade13.model.animal;

public abstract class AnimalTerrestre extends Animal {
    public AnimalTerrestre(String nome, String especie, String genero, int idade, double peso) {
        super(nome, especie, genero, idade, peso);
    }

    @Override
    public void comer() {
        System.out.println("O animal terrestre está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O animal terrestre está dormindo");
    }

    @Override
    public void falar() {
        System.out.println("O animal terrestre disse: rawr rawr rawr");
    }
}