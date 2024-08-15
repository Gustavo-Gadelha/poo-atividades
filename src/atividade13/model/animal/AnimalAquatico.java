package atividade13.model.animal;

public abstract class AnimalAquatico extends Animal {
    public AnimalAquatico(String nome, String especie, String genero, int idade, double peso) {
        super(nome, especie, genero, idade, peso);
    }

    @Override
    public void comer() {
        System.out.println("O animal aquático está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O animal aquático está dormindo");
    }

    @Override
    public void falar() {
        System.out.println("O animal aquático disse: blub blub blub");
    }
}