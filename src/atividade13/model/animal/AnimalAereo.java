package atividade13.model.animal;

public abstract class AnimalAereo extends Animal {
    public AnimalAereo(String nome, String especie, String genero, int idade, double peso) {
        super(nome, especie, genero, idade, peso);
    }

    @Override
    public void comer() {
        System.out.println("O animal aéreo está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O animal aéreo está dormindo");
    }

    @Override
    public void falar() {
        System.out.println("O animal aéreo disse: piu piu piu");
    }
}
