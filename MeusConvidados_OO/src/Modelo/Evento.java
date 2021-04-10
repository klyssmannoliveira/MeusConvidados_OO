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
	private double totalGasto = 0.0; // inicializaçao do atributo total de gastos;
	private double orcamentoPrevisto = 0.0; //  inicializaçao do atributo do orçamento Previsto;

	
	/*
	 * Objetivo: Construtor da Classe Evento; 
	 * Entrada : nome, data, horai, horaf;
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
	public Evento() {
		
	}

	/*
	 * Objetivo: Mostrar as listas de convidados com sua respectivas quantidades de  acompanhantes;
	 * 
	 */

	public String[] listarConvidados() {
		String[] auxiliar = new String[bdConvidados.size()];
		for (int i = 0; i < bdConvidados.size(); i++) {
			auxiliar[i] = bdConvidados.get(i).getNome() + " e " 
						+ bdConvidados.get(i).getQuantAcompanhante()
						+ " Acompanhante(s)";
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
	 * Objetivo: Atualiza o nome do convidado para o evento desejado;
	 *  Entrada: nomeAntigo, nomeNovo;
	 */

	public void atualizarNomeConvidado(String nomeAntigo, String nomeNovo) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == nomeAntigo) {
				aux.atualizarNome(nomeNovo);
				System.out.println("Nome do convidado atualizado com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {
			System.out.println("\"Nome do convidado não encontrado!!\n");

		}

	}

	/*
	 * Objetivo: Atualiza o telefone do convidado para o evento desejado; 
	 * Entrada: nome e telefone;
	 */

	public void atualizarTelefoneConvidado(String nome, String telefone) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == nome) {
				aux.atualizarTelefone(telefone);
				System.out.println("Telefone do convidado atualizado com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {
			System.out.println("\"Nome do convidado não encontrado!!\n");

		}

	}

	/*
	 * Objetivo: Atualiza a quantidade de acompanhantes do convidado para o evento desejado; 
	 * Entrada: nome e quantAcompanhante;
	 */

	public void atualizarQuantAcompanhanteConvidado(String nome, String quantAcompanhante) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == nome) {
				aux.atualizarTelefone(quantAcompanhante);
				System.out.println("Quantidade de acompanhates do convidado atualizado com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {
			System.out.println("\"Nome do convidado não encontrado!!\n");

		}

	}

	/*
	 * Objetivo: Atualiza o email do convidado para o evento desejado; 
	 * Entrada: nome e email;
	 */

	public void atualizarEmailConvidado(String nome, String email) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == nome) {
				aux.atualizarTelefone(email);
				System.out.println("Email do convidado atualizado com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {
			System.out.println("\"Nome do convidado não encontrado!!\n");

		}

	}

	/*
	 * Objetivo: Atualiza a rede social do convidado para o evento desejado;
	 * Entrada: nome e redeSocial;
	 */

	public void atualizarRedeSocialConvidado(String nome, String redeSocial) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == nome) {
				aux.atualizarTelefone(redeSocial);
				System.out.println("Rede Social do convidado atualizado com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {
			System.out.println("\"Nome do convidado não encontrado!!\n");

		}

	}

	/*
	 * Objetivo: Remove o convidado do evento desejado; 
	 * Entrada: Convidado;
	 */

	public void removerConvidado(String convidado) {
		int cont = 0;
		for (int i = 0; i < bdConvidados.size(); i++) {
			Convidado aux = bdConvidados.get(i);
			if (aux.getNome() == convidado) {
				bdConvidados.remove(i);
				System.out.println("Convidado removido com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdConvidados.size()) {

			System.out.println("Convidado não encontrado!!\n");

		}

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

	/*
	 * Objetivo: listar as tarefas realizadas para o evento;
	 */
	public String[] listarTarefas() {
		String[] auxiliar = new String[bdTarefas.size()];
		for (int i = 0; i < bdTarefas.size(); i++) {
			auxiliar[i] = bdTarefas.get(i).getDescricao() + ". Data Limite: "
					+ bdTarefas.get(i).getDataLimite();
		}
		return auxiliar;
	}

	/*
	 * Objetivo: Adicionar tarefas para ser realizadas no evento;
	 *  Entrada: tarefa;
	 */
	public void adicionarTarefa(Tarefa tarefa) {
		bdTarefas.add(tarefa);
	}

	/*
	 * Objetivo: Remover tarefas para não ser realizadas no evento; 
	 * Entrada: descricao;
	 */
	public void removerTarefa(String descricao) {
		int cont = 0;
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);

			if (aux.getDescricao() == descricao) {
				bdTarefas.remove(i);
				System.out.println("Tarefa removida com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdTarefas.size()) {

			System.out.println("Tarefa não encontrada!!\n");
		}

	}

	/*
	 * Objetivo: Calcular as taxas de tarefas do evento. Ex: 100% das tarefas concluidas;
	 */
	public void setTaxaTarefas() {
		double contadorSIM = 0;
		int cont = 0;
		for (int i = 0; i < bdTarefas.size(); i++) {
			Tarefa aux = bdTarefas.get(i);
			cont++;
			if (aux.isConcluido() == "Sim") {
				contadorSIM++;
			}
		}
		taxaTarefas = (contadorSIM / cont) * 100;
	}

	/*
	 * Objetivo: Listar os gastos do evento;
	 */
	public String[] listarOrcamentos() {
		String[] auxiliar = new String[bdOrcamentos.size()];
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			auxiliar[i] = bdOrcamentos.get(i).getDescricao() + ". Valor: R$"
					+ bdOrcamentos.get(i).getValorTotal();
		}
		return auxiliar;
	}

	/*
	 * Objetivo: Adicionar gastos do evento; 
	 * Entrada: gasto;
	 */
	public void adicionarOrcamento(Orcamento orcamento) {
		bdOrcamentos.add(orcamento);
	}

	/*
	 * Objetivo:Remover gastos do evento; 
	 * Entrada: descricao;
	 */
	public void removerOrcamento(String descricao) {
		int cont = 0;
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			Orcamento aux = bdOrcamentos.get(i);
			if (aux.getDescricao() == descricao) {
				bdOrcamentos.remove(i);
				System.out.println("Gasto removido com sucesso!!\n");
				cont--;
				break;
			}
			cont++;
		}

		if (cont == bdOrcamentos.size()) {

			System.out.println("Gasto não encontrado!!\n");
		}

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

	/*
	 * Objetivo: Relatório do evento que lista os convidados, as tarefas e os gastos;
	 */
	public void relatorio() {
		System.out.println("Relatório do evento");
		listarConvidados();
		listarTarefas();
		listarOrcamentos();
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

	// get do total de convidados do evento;
	public int getTotalConvidados() {
		setTotalConvidados();
		return totalConvidados;
	}

	// get da taxa de tarefas do evento;
	public double getTaxaTarefas() {
		setTaxaTarefas();
		return taxaTarefas;
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
	

}