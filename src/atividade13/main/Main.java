package atividade13.main;


import atividade13.model.Gato;
import atividade13.model.Passaro;
import atividade13.model.Peixe;
import atividade13.model.Zoologico;
import atividade13.model.ambiente.AmbienteAereo;
import atividade13.model.ambiente.AmbienteAquatico;
import atividade13.model.ambiente.AmbienteTerrestre;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato(
                "Miau",
                "Tigre de sumatra",
                "Masculino",
                8,
                16
        );

        Peixe peixe = new Peixe(
                "Goldie",
                "Peixe dourado",
                "Feminino",
                1,
                0.1
        );

        Passaro passaro = new Passaro(
                "Sabo",
                "Sabiá-laranjeira",
                "Masculino",
                4,
                1.2
        );

        AmbienteTerrestre terrestre = new AmbienteTerrestre(
                "Campo Norte",
                250,
                20,
                36,
                "Savana"
        );

        AmbienteAereo aereo = new AmbienteAereo(
                "Montanhas Centro-Oeste",
                300,
                45,
                12,
                "Vegetação de altitude"
        );

        AmbienteAquatico aquatico = new AmbienteAquatico(
                "Aquario Sul",
                100,
                10,
                25,
                "Restinga"
        );

        Zoologico zoologico = new Zoologico(
                "Mata das araucarias",
                "Rua de São Miguel",
                87,
                1230,
                5
        );

        // Metodos sobrescritos por cada subclasse
        gato.falar();
        peixe.falar();
        passaro.falar();

        // Metodo da classe abstrata
        gato.exibirNome();
        peixe.exibirNome();
        passaro.exibirNome();

        // Animais sendo adicionados aos seus ambientes correspondentes atraves de metodos sobrescritos
        terrestre.adicionarAnimal(gato);
        aquatico.adicionarAnimal(peixe);
        aereo.adicionarAnimal(passaro);

        // Diferentes tipos de ambientes sendo adicionado ao zoologico
        zoologico.adicionarAmbiente(terrestre);
        zoologico.adicionarAmbiente(aquatico);
        zoologico.adicionarAmbiente(aereo);

        // Outros metodos de zoologico
        zoologico.exibirTotalDeAnimais();
        zoologico.exibirInfo();

    }
}