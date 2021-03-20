package Trabalho;
/*
   Sintese
   Objetivo: Classe denominada Convidado para as informações dos convidados do evento; 
*/



public class Convidado {
	private String nome; // Nome do convidado;
	private String telefone; // Telefone;
	private String email; // email;
	private int quantAcompanhante; // quantidade de acompanhantes;

	/*
	 * Objetivo: Construtor da Classe Convidado ; 
	 * Entrada : nome, quantAcompanhante, telefone e email;
	 * 
	 */

	public Convidado(String nome, int quantAcompanhante, String telefone, String email) {
		this.nome = nome;
		this.quantAcompanhante = quantAcompanhante;
		this.telefone = telefone;
		this.email = email;
	}

	/*
	 * Objetivo: Construtor da Classe Convidado (sobrecarga)
	 *  Entrada : nome e quantAcompanhante
	 * 
	 */

	public Convidado(String nome, int quantAcompanhante) {
		this.nome = nome;
		this.quantAcompanhante = quantAcompanhante;
	}

	/*
	 * Objetivo: Atualiza o nome do convidado
	 *  Entrada: nome
	 */
	public void atualizarNome (String nome) {
		setNome(nome);
	}
	
	/*
	 * Objetivo: Atualiza o telefone do convidado
	 *  Entrada: telefone
	 */
	public void atualizarTelefone (String telefone) {
		setTelefone(telefone);
	}
	
	/*
	 * Objetivo: Atualiza o email do convidado
	 *  Entrada: email
	 */
	public void atualizarEmail (String email) {
		setEmail(email);
	}
	/*
	 * Objetivo: Atualiza q quantidade de acompanhantes do convidado
	 *  Entrada: quantAcompanhante
	 */
	public void atualizarEmail (int quantAcompanhante) {
		setQuantAcompanhante(quantAcompanhante);
	}
	
	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 * 
	 */

	
	
	// get do nome;
	public String getNome() {
		return nome;
	}

	
	// set do nome;
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	// get do telefone;
	public String getTelefone() {
		return telefone;
	}

	// set do telefone;
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// get do email;
	public String getEmail() {
		return email;
	}

	// set do email;
	public void setEmail(String email) {
		this.email = email;
	}

	// get da quantidade de acompanhantes;
	public int getQuantAcompanhante() {
		return quantAcompanhante;
	}

	// set da quantidade de acompanhantes;
	public void setQuantAcompanhante(int quantAcompanhante) {
		this.quantAcompanhante = quantAcompanhante;
	}

	/*
	 * Objetivo: Retorna a uma string;
	 *  Saida: nome e quantAcompanhante;
	 * 
	 */

	public String toString() {
		return "Convidado: " + nome + "\nAcompanhante(s): " + quantAcompanhante;
	}

}
