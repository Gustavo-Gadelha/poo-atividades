package atividade7.model;


import atividade7.contract.IComportamentoPorOvos;

public abstract class Ave implements IComportamentoPorOvos {

    @Override
    public void porOvo() {
        System.out.println("Pos ovo");
    }

    @Override
    public void porOvo(int quantidade) {
        if (quantidade > 1) {
            System.out.printf("Pos %d ovos", quantidade);
        } else if (quantidade == 0) {
            System.out.println("Nao pos ovo");
        } else {
            System.out.println("Pos 1 ovo");
        }
    }

}
