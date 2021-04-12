package Modelo;

/*
Sintese
Objetivo: Classe denominada Evento para ser a classe central para organiza��o do evento; 
*/

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Evento {

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// inst�ncia o formato simples da data;
	private String nomeEvento; // nome do evento dando liberdade ao usuario para colocar qualquer nome;
	private InformacaoEvento informacaoEvento = new InformacaoEvento(); // instancia��o da classe informacaoEvento;
	private ArrayList<Convidado> bdConvidados = new ArrayList<Convidado>(); // cria arraylist de convidados;
	private int totalConvidados = 0; // inicializa�ao do atributo total de convidados;
	private ArrayList<Tarefa> bdTarefas = new ArrayList<Tarefa>(); // cria arraylist de tarefas;
	private double taxaTarefas = 0.0; // inicializa�ao do atributo taxa de tarefas;
	private ArrayList<Orcamento> bdOrcamentos = new ArrayList<Orcamento>(); // cria arraylist de Orcamento;
	private double totalGasto = 0.0; // inicializa�ao do atributo total de gastos;
	private double orcamentoPrevisto = 0.0; //  inicializa�ao do atributo do or�amento Previsto;

	
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
			auxiliar[i] = i+1 + " - " + bdConvidados.get(i).getNome() + " e " 
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
	 * Objetivo: Remove o convidado do evento desejado; 
	 * Entrada: Convidado;
	 */

	public boolean removerConvidado(int posConvidado) {
		
		if( posConvidado > bdConvidados.size() ) {
			
			return false;
			
			
		}else {
			bdConvidados.remove(posConvidado);
			return true;
		}
		

	}

	/*
	 * Objetivo: C�lculo total dos convidados;
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
			auxiliar[i] = i+1 + " - " + bdTarefas.get(i).getDescricao();
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
	 * Objetivo: Remover tarefas para n�o ser realizadas no evento; 
	 * Entrada: descricao;
	 */
	public boolean removerTarefa(int posTarefa) {
	if( posTarefa > bdTarefas.size() ) {
			
			return false;
			
			
		}else {
			bdTarefas.remove(posTarefa);
			return true;
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
			if (aux.isConcluido() == true) {
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
			auxiliar[i] = i+1 + " - " + bdOrcamentos.get(i).getDescricao();
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

			System.out.println("Gasto n�o encontrado!!\n");
		}

	}

	/*
	 * Objetivo: C�lculo total dos gastos do evento;
	 */

	public void setTotalGasto() {
		totalGasto = 0;
		for (int i = 0; i < bdOrcamentos.size(); i++) {
			Orcamento aux = bdOrcamentos.get(i);
			totalGasto = totalGasto + aux.getValorTotal();
		}
	}

	/*
	 * Objetivo: Relat�rio do evento que lista os convidados, as tarefas e os gastos;
	 */
	public void relatorio() {
		System.out.println("Relat�rio do evento");
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
	
	// get informa��o do evento;
	public InformacaoEvento getInformacaoEvento() {
		return informacaoEvento;
	}
	// set informa��o do evento;
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
	
	public ArrayList<Convidado> getBdConvidados() {
		return bdConvidados;
	}
	
	public ArrayList<Tarefa> getBdTarefas() {
		return bdTarefas;
	}
	
	
}