# Sistema de Gestão de Distribuição e Rastreabilidade de Vacinas
Link: [Google Classroom](https://classroom.google.com/c/NjE1Njk4NjM2NjU0/a/NjM1NjAxNTM2NjQy/details)

## Resumo
Desenvolver um sistema que controle a distribuição de vacinas para centros de saúde, hospitais e clínicas, 
rastreando lotes, validade, condições de armazenamento e aplicação nos pacientes.

## Requisitos
* Gerenciar estoque de vacinas, incluindo tipo de vacina, lote, data de validade e quantidade.
* Controlar centros de saúde, hospitais e clínicas, com informações de capacidade de armazenamento e equipamentos disponíveis.
* Monitorar condições de armazenamento das vacinas, garantindo que estão sendo mantidas na temperatura adequada.
* Rastrear a aplicação das vacinas em pacientes, registrando data, lote e tipo de vacina.
* Implementar tratamento de erros e exceções, como vacinas vencidas ou armazenadas incorretamente.

## Interfaces
* IVacina: getTipo(), getDataValidade(), getLote(), estaVencida()
* ICentroSaude: getNome(), getCapacidadeArmazenamento(), temEquipamentoAdequado()
* IAplicacao: getPaciente(), getVacina(), getDataAplicacao()
* IPaciente: getNome(), getCpf()

## Classes Modelo
* Vacina
* CentroSaude
* Aplicacao
* Paciente

>  [!NOTE]
> Lembre de abstrair os atributos e métodos por meio das interfaces;

## Classe de Controle (SistemaGestao)
### Atributos   
* Vetor referente a interface vacina, para vacinas
* Vetor referente a interface centro saude, para centros de saúde
* Vetor referente a interface aplicacao, para aplicaçoes

### Métodos
* registrarAplicacao(interface paciente, interface vacina): lembre de lançar uma exceção caso a vacina esteja vencida

## Classe de Exceção (VacinaVencidaException)
Deve ser jogada uma exceção caso a vacina usada para o processo de registrar aplicação esteja vencida
