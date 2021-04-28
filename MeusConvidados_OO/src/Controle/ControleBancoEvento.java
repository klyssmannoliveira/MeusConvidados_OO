package Controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Modelo.*;

/**
 * Classe denominada Controle Banco Evento, tem como fun��o controlar os dados dos eventos. 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleBancoEvento {

	private BancoEvento banco = new BancoEvento(); // instancia��o da classe banco evento
	private int qtdEventos; // quantidade evento.

	/**
	 * Construtor da Classe Controle Banco Evento
	 * 
	 * @param dados Inicializando dados e quantidade de eventos.
	 */

	public ControleBancoEvento(ControleBancoEvento dados) {
		banco = dados.getBanco();
		qtdEventos = dados.getQtdEventos();
	}

	/**
	 * Construtor padr�o da Classe Controle Banco Evento, sem par�metros de
	 * entradas.
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

	/**
	 * Get dos nomes dos eventos.
	 * 
	 * @return Gera uma String com os nomes dos eventos cadastrados, que � utilizado
	 *         no JList na janela de evento.
	 */

	public String[] getNomeEventos() {
		String[] auxiliar = new String[banco.getBdEventos().size()];

		for (int i = 0; i < banco.getBdEventos().size(); i++) {
			auxiliar[i] = i + 1 + " - " + banco.getBdEventos().get(i).getNomeEvento();
		}
		return auxiliar;
	}

	/**
	 * Get dos nomes dos convidadeos
	 * 
	 * @param pos Posi��o do evento para listar os nomes do convidados.
	 * @return Um vetor de Strings com os nomes dos convidados
	 */

	public String[] getNomesConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesConvidados();
	}

	/**
	 * Get dos nomes das tarefas.
	 * 
	 * @param pos Posi��o do evento para listar as descri��es das tarefas do
	 *            eventos.
	 * @return Um vetor de Strings com as tarefas do evento.
	 */

	public String[] getNomesTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesTarefas();

	}

	/**
	 * Get dos nomes do or�amento.
	 * 
	 * @param pos Posi��o do evento para listar as descri��es do or�amento do
	 *            eventos.
	 * @return Um vetor de Strings com os or�amentos do evento.
	 */

	public String[] getNomesOrcamento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesOrcamento();

	}

	/**
	 * Get do nome dos eventos.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o nome do evento.
	 */

	public String getNomeEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getNomeEvento();
		return s;
	}

	/**
	 * Get da data do evento.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna a data do evento.
	 */

	public String getDataEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getDataEvento();
		return s;
	}

	/**
	 * Get da hora inicio do evento.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna a hora inicial do evento.
	 */

	public String getHoraiEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHoraiEvento();
		return s;
	}

	/**
	 * Get da hora final do evento.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna a hora final do evento.
	 */

	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}

	/**
	 * Get Endere�o do evento.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o endere�o do evento.
	 */

	public String getEndereco(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getEndereco();
		return s;
	}

	/**
	 * Get CEP do evento.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o CEP do evento.
	 */

	public String getCep(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getCep();
		return s;
	}

	/**
	 * Get Complemento do evento.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o complemento do evento.
	 */

	public String getComplemento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getComplemento();
		return s;
	}

	/**
	 * Get total de convidados.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o total de convidado do evento.
	 */

	public int getTotalConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalConvidados();

	}

	/**
	 * Get taxa de tarefas.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna a taxa de tarefas do evento.
	 * 
	 */

	public double getTaxaTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTaxaTarefas();
	}

	/**
	 * Get or�amento previsto.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o or�amento previsto do evento.
	 * 
	 */

	public double getOrcamentoPrevisto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getOrcamentoPrevisto();
	}

	/**
	 * Get Total de gastos.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna o total de gastos do evento.
	 * 
	 */

	public double getTotalGasto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalGasto();
	}

	/**
	 * M�todo que adiciona e edita um evento.
	 * 
	 * @param op          Destingui se � um cadastro de um evento novo ou uma edi��o
	 *                    de um cadastro existente, (1) - Cadastro novo, se n�o,
	 *                    edita um cadastro existente do evento.
	 * @param pos         Posi��o do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         do evento.
	 */

	public boolean adicionarEditarEvento(int op, int pos, String[] dadosEvento) {

		if (!validaCampo(dadosEvento[1])) { // Verfica descri��o
			return false;
		}

		if (!validaData(dadosEvento[2])) { // data
			return false;
		}

		if (!validaHora(dadosEvento[3])) { // hora in�cio
			return false;
		}

		if (!validaHora(dadosEvento[4])) { // hora t�rmino
			return false;
		}

		if (!validaCampo(dadosEvento[5])) { // Endere�o
			return false;
		}

		if (!validaCEP(dadosEvento[6])) { // CEP
			return false;
		}

		if (!validaCampo(dadosEvento[7])) { // Complemento
			return false;
		}

		if (!validaDouble(dadosEvento[8])) { // Complemento
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

	/**
	 * M�todo que adiciona e edita um convidado.
	 * 
	 * @param op          Destingui se � um cadastro de um convidado novo ou uma
	 *                    edi��o de um cadastro existente para um evento, (1) -
	 *                    Cadastro novo, se n�o, edita um cadastro existente do
	 *                    convidado.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosConvidados Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         do convidado.
	 */

	public boolean adicionarEditarConvidado(int op, int posEvento, int posConvidado, String[] dadosConvidados) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosConvidados[1])) { // Nome
			return false;
		}
		if (!validaInteiro(dadosConvidados[2])) { // Quantidade de acompanhantes
			return false;
		}

		if (!validaInteiro(dadosConvidados[2])) { // Quantidade de acompanhantes
			return false;
		}

		if (!validaEmail(dadosConvidados[3])) { // Email
			return false;
		}

		if (!validaCampo(dadosConvidados[4])) { // redeSocial
			return false;
		}

		if (!validaCampo(dadosConvidados[5])) { // Endereco
			return false;
		}

		if (!validaCampo(dadosConvidados[7])) { // complemento
			return false;
		}
		if (!validaCEP(dadosConvidados[6])) { // CEP
			return false;
		}
		if (!validaTelefone(dadosConvidados[8])) { // Telefone
			return false;
		}

		else {
			if (op == 1) {

				Convidado e = new Convidado(dadosConvidados[1], Integer.parseInt(dadosConvidados[2]),
						dadosConvidados[8], dadosConvidados[3], dadosConvidados[4], dadosConvidados[5],
						dadosConvidados[6], dadosConvidados[7]);
				controlEvento.adicionarConvidado(e);

			} else {
				ControleConvidado controlConvidado = new ControleConvidado(
						controlEvento.getBdConvidados().get(posConvidado));
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

	/**
	 * M�todo que adiciona e edita uma Tarefa.
	 * 
	 * @param op          Destingui se � um cadastro de uma tarefa nova ou uma
	 *                    edi��o de um cadastro existente para uma tarefa, (1) -
	 *                    Cadastro novo, se n�o, edita um cadastro existente da
	 *                    tarefa.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosTarefa Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta.
	 */

	public boolean adicionarEditarTarefa(int op, int posEvento, int posTarefa, String[] dadosTarefa) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosTarefa[1])) { // Descricao
			return false;
		}
		if (!validaData(dadosTarefa[2])) { // data
			return false;
		} else {

			if (op == 2) {

				Tarefa e = new Tarefa(dadosTarefa[1], dadosTarefa[2], Boolean.parseBoolean(dadosTarefa[3]));
				controlEvento.adicionarTarefa(e);

			} else {
				ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
				controlTarefa.setDescricao(dadosTarefa[1]);
				controlTarefa.setDataLimite(dadosTarefa[2]);
				controlTarefa.setConcluidoTarefa(Boolean.parseBoolean(dadosTarefa[3]));

			}
			return true;
		}

	}

	/**
	 * M�todo que adiciona e edita uma Bebida.
	 * 
	 * @param op          Destingui se � um cadastro de uma bebida nova ou uma
	 *                    edi��o de um cadastro existente para uma bebida, (1) -
	 *                    Cadastro novo, se n�o, edita um cadastro existente da
	 *                    bebida.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosBebida Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         da bebida.
	 */

	public boolean adicionarEditarBebida(int op, int posEvento, int posOrcamento, String[] dadosBebida) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosBebida[1])) { // Descricao
			return false;
		}
		if (!validaInteiro(dadosBebida[2])) { // Quantidade
			return false;
		}
		if (!validaDouble(dadosBebida[3])) { // Valor unitario
			return false;
		}
		if (!validaDouble(dadosBebida[4])) { // Valor Total
			return false;
		} else {
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
				ControleOrcamento controlOrcamento = new ControleOrcamento(
						controlEvento.getBdOrcamentos().get(posOrcamento));
				aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
				ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
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

	}

	/**
	 * M�todo que adiciona e edita uma Comida.
	 * 
	 * @param op          Destingui se � um cadastro de uma comida nova ou uma
	 *                    edi��o de um cadastro existente para uma comida, (1) -
	 *                    Cadastro novo, se n�o, edita um cadastro existente da
	 *                    comida.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosComida Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         da comida.
	 */

	public boolean adicionarEditarComida(int op, int posEvento, int posOrcamento, String[] dadosComida) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosComida[1])) { // Descricao
			return false;
		}
		if (!validaInteiro(dadosComida[2])) { // Quantidade
			return false;
		}
		if (!validaDouble(dadosComida[3])) { // Valor Unitario
			return false;
		}
		if (!validaDouble(dadosComida[4])) { // Valor Total
			return false;
		}

		else {
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
				ControleOrcamento controlOrcamento = new ControleOrcamento(
						controlEvento.getBdOrcamentos().get(posOrcamento));
				aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
				ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

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

	}

	/**
	 * M�todo que adiciona e edita uma Infraestrutura.
	 * 
	 * @param op          Destingui se � um cadastro de uma infraestrutura nova ou
	 *                    uma edi��o de um cadastro existente para uma
	 *                    infraestrutura, (1) - Cadastro novo, se n�o, edita um
	 *                    cadastro existente da infraestrutura.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosInfraestrutura Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         da infraestrutura.
	 */

	public boolean adicionarEditarInfraestrutura(int op, int posEvento, int posOrcamento,
			String[] dadosInfraestrutura) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosInfraestrutura[1])) { // Descricao
			return false;
		}
		if (!validaDouble(dadosInfraestrutura[2])) { // Quantidade
			return false;
		} else {
			if (op == 1) {

				Infraestrutura e = new Infraestrutura(3, dadosInfraestrutura[1],
						Double.parseDouble(dadosInfraestrutura[2]), Boolean.parseBoolean(dadosInfraestrutura[3]),
						Boolean.parseBoolean(dadosInfraestrutura[4]), Boolean.parseBoolean(dadosInfraestrutura[5]),
						Boolean.parseBoolean(dadosInfraestrutura[6]), Boolean.parseBoolean(dadosInfraestrutura[7]),
						Boolean.parseBoolean(dadosInfraestrutura[8]));
				Orcamento o = new Infraestrutura(3, dadosInfraestrutura[1], Double.parseDouble(dadosInfraestrutura[2]),
						Boolean.parseBoolean(dadosInfraestrutura[3]), Boolean.parseBoolean(dadosInfraestrutura[4]),
						Boolean.parseBoolean(dadosInfraestrutura[5]), Boolean.parseBoolean(dadosInfraestrutura[6]),
						Boolean.parseBoolean(dadosInfraestrutura[7]), Boolean.parseBoolean(dadosInfraestrutura[8]));
				controlEvento.adicionarInfraestrutura(e);
				controlEvento.adicionarOrcamento(o);

			} else {
				ControleOrcamento controlOrcamento = new ControleOrcamento(
						controlEvento.getBdOrcamentos().get(posOrcamento));
				aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
				ControleInfraestrutura controlInfraestrutura = new ControleInfraestrutura(
						controlEvento.getBdInfraestrutura().get(aux));

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

	}

	/**
	 * M�todo que adiciona e edita uma Musica.
	 * 
	 * @param op          Destingui se � um cadastro de uma musica nova ou uma
	 *                    edi��o de um cadastro existente para uma musica, (1) -
	 *                    Cadastro novo, se n�o, edita um cadastro existente da
	 *                    musica.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosMusica Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         da musica.
	 */
	public boolean adicionarEditarMusica(int op, int posEvento, int posOrcamento, String[] dadosMusica) {

		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosMusica[1])) {
			return false;
		}
		if (!validaDouble(dadosMusica[2])) {
			return false;
		}
		if (!validaCampo(dadosMusica[3])) {
			return false;
		} else {
			if (op == 1) {

				Musica e = new Musica(4, dadosMusica[1], Double.parseDouble(dadosMusica[2]), dadosMusica[3],
						Boolean.parseBoolean(dadosMusica[4]), Boolean.parseBoolean(dadosMusica[5]));
				Orcamento o = new Musica(4, dadosMusica[1], Double.parseDouble(dadosMusica[2]), dadosMusica[3],
						Boolean.parseBoolean(dadosMusica[4]), Boolean.parseBoolean(dadosMusica[5]));
				controlEvento.adicionarMusica(e);
				controlEvento.adicionarOrcamento(o);

			} else {
				ControleOrcamento controlOrcamento = new ControleOrcamento(
						controlEvento.getBdOrcamentos().get(posOrcamento));
				aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
				ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));
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
	}

	/**
	 * M�todo que adiciona e edita uma programa��o do evento.
	 * 
	 * @param op          Destingui se � um cadastro de uma programa��o ou uma
	 *                    edi��o de um cadastro existente para uma programa��o, (1)
	 *                    - Cadastro novo, se n�o, edita um cadastro existente da
	 *                    programa��o.
	 * 
	 * @param posEvento         Posi��o do evento.
	 * @param dadosProgramacao Dados preenchidos na janela View e eles s�o armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edi��o correta
	 *         da programa��o.
	 */
	public boolean adicionarEditarProgramacao(int op, int posEvento, int posProgramacao, String[] dadosProgramacao) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));

		if (!validaCampo(dadosProgramacao[0])) {
			return false;
		}
		if (!validaHora(dadosProgramacao[1])) {
			return false;
		} else {
			if (op == 1) {

				Programacao e = new Programacao(dadosProgramacao[0], dadosProgramacao[1]);
				controlEvento.adicionarProgramacao(e);

			} else {
				ControleProgramacao controlProgramacao = new ControleProgramacao(
						controlEvento.getBdProgramacao().get(posProgramacao));
				controlProgramacao.setDescricao(dadosProgramacao[0]);
				controlProgramacao.setHora(dadosProgramacao[1]);

			}
			return true;
		}

	}

	/**
	 * M�todo que remove um evento.
	 * 
	 * @param posicao Refere a posi��o do evento a ser excluido.
	 * @return Retorna verdadeiro ou falso para indicar se o evento foi removido ou
	 *         nao.
	 */

	public boolean removerEvento(int posicao) {
		if (banco.removerEvento(posicao)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * M�todo que remove convidado do evento
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado dentro do evento para ser removido
	 * @return Retorna verdadeiro ou falso para indicar se o convidado foi removido
	 *         ou nao.
	 */

	public boolean removerConvidado(int posEvento, int posConvidado) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerConvidado(posConvidado)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * M�todo que remove a tarefa do evento.
	 * 
	 * @param posEvento Posi��o do evento.
	 * @param posTarefa Posi��o da tarefa dentro do evento para ser removido.
	 * @return Retorna verdadeiro ou falso para indicar se a tarefa foi removida ou
	 *         nao.
	 */
	public boolean removerTarefa(int posEvento, int posTarefa) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		if (controlEvento.removerTarefa(posTarefa)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * M�todo que remove a bebida do evento.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento dentro do evento para encontrar a
	 *                     bebida a ser removida.
	 * @return Retorna verdadeiro ou falso para indicar se a bebida foi removida ou
	 *         nao.
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

	/**
	 * M�todo que remove a comida do evento.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento dentro do evento para encontrar a
	 *                     comida a ser removida.
	 * @return Retorna verdadeiro ou falso para indicar se a comida foi removida ou
	 *         nao.
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

	/**
	 * M�todo que remove a infraestrutura do evento.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento dentro do evento para encontrar a
	 *                     infraestrutura a ser removida.
	 * @return Retorna verdadeiro ou falso para indicar se a infraestrutura foi
	 *         removida ou nao.
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

	/**
	 * M�todo que remove a musica do evento.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento dentro do evento para encontrar a
	 *                     musica a ser removida.
	 * @return Retorna verdadeiro ou falso para indicar se a musica foi removida ou
	 *         nao.
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

	/**
	 * M�todo que remove a programa��o do evento.
	 * 
	 * @param posEvento      Posi��o do evento.
	 * @param posProgramacao Posi��o da programa��o dentro do evento a ser removida.
	 * @return Retorna verdadeiro ou falso para indicar se a programa��o foi
	 *         removida ou nao.
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

	/**
	 * Get nome do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna o nome do convidado.
	 */

	public String getNomeConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getNome();
	}

	/**
	 * Get Quantidade de acompanhante do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna a quantidade de acompanhante do convidado.
	 */
	public int getQuantAcompanhanteConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getQuantAcompanhanteConvidado();
	}

	/**
	 * Get Telefone do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna o telefone do convidado.
	 */

	public String getTelefone(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getTelefone();
	}

	/**
	 * Get Email do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna o Email do convidado.
	 */

	public String getEmail(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEmail();
	}

	/**
	 * Get Rede social do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna a rede social do convidado.
	 */
	public String getRedeSocial(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getRedeSocial();
	}

	/**
	 * Get Endere�o do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna o endere�o do convidado.
	 */

	public String getEndConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEnd();
	}

	/**
	 * Get CEP do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna o CEP do convidado.
	 */

	public String getCepConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getCEP();
	}

	/**
	 * Get Complemento do endere�o do convidado.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posConvidado Posi��o do convidado.
	 * @return Retorna o complemento do endere�o do convidado.
	 */

	public String getComplemenConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getComplemenConvidado();
	}

	/**
	 * Get Descri��o da tarefa.
	 * 
	 * @param posEvento Posi��o do evento.
	 * @param posTarefa Posi��o do tarefa.
	 * @return Retorna a descri��o da tarefa.
	 */

	public String getDescricaoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDescricao();
	}

	/**
	 * Get da Data Limite da tarefa.
	 * 
	 * @param posEvento Posi��o do evento.
	 * @param posTarefa Posi��o do tarefa.
	 * @return Retorna a data limite da tarefa.
	 */

	public String getDataLimiteTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDataLimite();
	}

	/**
	 * Get da conclus�o da tarefa.
	 * 
	 * @param posEvento Posi��o do evento.
	 * @param posTarefa Posi��o do tarefa.
	 * @return Retorna verdadeiro ou falso se a tarefa foi concluido ou n�o .
	 */

	public boolean getConcluidoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getConcluidoTarefa();
	}

	/**
	 * M�todo que retorna o interio da posi��o do or�amento do seu respectivo tipo.
	 * 
	 * @param tipo      Inteiro que indica qual or�amento ir� validar: (1) - Bebida
	 *                  (2) - Comida (3) - Infraestrutura (4) - Musica
	 * @param evento    Classe evento, onde pode ser acessado todos os atributos do
	 *                  evento.
	 * @param orcamento Classe orcamento, onde pode ser acessado todos os atributos
	 *                  do or�amento.
	 * @return retorna -1 caso ele n�o encontre o or�amento. Caso contr�rio retorna
	 *         a posi��o do seu respectivo or�amento no banco de dados relacionado
	 *         ao seu tipo.
	 * 
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

	/**
	 * Get do tipo do or�amento
	 * 
	 * @param posEvento    Posi��o do evento
	 * @param posOrcamento Posi��o do or�amento
	 * @return retorna os tipos de or�amentos sendo a bebida, comida, infraestrutura
	 *         e musica.
	 */

	public int getTipoOrcamento(int posEvento, int posOrcamento) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		return controlOrcamento.getTipoOrcamento();

	}

	/**
	 * Get Descri��o da bebida
	 * 
	 * @param posEvento    Posi��o do evento
	 * @param posOrcamento Posi��o do or�amento
	 * @return Retorna a descri��o da bebida.
	 * 
	 */

	public String getDescricaoBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));

		return controlBebida.getDescricao();
	}

	/**
	 * Get Valor total da bebida
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor total da bebida.
	 * 
	 */
	public double getValorTotalBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.getValorTotalOrcamento();
	}

	/**
	 * Get Valor unit�rio da bebida
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor unit�rio da bebida.
	 * 
	 */

	public double getValorUnitarioBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.getValorUnitarioOrcamento();
	}

	/**
	 * Get Valor da quantidade da bebida
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor da quantidade da bebida.
	 * 
	 */
	public int getValorQuantidadeBebida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.getValorQuantidadeOrcamento();
	}

	/**
	 * Get bebida quente
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se a bebida � quente ou n�o.
	 * 
	 */
	public boolean getBebidaQuente(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));

		return controlBebida.isBebidaQuente();
	}

	/**
	 * Get bebida alcoolica
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se a bebida cont�m alcool ou n�o.
	 * 
	 */
	public boolean getAlcoolico(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleBebida controlBebida = new ControleBebida(controlEvento.getBdBebida().get(aux));
		return controlBebida.isAlcoolico();

	}

	/**
	 * Get Descri��o da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna a descri��o da bebida.
	 * 
	 */
	public String getDescricaoComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.getDescricao();
	}

	/**
	 * Get valor total da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor total da comida.
	 * 
	 */

	public double getValorTotalComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));
		return controlComida.getValorTotalOrcamento();
	}

	/**
	 * Get valor unit�rio da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor unit�rio da comida.
	 * 
	 */

	public double getValorUnitarioComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));
		return controlComida.getValorUnitarioOrcamento();
	}

	/**
	 * Get valor quantidade da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor unit�rio da comida.
	 * 
	 */
	public int getValorQuantidadeComida(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));
		return controlComida.getValorQuantidadeOrcamento();
	}

	/**
	 * Get prato principal da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se a comida � prato principal ou n�o.
	 * 
	 */
	public boolean getPrincipal(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.isPrincipal();
	}

	/**
	 * Get prato degustativo da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se a comida � prato desgustativo ou n�o.
	 * 
	 */
	public boolean getDegustativo(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.isDegustativo();
	}

	/**
	 * Get sobremessa da comida.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se a comida � uma sobremessa ou n�o.
	 * 
	 */
	public boolean getSobremesa(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleComida controlComida = new ControleComida(controlEvento.getBdComida().get(aux));

		return controlComida.isSobremesa();
	}

	/**
	 * Get Descri��o infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna a descri��o da infraestrutura.
	 * 
	 */
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

	/**
	 * Get Valor total da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor total da infraestrutura.
	 * 
	 */
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

	/**
	 * Get Decora��o da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem decora��o ou n�o a infraestrutura.
	 * 
	 */
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

	/**
	 * Get Estacionamento da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem estacionamento ou n�o a
	 *         infraestrutura.
	 * 
	 */
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

	/**
	 * Get mobili�rio da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem mobili�rio ou n�o a
	 *         infraestrutura.
	 * 
	 */
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

	/**
	 * Get Internet da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem internet ou n�o a infraestrutura.
	 * 
	 */
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

	/**
	 * Get Equipamento da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem equipamento ou n�o a
	 *         infraestrutura.
	 * 
	 */
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

	/**
	 * Get Toalete da infraestrutura.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem toellete ou n�o a infraestrutura.
	 * 
	 */

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

	/**
	 * Get Descri��o da musica.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna a descri��o da musica.
	 * 
	 */
	public String getDescricaoMusica(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.getDescricao();
	}

	/**
	 * Get Valor total da musica.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o valor total da musica.
	 * 
	 */
	public double getValorTotalMusica(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));
		return controlMusica.getValorTotalMusica();
	}

	/**
	 * Get Genero musical da musica.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna o genero musical da musica.
	 * 
	 */
	public String getGeneroMusical(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.getGeneroMusical();
	}

	/**
	 * Get Dj da musica.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem DJ ou n�o.
	 * 
	 */
	public boolean getDj(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.isDj();
	}

	/**
	 * Get Banda da musica.
	 * 
	 * @param posEvento    Posi��o do evento.
	 * @param posOrcamento Posi��o do or�amento.
	 * @return Retorna verdadeiro ou falso se tem Banda musical ou n�o.
	 * 
	 */
	public boolean getBanda(int posEvento, int posOrcamento) {
		int aux;
		int tipo = getTipoOrcamento(posEvento, posOrcamento);
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		aux = validaOrcamento(tipo, controlEvento.getEvento(), controlOrcamento.getOrcamento());
		ControleMusica controlMusica = new ControleMusica(controlEvento.getBdMusica().get(aux));

		return controlMusica.isBanda();
	}

	/**
	 * Get Descri��o da programa��o.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna a lista das descri��es das programa��es.
	 * 
	 */

	public String[] getDescricaoProgramacao(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getDescricaoProgramacao();
	}

	/**
	 * Get Hora da programa��o.
	 * 
	 * @param pos Posi��o do evento.
	 * @return Retorna a lista das Horas das programa��es.
	 * 
	 */
	public String[] getHoraProgramacao(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getHoraProgramacao();
	}

	/**
	 * Get descri��o da programa��o.
	 * 
	 * @param posEvento      Posi��o do evento.
	 * @param posProgramacao Posi��o da programa��o.
	 * @return Retorna a descri��o da programa��o.
	 * 
	 */
	public String getDescricaoPro(int posEvento, int posProgramacao) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));
		return controlProgramacao.getDescricao();
	}

	/**
	 * Get Hora da programa��o.
	 * 
	 * @param posEvento      Posi��o do evento.
	 * @param posProgramacao Posi��o da programa��o.
	 * @return Retorna a Hora da programa��o.
	 * 
	 */
	public String getHoraPro(int posEvento, int posProgramacao) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));
		return controlProgramacao.getHora();
	}

	/**
	 * M�todo que valida a data se estiver informada incorretamente.
	 * 
	 * @param data � a data que ser� validada no formato correto.
	 * @return Retorna verdadeiro ou falso se a data est� correta ou n�o.
	 */

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

	/**
	 * M�todo que valida a hora se estiver informada incorretamente.
	 * 
	 * @param hora � a hora que ser� validada no formato correto.
	 * @return Retorna verdadeiro ou falso se a hora est� correta ou n�o.
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
		} catch (NumberFormatException e) {
			return false;
		}

	}

	/**
	 * M�todo que valida o CEP se estiver informada incorretamente.
	 * 
	 * @param cep � o CEP que ser� validada no formato correto.
	 * @return Retorna verdadeiro ou falso se o cep est� correto ou n�o.
	 */

	public boolean validaCEP(String cep) {
		try {
			String[] digitos = cep.split("-"); // divide em um vetor de strings
			if (!digitos[0].matches("[0-9]+") || !digitos[1].matches("[0-9]+")) // se for diferente de n�mero
				return false;
			else
				return true;
		} catch (IndexOutOfBoundsException iob) {
			return false;
		}

	}

	/**
	 * M�todo que valida o campo do preenchimento se estiver em branco.
	 * 
	 * @param campo � o campo que ser� validado se estiver em branco ou n�o.
	 * @return Retorna verdadeiro ou falso se o campo est� vazio ou n�o.
	 */

	public boolean validaCampo(String campo) {
		try {
			if (campo.isEmpty()) // se tiver vazio, retorna true dentro if
				return false;
			else
				return true;
		} catch (IndexOutOfBoundsException iob) {
			return false;
		}

	}

	/**
	 * M�todo que valida numero em formato double maior que zero.
	 * 
	 * @param dado � o valor do n�mero no formato correto ou n�o.
	 * @return Retorna verdadeiro ou falso se a o n�mero preenchido est� correta ou
	 *         n�o.
	 */

	public boolean validaDouble(String dado) {

		try {
			double d = Double.parseDouble(dado);
			if (d >= 0.0) {
				return true;
			} else
				return false;

		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * M�todo que valida numero em formato inteiro maior que zero.
	 * 
	 * @param dado � o valor do n�mero no formato correto ou n�o.
	 * @return Retorna verdadeiro ou falso se a o n�mero preenchido est� correto ou
	 *         n�o.
	 */
	public boolean validaInteiro(String dado) {
		try {
			int i = Integer.parseInt(dado);
			if (i >= 0)
				return true;
			else
				return false;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	/**
	 * M�todo que valida o Email se estiver informada incorretamente.
	 * 
	 * @param email � o email que ser� validado no formato correto.
	 * @return Retorna verdadeiro ou falso se o email est� correto ou n�o.
	 */

	public boolean validaEmail(String email) {
		boolean isEmailIdValid = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			}
		}
		return isEmailIdValid;
	}

	/**
	 * M�todo que valida o telefone se estiver informado incorretamente.
	 * 
	 * @param telefone � o telefone que ser� validado no formato correto.
	 * @return Retorna verdadeiro ou falso se o telefone est� correto ou n�o.
	 */

	public boolean validaTelefone(String telefone) {
		boolean isTelefoneIdValid = false;
		if (telefone != null && telefone.length() > 0) {
			String expression = "^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(telefone);
			if (matcher.matches()) {
				isTelefoneIdValid = true;
			}
		}
		return isTelefoneIdValid;
	}

}
