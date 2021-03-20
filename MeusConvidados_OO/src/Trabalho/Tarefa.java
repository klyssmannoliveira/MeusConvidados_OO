
package Trabalho;
/*
Sintese
Objetivo: Classe denominada Tarefa para as informa��es das Tarefas para a organiza��o do evento; 
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;



public class Tarefa {
	private String descricao; // descricao da tarefa: pode ser qualquer tarefa
	private Date dataLimite; // data no formato Date
	private long prazo; // diferen�a entre a data atual (agora) com a dataLimite
	private boolean concluido; // True = Tarefa concluido
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	/*
	Sintese
	Objetivo: Construtor da classe Tarefa; 
	Entrada: descricao, data
	*/
	public Tarefa(String descricao, String data) throws Exception {
		this.descricao = descricao;
		dataLimite = formato.parse(data); // transforma a string data no formato Date
	}
	
	/*
	Sintese
	Objetivo: Retorna se a tarefa est� conclu�da ou n�o 
	Sa�da: String (Sim ou N�o)
	*/
	public String isConcluido() { // retorna se a Tarfa est� concluida
		if (concluido == true) {
			return "Sim";
		} else {
			return "N�o";
		}

	}
	
	/*
	 * Objetivo: Atualiza a descri��o
	 *  Entrada: descricao
	 */
	public void atualizarDescricao (String descricao) {
		setDescricao(descricao);
	}
	
	/*
	 * Objetivo: Atualiza a data limite, recebendo a data limite no formato String e transformando em date
	 *  Entrada: data limite
	 */
	public void atualizarDataLimite (String data) throws Exception {
		setDataLimite(formato.parse(data));
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
	public String toString() {
		return "Tarefa: " + descricao + "\nData Limite: " + formato.format(dataLimite) + "\nPrazo: " + prazo + " dia(s)";
	}

	// Calculo do prazo, retornando um long da quantidade de dias que faltam para realizar a tarefa;
	/*
	 * Objetivo: C�lculo do prazo, diferen�a entre a data limite para realiza��o da tarefa com a data atual
	 * retornando um long com a quantidade de dias
	 *  Saida: prazo;
	 */
	public long setPrazo() { // calcula a direren�a dos dia atual para a data limite
		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();
		 return prazo = (dataLimite.getTime() - agora.getTime()) / (1000 * 60 * 60 * 24);
	}


	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 * 
	 */
	// get da descri��o
	public String getDescricao() {
		return descricao;
	}
	
	// set da decri��o
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// get da Data Limite
	public Date getDataLimite() {
		return dataLimite;
	}

	// set da Data Limite
	public void setDataLimite(Date dataLimite) {
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
