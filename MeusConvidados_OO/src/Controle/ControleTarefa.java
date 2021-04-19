package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Tarefa para controlar a classe Tarefa do pacote modelo; 
*/
import Modelo.*;

public class ControleTarefa {

	private Tarefa tarefa = new Tarefa(); // Instanciação da classe Tarefa do pacote modelo

	/*
	 * Objetivo: Construtor da Classe controle Tarefa. Entrada : Tarefa tarefa;
	 * 
	 */
	public ControleTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	// get Descrição
	public String getDescricao() {
		return tarefa.getDescricao();
	}

	// get Data Limite
	public String getDataLimite() {
		return tarefa.getDataLimite();
	}

	// get Concluido Tarefa
	public boolean getConcluidoTarefa() {
		return tarefa.isConcluido();
	}

	// set Concluido Tarefa
	public void setConcluidoTarefa(boolean concluido) {
		tarefa.setConcluido(concluido);
	}

	// set Descricao
	public void setDescricao(String descricao) {
		tarefa.setDescricao(descricao);
	}

	// set Data Limite
	public void setDataLimite(String dataLimite) {
		tarefa.setDataLimite(dataLimite);

	}
}
