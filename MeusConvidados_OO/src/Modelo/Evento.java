package Modelo;

/*
Sintese
Objetivo: Classe denominada Evento para ser a classe central para organização do evento; 
*/

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Evento {

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// instância o formato simples da data;
	private String nomeEvento; // nome do evento dando liberdade ao usuario para colocar qualquer nome;
	private InformacaoEvento informacaoEvento = new InformacaoEvento(); // instanciação da classe informacaoEvento;
	private ArrayList<Convidado> bdConvidados = new ArrayList<Convidado>(); // cria arraylist de convidados;
	private int totalConvidados = 0; // inicializaçao do atributo total de convidados;
	private ArrayList<Tarefa> bdTarefas = new ArrayList<Tarefa>(); // cria arraylist de tarefas;
	private double taxaTarefas = 0.0; // inicializaçao do atributo taxa de tarefas;
	private ArrayList<Orcamento> bdOrcamentos = new ArrayList<Orcamento>(); // cria arraylist de Orcamento;
	private ArrayList<Bebida> bdBebida = new ArrayList<Bebida>(); // cria arraylist de Orcamento;
	private ArrayList<Comida> bdComida = new ArrayList<Comida>(); // cria arraylist de Orcamento;
	private ArrayList<Infraestrutura> bdInfraestrutura= new ArrayList<Infraestrutura>(); // cria arraylist de Orcamento;
	private ArrayList<Musica> bdMusica = new ArrayList<Musica>(); // cria arraylist de Orcamento;
	private double totalGasto = 0.0; // inicializaçao do atributo total de gastos;
	private double orcamentoPrevisto = 0.0; // inicializaçao do atributo do orçamento Previsto;

	/*
	 * Objetivo: Construtor da Classe Evento; Entrada : nome, data, horai, horaf;
	 * 
	 */

	public Evento(String nome, String data, String horai, String horaf, String endereco, String cep, String complemen) {
		nomeEvento = nome;
		informacaoEvento.setDataEvento(data);
		informacaoEvento.setHoraInicio(horai);
		informacaoEvento.setHoraTermino(horaf);
		informacaoEvento.setEndereco(endereco);
		informacaoEvento.setCep(cep);
		informacaoEvento.setComplemento(complemen);
	}

	// Sobrecarga do construtor
	public Evento() {

	}

	/*
	 * Objetivo: Mostrar as listas de convidados com sua respectivas quantidades de
	 * acompanhantes;
	 * 
	 */

	public String[] listarConvidados() {
		String[] auxiliar = new String[bdConvidados.size()];
		for (int i = 0; i < bdConvidados.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdConvidados.get(i).getNome() + " e "
					+ bdConvidados.get(i).getQuantAcompanhante() + " Acompanhante(s)";
		}
		return auxiliar;
	}

	/*
	 * Objetivo: Adicionar um convidado para o evento desejado;
	 */

	public void adicionarConvidado(Convidado convidado) {
		bdConvidados.add(convidado);
	}

	/*
	 * Objetivo: Remove o convidado do evento desejado; Entrada: Convidado;
	 */

	public boolean removerConvidado(int posConvidado) {

		if (posConvidado > bdConvidados.size()) {

			return false;

		} else {
			bdConvidados.remove(posConvidado);
			return true;
		}

	}

	/*
	 * Objetivo: listar as tarefas realizadas para o evento;
	 */
	public String[] listarTarefas() {
		String[] auxiliar = new String[bdTarefas.size()];
		for (int i = 0; i < bdTarefas.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdTarefas.get(i).getDescricao();
		}
		return auxiliar;
	}

	/*
	 * Objetivo: Adicionar tarefas para ser realizadas no evento; Entrada: tarefa;
	 */
	public void adicionarTarefa(Tarefa tarefa) {
		bdTarefas.add(tarefa);
	}

	/*
	 * Objetivo: Remover tarefas para não ser realizadas no evento; Entrada:
	 * descricao;
	 */
	public boolean removerTarefa(int posTarefa) {
		if (posTarefa > bdTarefas.size()) {

			return false;

		} else {
			bdTarefas.remove(posTarefa);
			return true;
		}
	}

	/*
	 * Objetivo: Listar os gastos do evento;
	 */
	public String[] listarOrcamentos() {
		String[] auxiliar = new String[bdOrcamentos.size()];
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			auxiliar[i] = i + 1 + " - " + bdOrcamentos.get(i).getDescricao();
		}
		return auxiliar;
	}

	/*
	 * Objetivo: Adicionar gastos do evento; Entrada: gasto;
	 */
	public void adicionarOrcamento(Orcamento orcamento) {
		bdOrcamentos.add(orcamento);
	}
	
	
	public void adicionarBebida(Bebida bebida) {
		bdBebida.add(bebida);
	}
	
	public void adicionarComida(Comida comida) {
		bdComida.add(comida);
	}
	
	public void adicionarInfraestrutura(Infraestrutura infraestrutura) {
		bdInfraestrutura.add(infraestrutura);
	}
	
	public void adicionarMusica(Musica musica) {
		bdMusica.add(musica);
	}
	

	/*
	 * Objetivo:Remover gastos do evento; Entrada: descricao;
	 */
	public boolean removerOrcamento(int posOrcamento) {
		if (posOrcamento > bdOrcamentos.size()) {

			return false;

		} else {
			bdOrcamentos.remove(posOrcamento);
			return true;
		}

	}

	
	public boolean removerBebida(int posBebida) {
		if (posBebida > bdBebida.size()) {

			return false;

		} else {
			bdBebida.remove(posBebida);
			return true;
		}

	}

	
	public boolean removerComida(int posComida) {
		if (posComida > bdComida.size()) {

			return false;

		} else {
			bdComida.remove(posComida);
			return true;
		}

	}

	
	public boolean removerInfraestrutura(int posInfraestrutura) {
		if (posInfraestrutura > bdInfraestrutura.size()) {

			return false;

		} else {
			bdInfraestrutura.remove(posInfraestrutura);
			return true;
		}

	}

	
	public boolean removerMusica(int posMusica) {
		if (posMusica > bdMusica.size()) {

			return false;

		} else {
			bdMusica.remove(posMusica);
			return true;
		}

	}

	
	
	
	/*
	 * Objetivo: Getters e Setters referentes ao evento;
	 */
	// get nome do evento;
	public String getNomeEvento() {
		return nomeEvento;
	}

	// set do nome do evento;
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	// get informação do evento;
	public InformacaoEvento getInformacaoEvento() {
		return informacaoEvento;
	}

	// set informação do evento;
	public void setInformacaoEvento(InformacaoEvento informacaoEvento) {
		this.informacaoEvento = informacaoEvento;
	}

	/*
	 * Objetivo: Cálculo total dos convidados;
	 */
	public void setTotalConvidados() {
		totalConvidados = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			totalConvidados = totalConvidados + 1 + aux.getQuantAcompanhante();
		}
	}

	// get do total de convidados do evento;
	public int getTotalConvidados() {
		setTotalConvidados();
		return totalConvidados;
	}

	/*
	 * Objetivo: Calcular as taxas de tarefas do evento. Ex: 100% das tarefas
	 * concluidas;
	 */
	public void setTaxaTarefas() {
		double contadorSIM = 0;
		int cont = 0;
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);
			cont++;
			if (aux.isConcluido() == true) {
				contadorSIM++;
			}
		}
		taxaTarefas = (contadorSIM / cont) * 100;
	}

	// get da taxa de tarefas do evento;
	public double getTaxaTarefas() {
		setTaxaTarefas();
		return taxaTarefas;
	}

	/*
	 * Objetivo: Cálculo total dos gastos do evento;
	 */

	public void setTotalGasto() {
		totalGasto = 0;
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			Orcamento aux = bdOrcamentos.get(i);
			totalGasto = totalGasto + aux.getValorTotal();
		}
	}

	// get do total de de gastos do evento;
	public double getTotalGasto() {
		setTotalGasto();
		return totalGasto;
	}

	// get do Orcamento Previsto do evento;
	public double getOrcamentoPrevisto() {
		return orcamentoPrevisto;
	}

	// set Orcamento Previsto do evento;
	public void setOrcamentoPrevisto(double orcamentoPrevisto) {
		this.orcamentoPrevisto = orcamentoPrevisto;
	}

	// retorna o banco de convidados
	public ArrayList<Convidado> getBdConvidados() {
		return bdConvidados;
	}

	// retorna o banco de Tarefas
	public ArrayList<Tarefa> getBdTarefas() {
		return bdTarefas;
	}

	// retorna o banco de Orcamento
	public ArrayList<Orcamento> getBdOrcamentos() {
		return bdOrcamentos;
	}
	
	public ArrayList<Bebida> getBdBebida() {
		return bdBebida;
	}
	
	public ArrayList<Comida> getBdComida() {
		return bdComida;
	}
	
	public ArrayList<Infraestrutura> getBdInfraestrutura() {
		return bdInfraestrutura;
	}
	
	public ArrayList<Musica> getBdMusica() {
		return bdMusica;
	}
	
	

}