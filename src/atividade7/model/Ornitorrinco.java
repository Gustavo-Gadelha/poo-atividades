package atividade7.model;


import atividade7.contract.IComportamentoAquatico;
import atividade7.contract.IComportamentoPorOvos;

public class Ornitorrinco extends Mamifero implements IComportamentoAquatico, IComportamentoPorOvos {
    @Override
    public void porOvo() {
        System.out.println("O ornitorrinco pôs 1 ovo");
    }

    @Override
    public void porOvo(int quantidade) {
        if (quantidade > 1) {
            System.out.printf("O ornitorrinco pôs %d ovos", quantidade);
        } else if (quantidade == 1) {
            System.out.println("O ornitorrinco pôs 1 ovo");
        } else {
            System.out.println("O ornitorrinco não pôs ovos");
        }
    }

}
