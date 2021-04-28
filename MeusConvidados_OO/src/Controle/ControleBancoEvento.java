package Controle;

/**
 * Classe denominada Controle Banco Evento, tem como função controlar os dados dos eventos. 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Modelo.*;

public class ControleBancoEvento {

	private BancoEvento banco = new BancoEvento(); // instanciação da classe banco evento
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
	 * Construtor padrão da Classe Controle Banco Evento, sem parâmetros de
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
	 * @return Gera uma String com os nomes dos eventos cadastrados, que é utilizado
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
	 * @param pos Posição do evento para listar os nomes do convidados.
	 * @return Um vetor de Strings com os nomes dos convidados
	 */

	public String[] getNomesConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesConvidados();
	}

	/**
	 * Get dos nomes das tarefas.
	 * 
	 * @param pos Posição do evento para listar as descrições das tarefas do
	 *            eventos.
	 * @return Um vetor de Strings com as tarefas do evento.
	 */

	public String[] getNomesTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesTarefas();

	}

	/**
	 * Get dos nomes do orçamento.
	 * 
	 * @param pos Posição do evento para listar as descrições do orçamento do
	 *            eventos.
	 * @return Um vetor de Strings com os orçamentos do evento.
	 */

	public String[] getNomesOrcamento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getNomesOrcamento();

	}

	/**
	 * Get do nome dos eventos.
	 * 
	 * @param pos Posição do evento.
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
	 * @param pos Posição do evento.
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
	 * @param pos Posição do evento.
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
	 * @param pos Posição do evento.
	 * @return Retorna a hora final do evento.
	 */

	public String getHorafEvento(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getHorafEvento();
		return s;
	}

	/**
	 * Get Endereço do evento.
	 * 
	 * @param pos Posição do evento.
	 * @return Retorna o endereço do evento.
	 */

	public String getEndereco(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		String s = controlEvento.getEndereco();
		return s;
	}

	/**
	 * Get CEP do evento.
	 * 
	 * @param pos Posição do evento.
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
	 * @param pos Posição do evento.
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
	 * @param pos Posição do evento.
	 * @return Retorna o total de convidado do evento.
	 */

	public int getTotalConvidados(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalConvidados();

	}

	/**
	 * Get taxa de tarefas.
	 * 
	 * @param pos Posição do evento.
	 * @return Retorna a taxa de tarefas do evento.
	 * 
	 */

	public double getTaxaTarefas(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTaxaTarefas();
	}

	/**
	 * Get orçamento previsto.
	 * 
	 * @param pos Posição do evento.
	 * @return Retorna o orçamento previsto do evento.
	 * 
	 */

	public double getOrcamentoPrevisto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getOrcamentoPrevisto();
	}

	/**
	 * Get Total de gastos.
	 * 
	 * @param pos Posição do evento.
	 * @return Retorna o total de gastos do evento.
	 * 
	 */

	public double getTotalGasto(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getTotalGasto();
	}

	/**
	 * Método que adiciona e edita um evento.
	 * 
	 * @param op          Destingui se é um cadastro de um evento novo ou uma edição
	 *                    de um cadastro existente, (1) - Cadastro novo, se não,
	 *                    edita um cadastro existente do evento.
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
	 *         do evento.
	 */

	public boolean adicionarEditarEvento(int op, int pos, String[] dadosEvento) {

		if (!validaCampo(dadosEvento[1])) { // Verfica descrição
			return false;
		}

		if (!validaData(dadosEvento[2])) { // data
			return false;
		}

		if (!validaHora(dadosEvento[3])) { // hora início
			return false;
		}

		if (!validaHora(dadosEvento[4])) { // hora término
			return false;
		}

		if (!validaCampo(dadosEvento[5])) { // Endereço
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
	 * Método que adiciona e edita um convidado.
	 * 
	 * @param op          Destingui se é um cadastro de um convidado novo ou uma
	 *                    edição de um cadastro existente para um evento, (1) -
	 *                    Cadastro novo, se não, edita um cadastro existente do
	 *                    convidado.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
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
	 * Método que adiciona e edita uma Tarefa.
	 * 
	 * @param op          Destingui se é um cadastro de uma tarefa nova ou uma
	 *                    edição de um cadastro existente para uma tarefa, (1) -
	 *                    Cadastro novo, se não, edita um cadastro existente da
	 *                    tarefa.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta.
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
	 * Método que adiciona e edita uma Bebida.
	 * 
	 * @param op          Destingui se é um cadastro de uma bebida nova ou uma
	 *                    edição de um cadastro existente para uma bebida, (1) -
	 *                    Cadastro novo, se não, edita um cadastro existente da
	 *                    bebida.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
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
	 * Método que adiciona e edita uma Comida.
	 * 
	 * @param op          Destingui se é um cadastro de uma comida nova ou uma
	 *                    edição de um cadastro existente para uma comida, (1) -
	 *                    Cadastro novo, se não, edita um cadastro existente da
	 *                    comida.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
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
	 * Método que adiciona e edita uma Infraestrutura.
	 * 
	 * @param op          Destingui se é um cadastro de uma infraestrutura nova ou
	 *                    uma edição de um cadastro existente para uma
	 *                    infraestrutura, (1) - Cadastro novo, se não, edita um
	 *                    cadastro existente da infraestrutura.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
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
	 * Método que adiciona e edita uma Musica.
	 * 
	 * @param op          Destingui se é um cadastro de uma musica nova ou uma
	 *                    edição de um cadastro existente para uma musica, (1) -
	 *                    Cadastro novo, se não, edita um cadastro existente da
	 *                    musica.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
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
	 * Método que adiciona e edita uma programação do evento.
	 * 
	 * @param op          Destingui se é um cadastro de uma programação ou uma
	 *                    edição de um cadastro existente para uma programação, (1)
	 *                    - Cadastro novo, se não, edita um cadastro existente da
	 *                    programação.
	 * 
	 * @param pos         Posição do evento.
	 * @param dadosEvento Dados preenchidos na janela View e eles são armazenados no
	 *                    banco de dados da classe evento.
	 * @return Retorna verdadeiro ou falso referente ao cadastro ou edição correta
	 *         da programação.
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
	 * Método que remove um evento.
	 * 
	 * @param posicao Refere a posição do evento a ser excluido.
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
	 * Método que remove convidado do evento
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado dentro do evento para ser removido
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
	 * Método que remove a tarefa do evento.
	 * 
	 * @param posEvento Posição do evento.
	 * @param posTarefa Posição da tarefa dentro do evento para ser removido.
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
	 * Método que remove a bebida do evento.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento dentro do evento para encontrar a
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
	 * Método que remove a comida do evento.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento dentro do evento para encontrar a
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
	 * Método que remove a infraestrutura do evento.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento dentro do evento para encontrar a
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
	 * Método que remove a musica do evento.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento dentro do evento para encontrar a
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
	 * Método que remove a programação do evento.
	 * 
	 * @param posEvento      Posição do evento.
	 * @param posProgramacao Posição da programação dentro do evento a ser removida.
	 * @return Retorna verdadeiro ou falso para indicar se a programação foi
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
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
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
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
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
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
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
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
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
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
	 * @return Retorna a rede social do convidado.
	 */
	public String getRedeSocial(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getRedeSocial();
	}

	/**
	 * Get Endereço do convidado.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
	 * @return Retorna o endereço do convidado.
	 */

	public String getEndConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getEnd();
	}

	/**
	 * Get CEP do convidado.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
	 * @return Retorna o CEP do convidado.
	 */

	public String getCepConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getCEP();
	}

	/**
	 * Get Complemento do endereço do convidado.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posConvidado Posição do convidado.
	 * @return Retorna o complemento do endereço do convidado.
	 */

	public String getComplemenConvidado(int posEvento, int posConvidado) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleConvidado controlConvidado = new ControleConvidado(controlEvento.getBdConvidados().get(posConvidado));
		return controlConvidado.getComplemenConvidado();
	}

	/**
	 * Get Descrição da tarefa.
	 * 
	 * @param posEvento Posição do evento.
	 * @param posTarefa Posição do tarefa.
	 * @return Retorna a descrição da tarefa.
	 */

	public String getDescricaoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDescricao();
	}

	/**
	 * Get da Data Limite da tarefa.
	 * 
	 * @param posEvento Posição do evento.
	 * @param posTarefa Posição do tarefa.
	 * @return Retorna a data limite da tarefa.
	 */

	public String getDataLimiteTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getDataLimite();
	}

	/**
	 * Get da conclusão da tarefa.
	 * 
	 * @param posEvento Posição do evento.
	 * @param posTarefa Posição do tarefa.
	 * @return Retorna verdadeiro ou falso se a tarefa foi concluido ou não .
	 */

	public boolean getConcluidoTarefa(int posEvento, int posTarefa) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleTarefa controlTarefa = new ControleTarefa(controlEvento.getBdTarefas().get(posTarefa));
		return controlTarefa.getConcluidoTarefa();
	}

	/**
	 * Método que retorna o interio da posição do orçamento do seu respectivo tipo.
	 * 
	 * @param tipo      Inteiro que indica qual orçamento irá validar: (1) - Bebida
	 *                  (2) - Comida (3) - Infraestrutura (4) - Musica
	 * @param evento    Classe evento, onde pode ser acessado todos os atributos do
	 *                  evento.
	 * @param orcamento Classe orcamento, onde pode ser acessado todos os atributos
	 *                  do orçamento.
	 * @return retorna -1 caso ele não encontre o orçamento. Caso contrário retorna
	 *         a posição do seu respectivo orçamento no banco de dados relacionado
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
	 * Get do tipo do orçamento
	 * 
	 * @param posEvento    Posição do evento
	 * @param posOrcamento Posição do orçamento
	 * @return retorna os tipos de orçamentos sendo a bebida, comida, infraestrutura
	 *         e musica.
	 */

	public int getTipoOrcamento(int posEvento, int posOrcamento) {

		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleOrcamento controlOrcamento = new ControleOrcamento(controlEvento.getBdOrcamentos().get(posOrcamento));
		return controlOrcamento.getTipoOrcamento();

	}

	/**
	 * Get Descrição da bebida
	 * 
	 * @param posEvento    Posição do evento
	 * @param posOrcamento Posição do orçamento
	 * @return Retorna a descrição da bebida.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
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
	 * Get Valor unitário da bebida
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna o valor unitário da bebida.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se a bebida é quente ou não.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se a bebida contém alcool ou não.
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
	 * Get Descrição da comida.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna a descrição da bebida.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
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
	 * Get valor unitário da comida.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna o valor unitário da comida.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna o valor unitário da comida.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se a comida é prato principal ou não.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se a comida é prato desgustativo ou não.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se a comida é uma sobremessa ou não.
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
	 * Get Descrição infraestrutura.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna a descrição da infraestrutura.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
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
	 * Get Decoração da infraestrutura.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem decoração ou não a infraestrutura.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem estacionamento ou não a
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
	 * Get mobiliário da infraestrutura.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem mobiliário ou não a
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem internet ou não a infraestrutura.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem equipamento ou não a
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem toellete ou não a infraestrutura.
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
	 * Get Descrição da musica.
	 * 
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna a descrição da musica.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem DJ ou não.
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
	 * @param posEvento    Posição do evento.
	 * @param posOrcamento Posição do orçamento.
	 * @return Retorna verdadeiro ou falso se tem Banda musical ou não.
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
	 * Get Descrição da programação.
	 * 
	 * @param pos Posição do evento.
	 * @return Retorna a lista das descrições das programações.
	 * 
	 */

	public String[] getDescricaoProgramacao(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getDescricaoProgramacao();
	}

	/**
	 * Get Hora da programação.
	 * 
	 * @param pos Posição do evento.
	 * @return Retorna a lista das Horas das programações.
	 * 
	 */
	public String[] getHoraProgramacao(int pos) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(pos));
		return controlEvento.getHoraProgramacao();
	}

	/**
	 * Get descrição da programação.
	 * 
	 * @param posEvento      Posição do evento.
	 * @param posProgramacao Posição da programação.
	 * @return Retorna a descrição da programação.
	 * 
	 */
	public String getDescricaoPro(int posEvento, int posProgramacao) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));
		return controlProgramacao.getDescricao();
	}

	/**
	 * Get Hora da programação.
	 * 
	 * @param posEvento      Posição do evento.
	 * @param posProgramacao Posição da programação.
	 * @return Retorna a Hora da programação.
	 * 
	 */
	public String getHoraPro(int posEvento, int posProgramacao) {
		ControleEvento controlEvento = new ControleEvento(banco.getBdEventos().get(posEvento));
		ControleProgramacao controlProgramacao = new ControleProgramacao(
				controlEvento.getBdProgramacao().get(posProgramacao));
		return controlProgramacao.getHora();
	}

	/**
	 * Método que valida a data se estiver informada incorretamente.
	 * 
	 * @param data É a data que será validada no formato correto.
	 * @return Retorna verdadeiro ou falso se a data está correta ou não.
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

	/**
	 * Método que valida a hora se estiver informada incorretamente.
	 * 
	 * @param hora É a hora que será validada no formato correto.
	 * @return Retorna verdadeiro ou falso se a hora está correta ou não.
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
	 * Método que valida o CEP se estiver informada incorretamente.
	 * 
	 * @param cep É o CEP que será validada no formato correto.
	 * @return Retorna verdadeiro ou falso se o cep está correto ou não.
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

	/**
	 * Método que valida o campo do preenchimento se estiver em branco.
	 * 
	 * @param campo É o campo que será validado se estiver em branco ou não.
	 * @return Retorna verdadeiro ou falso se o campo está vazio ou não.
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
	 * Método que valida numero em formato double maior que zero.
	 * 
	 * @param dado É o valor do número no formato correto ou não.
	 * @return Retorna verdadeiro ou falso se a o número preenchido está correta ou
	 *         não.
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
	 * Método que valida numero em formato inteiro maior que zero.
	 * 
	 * @param dado É o valor do número no formato correto ou não.
	 * @return Retorna verdadeiro ou falso se a o número preenchido está correto ou
	 *         não.
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
	 * Método que valida o Email se estiver informada incorretamente.
	 * 
	 * @param email É o email que será validado no formato correto.
	 * @return Retorna verdadeiro ou falso se o email está correto ou não.
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
	 * Método que valida o telefone se estiver informado incorretamente.
	 * 
	 * @param telefone É o telefone que será validado no formato correto.
	 * @return Retorna verdadeiro ou falso se o telefone está correto ou não.
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
