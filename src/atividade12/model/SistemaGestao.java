package atividade12.model;

import atividade12.contract.IAplicacao;
import atividade12.contract.ICentroSaude;
import atividade12.contract.IPaciente;
import atividade12.contract.IVacina;
import atividade12.exception.VacinaVencidaException;

public class SistemaGestao {
    private final ICentroSaude[] centrosSaude;
    private final IAplicacao[] aplicacoes;

    public SistemaGestao(int centrosSaude, int aplicacoes) {
        this.centrosSaude = new CentroSaude[centrosSaude];
        this.aplicacoes = new Aplicacao[aplicacoes];
    }

    private void inserirCentroSaude(ICentroSaude centroSaude) {
        for (int i = 0; i < this.centrosSaude.length; i++) {
            if (this.centrosSaude[i] == null) {
                this.centrosSaude[i] = centroSaude;
                System.out.printf("Centro de Saúde %s registrado",
                        centroSaude.getNome()
                );
                return;
            }
        }
    }

    private void inserirAplicacao(IAplicacao aplicacao) {
        for (int i = 0; i < this.aplicacoes.length; i++) {
            if (this.aplicacoes[i] == null) {
                this.aplicacoes[i] = aplicacao;
                System.out.printf("Aplicação registrada para o paciente %s para vacina %s\n",
                        aplicacao.getPaciente().getNome(),
                        aplicacao.getVacina().getTipo()
                );
                return;
            }
        }
    }

    public void registrarAplicacao(IPaciente paciente, IVacina vacina) throws VacinaVencidaException {
        try {
            if (vacina.estaVencida()) {
                throw new VacinaVencidaException();
            } else {
                this.inserirAplicacao(new Aplicacao(paciente, vacina));
            }
        } catch (VacinaVencidaException e) {
            System.err.println("ERRO: Está vacina está vencida, aplicação não registrada\n" + e);
        }
    }
}
