package Controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import Modelo.*;

public class ControleBancoEvento {

	private BancoEvento banco = new BancoEvento();

	private int qtdEventos;

	// Construtor da classe ControleBancoEvento
	public ControleBancoEvento(ControleBancoEvento dados) {
		banco = dados.getBanco();
		qtdEventos = dados.getQtdEventos();
	}

	// Construtor: Preenche o banco com alguns dados
	public ControleBancoEvento() {
		banco.fillWithSomeData();
	}

	// get da classe banco instanciada nessa classe
	public BancoEvento getBanco() {
		return banco;
	}

	// set da classe banco instanciada nessa classe
	public void setBanco(BancoEvento banco) {
		this.banco = banco;
	}

	// Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomeEventos() {
		String[] auxiliar = new String[banco.getBdEventos().size()];

		for (int i = 0; i < banco.getBdEventos().size(); i++) {
			auxiliar[i] = banco.getBdEventos().get(i).getNomeEvento();
		}
		return auxiliar;
	}

	// Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomesConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesConvidados();
	}

	// Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomesTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesTarefas();

	}

	// Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomesOrcamento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesOrcamento();

	}

	// Retorna uma String com o nome do evento
	public String getNomeEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getNomeEvento();
		return s;
	}

	// Retorna uma String com a data do evento
	public String getDataEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getDataEvento();
		return s;
	}

	// Retorna uma String com a hora do início do evento evento
	public String getHoraiEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHoraiEvento();
		return s;
	}

	// Retorna uma String com a hora do término do evento
	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}

	// Retorna uma String com o endereço do evento
	public String getEndereco(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getEndereco();
		return s;
	}

	// Retorna uma String com o CEP do evento
	public String getCep(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getCep();
		return s;
	}

	// Retorna uma String com o complemento do evento
	public String getComplemento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getComplemento();
		return s;
	}

	// Retorna um inteiro com o Total de convidadados do evento
	public int getTotalConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalConvidados();

	}

	// Retorna um double com a Taxa de Tarefas do evento
	public double getTaxaTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTaxaTarefas();
	}

	// Retorna um double com o orçamento Previsto do evento
	public double getOrcamentoPrevisto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getOrcamentoPrevisto();
	}

	// Retorna um double com o Gasto Total do evento
	public double getTotalGasto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalGasto();
	}

	// Retorna um boolean com o erro de preenchimento
	public boolean adicionarEditarEvento(int op, int pos, String[] dadosEvento) {

		if (!validaData(dadosEvento[2])) { // data
			return false;
		}

		if (!validaHora(dadosEvento[3])) { // hora início
			return false;
		}

		if (!validaHora(dadosEvento[4])) { // hora término
			return false;
		}
		if (!validaCEP(dadosEvento[6])) { // CEP
			return false;
		}

		else {
			if (op == 1) {
				Evento e = new Evento(dadosEvento[1], dadosEvento[2], dadosEvento[3], dadosEvento[4], dadosEvento[5],
						dadosEvento[6], dadosEvento[7]);
				banco.adicionarEvento(e);
			} else {
				ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
				controlEvento.setNomeEvento(dadosEvento[1]);
				controlEvento.setDataEvento(dadosEvento[2]);
				controlEvento.setHoraiEvento(dadosEvento[3]);
				controlEvento.setHorafEvento(dadosEvento[4]);
				controlEvento.setEndereco(dadosEvento[5]);
				controlEvento.setCep(dadosEvento[6]);
				controlEvento.setComplemento(dadosEvento[7]);
			}
			return true;
		}

	}

	public boolean adicionarEditarConvidado(int op, int posEvento, int posConvidado, String[] dadosConvidados) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));

		if (!validaCEP(dadosConvidados[6])) { // CEP
			return false;
		}

		else {
			if (op == 1) {

				Convidado e = new Convidado(dadosConvidados[1], Integer.parseInt(dadosConvidados[2]),
						dadosConvidados[8], dadosConvidados[3], dadosConvidados[4], dadosConvidados[5],
						dadosConvidados[6], dadosConvidados[7]);
				controlEvento.adicionarConvidado(e);

			} else {

				controlConvidado.setNome(dadosConvidados[1]);
				controlConvidado.setQuantAcompanhante(Integer.parseInt(dadosConvidados[2]));
				controlConvidado.setEmail(dadosConvidados[3]);
				controlConvidado.setRedeSocial(dadosConvidados[4]);
				controlConvidado.setEnd(dadosConvidados[5]);
				controlConvidado.setCEP(dadosConvidados[6]);
				controlConvidado.setComplemenConvidado(dadosConvidados[7]);
				controlConvidado.setTelefone(dadosConvidados[8]);

			}
			return true;
		}

	}

	public boolean adicionarEditarTarefa(int op, int posEvento, int posTarefa, String[] dadosTarefa) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));

		if (!validaData(dadosTarefa[2])) { // data
			return false;
		} else {

			if (op == 2) {

				Tarefa e = new Tarefa(dadosTarefa[1], dadosTarefa[2], Boolean.parseBoolean(dadosTarefa[3]));
				controlEvento.adicionarTarefa(e);

			} else {

				controlTarefa.setDescricao(dadosTarefa[1]);
				controlTarefa.setDataLimite(dadosTarefa[2]);
				controlTarefa.setConcluidoTarefa(Boolean.parseBoolean(dadosTarefa[3]));

			}
			return true;
		}

	}

	// retorna um boolean com erro de exclusao do evento
	public boolean removerEvento(int posicao) {
		if (banco.removerEvento(posicao)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean removerConvidado(int posEvento, int posConvidado) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerConvidado(posConvidado)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean removerTarefa(int posEvento, int posTarefa) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerTarefa(posTarefa)) {
			return true;
		} else {
			return false;
		}

	}

	// Retorna um inteiro com a quantidade de eventos
	public int getQtdEventos() {
		setQtdEventos();
		return qtdEventos;
	}

	// set da quantidade de eventos
	public void setQtdEventos() {
		this.qtdEventos = banco.getQtdEventos();

	}

	public String getNomeConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getNome();
	}

	public int getQuantAcompanhanteConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getQuantAcompanhanteConvidado();
	}

	public String getTelefone(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getTelefone();
	}

	public String getEmail(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEmail();
	}

	public String getRedeSocial(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getRedeSocial();
	}

	public String getEndConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEnd();
	}

	public String getCepConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getCEP();
	}

	public String getComplemenConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getComplemenConvidado();
	}

	public String getDescricaoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDescricao();
	}

	public String getDataLimiteTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDataLimite();
	}

	public boolean getConcluidoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getConcluidoTarefa();
	}

	// retorna verdadeiro se a data estiver no formato correto e dentro do padrão do
	// localDate
	public boolean validaData(String data) {
		String formatoData = "dd/MM/uuuu";

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatoData) // define o padrão do formato
																						// data // data
				.withResolverStyle(ResolverStyle.STRICT); // compara o string com o formato estritamente
		try { // se o parse der certo, retorna TRUE
			LocalDate.parse(data, dateTimeFormatter);
			return true;
		} catch (DateTimeParseException e) { // se ocorrer algum erro no parse, retorn FALSE
			return false;
		}
	}

	// retorna verdadeiro se a hora estiver no formato correto
	public boolean validaHora(String hora) {
		String[] hm = hora.split(":"); // divide em um vetor de strings

		int horas = Integer.parseInt(hm[0]); // transforma a string em int
		int minutos = Integer.parseInt(hm[1]);

		if (horas > 24 || horas < 0 || minutos > 59 || minutos < 0)
			return false;
		else
			return true;
	}

	// retorna verdadeiro se a hora estiver no formato correto
	public boolean validaCEP(String cep) {
		String[] digitos = cep.split("-"); // divide em um vetor de strings

		if (!digitos[0].matches("[0-9]+") || !digitos[1].matches("[0-9]+")) // se for diferente de número
			return false;
		else
			return true;
	}

}
