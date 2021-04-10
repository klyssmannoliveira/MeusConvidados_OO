package Controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import Modelo.*;

public class ControleBancoEvento {

	// private static ArrayList<Evento> = new ArrayList<Evento>();
	// SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// inst�ncia o
	// formato simples da data;
	private BancoEvento banco = new BancoEvento();
	private int qtdEventos;

	// Construtor da classe ControleBancoEvento
	public ControleBancoEvento(ControleBancoEvento dados) {
		banco = dados.getBanco();
		qtdEventos = dados.getQtdEventos();
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

	// Retorna uma String com a hora do in�cio do evento evento
	public String getHoraiEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHoraiEvento();
		return s;
	}

	// Retorna uma String com a hora do t�rmino do evento
	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}

	// Retorna uma String com o endere�o do evento
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

	// Retorna um double com o or�amento Previsto do evento
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

		if (!validaHora(dadosEvento[3])) { // hora in�cio
			return false;
		}

		if (!validaHora(dadosEvento[4])) { // hora t�rmino
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

	// retorna um boolean com erro de exclusao do evento
	public boolean removerEvento(int posicao) {
		if (banco.removerEvento(posicao)) {
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
		;
	}

	// Preenche o banco com alguns dados
	public ControleBancoEvento() {
		banco.fillWithSomeData();
	}

	// retorna verdadeiro se a data estiver no formato correto e dentro do padr�o do
	// localDate
	public boolean validaData(String data) {
		String formatoData = "dd/MM/uuuu";

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatoData) // define o padr�o do formato
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

		if (!digitos[0].matches("[0-9]+") || !digitos[1].matches("[0-9]+")) // se for diferente de n�mero
			return false;
		else
			return true;
	}

}
