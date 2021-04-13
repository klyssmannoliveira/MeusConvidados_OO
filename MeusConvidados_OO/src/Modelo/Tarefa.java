
package Modelo;
/*
Sintese
Objetivo: Classe denominada Tarefa para as informa��es das Tarefas para a organiza��o do evento; 
*/



public class Tarefa {
	private String descricao; // descricao da tarefa: pode ser qualquer tarefa
	private String dataLimite; // data no formato Date
	private long prazo; // diferen�a entre a data atual (agora) com a dataLimite
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
	 * Objetivo: Retorna a uma string;
	 *  Saida: descricao, dataLimite e prazo;
	 */
	/*public String toString() {
		return "Tarefa: " + descricao + "\nData Limite: " + formato.format(dataLimite) + "\nPrazo: " + prazo + " dia(s)";
	}*/

	// Calculo do prazo, retornando um long da quantidade de dias que faltam para realizar a tarefa;
	/*
	 * Objetivo: C�lculo do prazo, diferen�a entre a data limite para realiza��o da tarefa com a data atual
	 * retornando um long com a quantidade de dias
	 *  Saida: prazo;
	 */
	/*public long setPrazo() { // calcula a direren�a dos dia atual para a data limite
		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();
		 return prazo = (dataLimite.getTime() - agora.getTime()) / (1000 * 60 * 60 * 24);
	}*/


	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 * 
	 */

	//Objetivo: Retorna se a tarefa est� conclu�da ou n�o 
	public boolean isConcluido() { // retorna se a Tarfa est� concluida
		return concluido;

	}
	
	// get da descri��o
	public String getDescricao() {
		return descricao;
	}
	
	// set da decri��o
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
