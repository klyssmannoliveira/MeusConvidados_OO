
package Modelo;
/*
Sintese
Objetivo: Classe denominada Tarefa para as informações das Tarefas para a organização do evento; 
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;



public class Tarefa {
	private String descricao; // descricao da tarefa: pode ser qualquer tarefa
	private String dataLimite; // data no formato Date
	private long prazo; // diferença entre a data atual (agora) com a dataLimite
	private boolean concluido; // True = Tarefa concluido
	
	
	public Tarefa() {
		
	}
	
	
	
	/*
	Sintese
	Objetivo: Construtor da classe Tarefa; 
	Entrada: descricao, data
	*/
	public Tarefa(String descricao, String data) {
		this.descricao = descricao;
		dataLimite = data; // transforma a string data no formato Date
	}
	
	
	/*
	Sintese
	Objetivo: Construtor da classe Tarefa (sobrecarga; 
	Entrada: descricao, data, concluido
	*/
	public Tarefa(String descricao, String dataLimite, boolean concluido) {
		super();
		this.descricao = descricao;
		this.dataLimite = dataLimite;
		this.concluido = concluido;
	}



	/*
	Sintese
	Objetivo: Retorna se a tarefa está concluída ou não 
	Saída: String (Sim ou Não)
	*/
	public boolean isConcluido() { // retorna se a Tarfa está concluida
		return concluido;

	}
	
	/*
	 * Objetivo: Atualiza a descrição
	 *  Entrada: descricao
	 */
	public void atualizarDescricao (String descricao) {
		setDescricao(descricao);
	}
	
	/*
	 * Objetivo: Atualiza a data limite, recebendo a data limite no formato String e transformando em date
	 *  Entrada: data limite
	 */
	public void atualizarDataLimite (String data) {
		setDataLimite(data);
	}
	
	/*
	 * Objetivo: Atualiza o status concluido, atribuindo a String concluido
	 *  Entrada: concluido
	 */
	public void atualizarConcluido (String concluido) {
		if(concluido == "Sim") {
			setConcluido(true);
		}
		else {
			setConcluido(false);
		}
	}
	
	
	/*
	 * Objetivo: Retorna a uma string;
	 *  Saida: descricao, dataLimite e prazo;
	 */
	/*public String toString() {
		return "Tarefa: " + descricao + "\nData Limite: " + formato.format(dataLimite) + "\nPrazo: " + prazo + " dia(s)";
	}*/

	// Calculo do prazo, retornando um long da quantidade de dias que faltam para realizar a tarefa;
	/*
	 * Objetivo: Cálculo do prazo, diferença entre a data limite para realização da tarefa com a data atual
	 * retornando um long com a quantidade de dias
	 *  Saida: prazo;
	 */
	/*public long setPrazo() { // calcula a direrença dos dia atual para a data limite
		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();
		 return prazo = (dataLimite.getTime() - agora.getTime()) / (1000 * 60 * 60 * 24);
	}*/


	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 * 
	 */
	// get da descrição
	public String getDescricao() {
		return descricao;
	}
	
	// set da decrição
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// get da Data Limite
	public String getDataLimite() {
		return dataLimite;
	}

	// set da Data Limite
	public void setDataLimite(String dataLimite) {
		this.dataLimite = dataLimite;
	}

	// get do prazo
	public long getPrazo() {
		return prazo;
	}

	// get do concluido
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

}
