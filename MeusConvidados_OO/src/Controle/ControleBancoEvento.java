package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Banco Evento para controlar os dados dos eventos; 
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import Modelo.*;

public class ControleBancoEvento {

	private BancoEvento banco = new BancoEvento(); // instanciação da classe banco evento
	private int qtdEventos; // quantidade evento.

	/*
	 * Objetivo: Construtor da Classe Controle Banco Evento; Entrada :
	 * ControleBancoEvento dados;
	 * 
	 */
	public ControleBancoEvento(ControleBancoEvento dados) {
		banco = dados.getBanco();
		qtdEventos = dados.getQtdEventos();
	}

	/*
	 * Objetivo: Construtor da Classe Controle Banco Evento; Entrada : sem entradas
	 * Construtor: Preenche o banco com alguns dados
	 */

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

	// get nome eventos. Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomeEventos() {
		String[] auxiliar = new String[banco.getBdEventos().size()];

		for (int i = 0; i < banco.getBdEventos().size(); i++) {
			auxiliar[i] = i + 1 + " - " + banco.getBdEventos().get(i).getNomeEvento();
		}
		return auxiliar;
	}

	// get nomes convidadeos. Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomesConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesConvidados();
	}

	// get nomes tarefas. Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomesTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesTarefas();

	}

	// get nomes orcamento. Retorna um vetor de strings com os nomes dos eventos
	public String[] getNomesOrcamento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesOrcamento();

	}

	// get nome eventos. Retorna uma String com o nome do evento
	public String getNomeEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getNomeEvento();
		return s;
	}

	// get data evento. Retorna uma String com a data do evento
	public String getDataEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getDataEvento();
		return s;
	}

	// get hora inicio. Retorna uma String com a hora do início do evento evento
	public String getHoraiEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHoraiEvento();
		return s;
	}

	// get hora final. Retorna uma String com a hora do término do evento
	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}

	// get endereco. Retorna uma String com o endereço do evento
	public String getEndereco(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getEndereco();
		return s;
	}

	// get CEP. Retorna uma String com o CEP do evento
	public String getCep(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getCep();
		return s;
	}

	// get complemento. Retorna uma String com o complemento do evento
	public String getComplemento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getComplemento();
		return s;
	}

	// get total Convidados. Retorna um inteiro com o Total de convidadados do
	// evento
	public int getTotalConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalConvidados();

	}

	// get taxa tarefas. Retorna um double com a Taxa de Tarefas do evento
	public double getTaxaTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTaxaTarefas();
	}

	// get orcamento previsto. Retorna um double com o orçamento Previsto do evento
	public double getOrcamentoPrevisto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getOrcamentoPrevisto();
	}

	// get total gastos. Retorna um double com o Gasto Total do evento
	public double getTotalGasto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalGasto();
	}

	// get adicionar e editar um evento. Retorna um boolean com o erro de
	// preenchimento
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
						dadosEvento[6], dadosEvento[7], Double.parseDouble(dadosEvento[8]));
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
				controlEvento.setOrcamentoPrevisto(Double.parseDouble(dadosEvento[8]));
			}
			return true;
		}

	}

	// get adicionar e editar um convidado.
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

	// get adicionar e editar tarefas.
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

	// get adicionar e editar bebida.
	public boolean adicionarEditarBebida(int op, int posEvento, int posOrcamento, String[] dadosBebida) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));

		if (op == 1) {

			Bebida e = new Bebida(1, dadosBebida[1], Integer.parseInt(dadosBebida[2]),
					Double.parseDouble(dadosBebida[3]), Double.parseDouble(dadosBebida[4]),
					Boolean.parseBoolean(dadosBebida[5]), Boolean.parseBoolean(dadosBebida[6]));
			Orcamento o = new Bebida(1, dadosBebida[1], Integer.parseInt(dadosBebida[2]),
					Double.parseDouble(dadosBebida[3]), Double.parseDouble(dadosBebida[4]),
					Boolean.parseBoolean(dadosBebida[5]), Boolean.parseBoolean(dadosBebida[6]));
			controlEvento.adicionarBebida(e);
			controlEvento.adicionarOrcamento(o);

		} else {

			controlOrcamento.setDescricao(dadosBebida[1]);
			controlOrcamento.setValorTotal(Double.parseDouble(dadosBebida[4]));
			controlBebida.setDescricao(dadosBebida[1]);
			controlBebida.setQuantidade(Integer.parseInt(dadosBebida[2]));
			controlBebida.setValorUnitario(Double.parseDouble(dadosBebida[3]));
			controlBebida.setValorTotal(Double.parseDouble(dadosBebida[4]));
			controlBebida.setBebidaQuente(Boolean.parseBoolean(dadosBebida[5]));
			controlBebida.setAlcoolico(Boolean.parseBoolean(dadosBebida[6]));

		}
		return true;

	}

	// get adicionar e editar uma comida.
	public boolean adicionarEditarComida(int op, int posEvento, int posOrcamento, String[] dadosComida) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		if (op == 1) {

			Comida e = new Comida(2, dadosComida[1], Integer.parseInt(dadosComida[2]),
					Double.parseDouble(dadosComida[3]), Double.parseDouble(dadosComida[4]),
					Boolean.parseBoolean(dadosComida[5]), Boolean.parseBoolean(dadosComida[6]),
					Boolean.parseBoolean(dadosComida[7]));
			Orcamento o = new Comida(2, dadosComida[1], Integer.parseInt(dadosComida[2]),
					Double.parseDouble(dadosComida[3]), Double.parseDouble(dadosComida[4]),
					Boolean.parseBoolean(dadosComida[5]), Boolean.parseBoolean(dadosComida[6]),
					Boolean.parseBoolean(dadosComida[7]));
			controlEvento.adicionarComida(e);
			controlEvento.adicionarOrcamento(o);

		} else {

			controlOrcamento.setDescricao(dadosComida[1]);
			controlOrcamento.setValorTotal(Double.parseDouble(dadosComida[4]));
			controlComida.setDescricao(dadosComida[1]);
			controlComida.setQuantidade(Integer.parseInt(dadosComida[2]));
			controlComida.setValorTotal(Double.parseDouble(dadosComida[3]));
			controlComida.setValorUnitario(Double.parseDouble(dadosComida[4]));
			controlComida.setPrincipal(Boolean.parseBoolean(dadosComida[5]));
			controlComida.setDegustativo(Boolean.parseBoolean(dadosComida[6]));
			controlComida.setSobremesa(Boolean.parseBoolean(dadosComida[7]));

		}
		return true;

	}

	// get adicionar e editar infraestrutura.
	public boolean adicionarEditarInfraestrutura(int op, int posEvento, int posOrcamento,
			String[] dadosInfraestrutura) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		if (op == 1) {

			Infraestrutura e = new Infraestrutura(3, dadosInfraestrutura[1], Double.parseDouble(dadosInfraestrutura[2]),
					Boolean.parseBoolean(dadosInfraestrutura[3]), Boolean.parseBoolean(dadosInfraestrutura[4]),
					Boolean.parseBoolean(dadosInfraestrutura[5]), Boolean.parseBoolean(dadosInfraestrutura[6]),
					Boolean.parseBoolean(dadosInfraestrutura[7]), Boolean.parseBoolean(dadosInfraestrutura[8]));
			Orcamento o = new Infraestrutura(3, dadosInfraestrutura[1], Double.parseDouble(dadosInfraestrutura[2]),
					Boolean.parseBoolean(dadosInfraestrutura[3]), Boolean.parseBoolean(dadosInfraestrutura[4]),
					Boolean.parseBoolean(dadosInfraestrutura[5]), Boolean.parseBoolean(dadosInfraestrutura[6]),
					Boolean.parseBoolean(dadosInfraestrutura[7]), Boolean.parseBoolean(dadosInfraestrutura[8]));
			controlEvento.adicionarInfraestrutura(e);
			controlEvento.adicionarOrcamento(o);

		} else {

			controlOrcamento.setDescricao(dadosInfraestrutura[1]);
			controlOrcamento.setValorTotal(Double.parseDouble(dadosInfraestrutura[2]));
			controlInfraestrutura.setDescricao(dadosInfraestrutura[1]);
			controlInfraestrutura.setValorTotal(Double.parseDouble(dadosInfraestrutura[2]));
			controlInfraestrutura.setDecoracao(Boolean.parseBoolean(dadosInfraestrutura[3]));
			controlInfraestrutura.setEstacionamento(Boolean.parseBoolean(dadosInfraestrutura[4]));
			controlInfraestrutura.setImobiliario(Boolean.parseBoolean(dadosInfraestrutura[5]));
			controlInfraestrutura.setInternet(Boolean.parseBoolean(dadosInfraestrutura[6]));
			controlInfraestrutura.setEquipamento(Boolean.parseBoolean(dadosInfraestrutura[7]));
			controlInfraestrutura.setToalete(Boolean.parseBoolean(dadosInfraestrutura[8]));

		}
		return true;

	}

	// get adicionar e editar musica
	public boolean adicionarEditarMusica(int op, int posEvento, int posOrcamento, String[] dadosMusica) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		if (op == 1) {

			Musica e = new Musica(4, dadosMusica[1], Double.parseDouble(dadosMusica[2]), dadosMusica[3],
					Boolean.parseBoolean(dadosMusica[4]), Boolean.parseBoolean(dadosMusica[5]));
			Orcamento o = new Musica(4, dadosMusica[1], Double.parseDouble(dadosMusica[2]), dadosMusica[3],
					Boolean.parseBoolean(dadosMusica[4]), Boolean.parseBoolean(dadosMusica[5]));
			controlEvento.adicionarMusica(e);
			controlEvento.adicionarOrcamento(o);

		} else {

			controlOrcamento.setDescricao(dadosMusica[1]);
			controlOrcamento.setValorTotal(Double.parseDouble(dadosMusica[2]));
			controlMusica.setDescricao(dadosMusica[1]);
			controlMusica.setValorTotal(Double.parseDouble(dadosMusica[2]));
			controlMusica.setGeneroMusical(dadosMusica[3]);
			controlMusica.setBanda(Boolean.parseBoolean(dadosMusica[4]));
			controlMusica.setDj(Boolean.parseBoolean(dadosMusica[5]));

		}
		return true;

	}

	// get adicionar e editar programacao.
	public boolean adicionarEditarProgramacao(int op, int posEvento, int posProgramacao, String[] dadosProgramacao) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));

		if (op == 1) {

			Programacao e = new Programacao(dadosProgramacao[0], dadosProgramacao[1]);
			controlEvento.adicionarProgramacao(e);

		} else {

			controlProgramacao.setDescricao(dadosProgramacao[0]);
			controlProgramacao.setHora(dadosProgramacao[1]);

		}
		return true;

	}

	/*
	 * Objetivo:Remover evento; Entrada: posicao;
	 */
	public boolean removerEvento(int posicao) {
		if (banco.removerEvento(posicao)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover conviadado; Entrada: posEvento, posConvidado;
	 */
	public boolean removerConvidado(int posEvento, int posConvidado) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerConvidado(posConvidado)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover tarefa; Entrada: posEvento, posTarefa;
	 */
	public boolean removerTarefa(int posEvento, int posTarefa) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerTarefa(posTarefa)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover bebida; Entrada: posEvento, posOrcamento;
	 */
	public boolean removerBebida(int posEvento, int posOrcamento) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		if (controlEvento.removerOrcamento(posOrcamento) && controlEvento.removerBebida(aux)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover comida; Entrada: posEvento, posOrcamento;
	 */
	public boolean removerComida(int posEvento, int posOrcamento) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		if (controlEvento.removerOrcamento(posOrcamento) && controlEvento.removerComida(aux)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover infraestrutura; Entrada: posEvento, posOrcamento;
	 */
	public boolean removerInfraestrutura(int posEvento, int posOrcamento) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		if (controlEvento.removerOrcamento(posOrcamento) && controlEvento.removerInfraestrutura(aux)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover musica; Entrada: posEvento, posOrcamento;
	 */
	public boolean removerMusica(int posEvento, int posOrcamento) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		if (controlEvento.removerOrcamento(posOrcamento) && controlEvento.removerMusica(aux)) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Objetivo:Remover Programacao; Entrada: posEvento, posOrcamento;
	 */
	public boolean removerProgramacao(int posEvento, int posProgramacao) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerProgramacao(posProgramacao)) {
			return true;
		} else {
			return false;
		}

	}

	// get da quantidade de eventos
	public int getQtdEventos() {
		setQtdEventos();
		return qtdEventos;
	}

	// set da quantidade de eventos
	public void setQtdEventos() {
		this.qtdEventos = banco.getQtdEventos();

	}

	// get Nome convidado
	public String getNomeConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getNome();
	}

	// get quantidade acompanante convidado
	public int getQuantAcompanhanteConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getQuantAcompanhanteConvidado();
	}

	// get Telefone
	public String getTelefone(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getTelefone();
	}

	// get Email
	public String getEmail(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEmail();
	}

	// get rede Social
	public String getRedeSocial(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getRedeSocial();
	}

	// get endereco convidado
	public String getEndConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEnd();
	}

	// get CEP convidado
	public String getCepConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getCEP();
	}

	// get Complemento convidado
	public String getComplemenConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getComplemenConvidado();
	}

	// get descricao tarefa
	public String getDescricaoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDescricao();
	}

	// get data limite tarefa
	public String getDataLimiteTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDataLimite();
	}

	// getconcluido tarefa
	public boolean getConcluidoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getConcluidoTarefa();
	}

	/*
	 * Objetivo:Validar orçamento; Entrada: tipo, Evento evento, Orcamento
	 * orcamento;
	 */
	public int validaOrcamento(int tipo, Evento evento, Orcamento orcamento) {
		int i;
		int retorno = -1;
		if (tipo == 1) {

			ArrayList<Bebida> bdBebida = evento.getBdBebida();
			for (i = 0; i < bdBebida.size(); i++) {

				if (orcamento.getDescricao() == bdBebida.get(i).getDescricao())
					retorno = i;

				else
					retorno = -1;

			}

		} else if (tipo == 2) {

			ArrayList<Comida> bdComida = evento.getBdComida();
			for (i = 0; i < bdComida.size(); i++) {

				if (orcamento.getDescricao() == bdComida.get(i).getDescricao())
					retorno = i;

				else
					retorno = -1;

			}

		} else if (tipo == 3) {

			ArrayList<Infraestrutura> bdInfraestrutura = evento.getBdInfraestrutura();
			for (i = 0; i < bdInfraestrutura.size(); i++) {

				if (orcamento.getDescricao() == bdInfraestrutura.get(i).getDescricao())
					retorno = i;

				else
					retorno = -1;

			}

		} else if (tipo == 4) {

			ArrayList<Musica> bdMusica = evento.getBdMusica();
			for (i = 0; i < bdMusica.size(); i++) {

				if (orcamento.getDescricao() == bdMusica.get(i).getDescricao())
					retorno = i;

				else
					retorno = -1;

			}

		} else
			retorno = -1;
		return retorno;

	}

	// get tipo orçamento; Entradas:posEvento, posOrcamento;

	public int getTipoOrcamento(int posEvento, int posOrcamento) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		return controlOrcamento.getTipoOrcamento();

	}

	// get Descrição bebida; Entradas:posEvento, posOrcamento;
	public String getDescricaoBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));

		return controlBebida.getDescricao();
	}

	// get valor total bebida; Entradas:posEvento, posOrcamento;
	public double getValorTotalBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.getValorTotalOrcamento();
	}

	// get valor unitario bebida; Entradas:posEvento, posOrcamento;
	public double getValorUnitarioBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.getValorUnitarioOrcamento();
	}

	// get valor quantidade bebida; Entradas:posEvento, posOrcamento;
	public int getValorQuantidadeBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.getValorQuantidadeOrcamento();
	}

	// get bebida quente; Entradas:posEvento, posOrcamento;
	public boolean getBebidaQuente(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));

		return controlBebida.isBebidaQuente();
	}

	// get bebida alcoolica; Entradas:posEvento, posOrcamento;
	public boolean getAlcoolico(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.isAlcoolico();

	}

	// get descrição comida; Entradas:posEvento, posOrcamento;
	public String getDescricaoComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.getDescricao();
	}

	// get valor total comida; Entradas:posEvento, posOrcamento;
	public double getValorTotalComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));
		return controlComida.getValorTotalOrcamento();
	}

	// get valor unitario comida; Entradas:posEvento, posOrcamento;
	public double getValorUnitarioComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));
		return controlComida.getValorUnitarioOrcamento();
	}

	// get valor quantidade comida; Entradas:posEvento, posOrcamento;
	public int getValorQuantidadeComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));
		return controlComida.getValorQuantidadeOrcamento();
	}

	// get principal comida; Entradas:posEvento, posOrcamento;
	public boolean getPrincipal(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.isPrincipal();
	}

	// get degustativo comida; Entradas:posEvento, posOrcamento;
	public boolean getDegustativo(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.isDegustativo();
	}

	// get sobremessa da comida; Entradas:posEvento, posOrcamento;
	public boolean getSobremesa(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.isSobremesa();
	}

	// get descrição infraestrutra; Entradas:posEvento, posOrcamento;
	public String getDescricaoInfraestrutura(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.getDescricao();
	}

	// get valor total infraestrutra; Entradas:posEvento, posOrcamento;
	public double getValorTotalInfraestrutura(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));
		return controlInfraestrutura.getValorTotalInfraestrutura();
	}

	// get decoração infraestrutra; Entradas:posEvento, posOrcamento;
	public boolean getDecoracao(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.isDecoracao();
	}

	// get estacionamento infraestrutra; Entradas:posEvento, posOrcamento;
	public boolean getEstacionamento(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.isEstacionamento();
	}

	// get imobiliario infraestrutra; Entradas:posEvento, posOrcamento
	public boolean getImobiliario(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.isImobiliario();
	}

	// get internet infraestrutra; Entradas:posEvento, posOrcamento
	public boolean getInternet(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.isInternet();
	}

	// get equipamento infraestrutra; Entradas:posEvento, posOrcamento
	public boolean getEquipamento(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.isEquipamento();
	}

	// get toalete infraestrutra; Entradas:posEvento, posOrcamento
	public boolean getToalete(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
				controlEvento.getBdInfraestrutura().get(aux));

		return controlInfraestrutura.isToalete();
	}

	// get descrição musica; Entradas:posEvento, posOrcamento
	public String getDescricaoMusica(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.getDescricao();
	}

	// get Valor total musica; Entradas:posEvento, posOrcamento
	public double getValorTotalMusica(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));
		return controlMusica.getValorTotalMusica();
	}

	// get genero musical musica; Entradas:posEvento, posOrcamento
	public String getGeneroMusical(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.getGeneroMusical();
	}

	// get DJ musica; Entradas:posEvento, posOrcamento
	public boolean getDj(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.isDj();
	}

	// get banda musica; Entradas:posEvento, posOrcamento
	public boolean getBanda(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.isBanda();
	}

	// get descrição Programação; Entradas:pos

	public String[] getDescricaoProgramacao(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getDescricaoProgramacao();
	}

	// get Hora Programação; Entradas:pos
	public String[] getHoraProgramacao(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getHoraProgramacao();
	}

	// get descrição Pro; Entradas: posEvento, posProgramacao
	public String getDescricaoPro(int posEvento, int posProgramacao) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));
		return controlProgramacao.getDescricao();
	}

	// get Hora Pro; Entradas: posEvento, posProgramacao
	public String getHoraPro(int posEvento, int posProgramacao) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));
		return controlProgramacao.getHora();
	}

	/*
	 * Objetivo: Validar a data se estiver informada incorretamente. retorna
	 * verdadeiro se a data estiver no formato correto e dentro do padrão do
	 * localDate
	 */

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
	/*
	 * Objetivo: Validar a hora se estiver informada incorretamente. retorna
	 * verdadeiro se a hora estiver no formato correto
	 */

	public boolean validaHora(String hora) {
		int horas, minutos;
		try {
			String[] hm = hora.split(":"); // divide em um vetor de strings
			horas = Integer.parseInt(hm[0]); // transforma a string em int
			minutos = Integer.parseInt(hm[1]);
			if (horas > 24 || horas < 0 || minutos > 59 || minutos < 0)
				return false;
			else
				return true;
		} catch (IndexOutOfBoundsException iob) {
			return false;
		}

	}
	/*
	 * Objetivo: Validar o Cep se estiver informada incorretamente. retorna
	 * verdadeiro se o Cep estiver no formato correto
	 */

	public boolean validaCEP(String cep) {
		try {
			String[] digitos = cep.split("-"); // divide em um vetor de strings
			if (!digitos[0].matches("[0-9]+") || !digitos[1].matches("[0-9]+")) // se for diferente de número
				return false;
			else
				return true;
		} catch (IndexOutOfBoundsException iob) {
			return false;
		}

	}

}
