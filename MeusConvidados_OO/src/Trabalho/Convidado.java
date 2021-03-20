package Trabalho;
/*
   Sintese
   Objetivo: Classe denominada Convidado para as informa��es dos convidados do evento; 
*/

public class Convidado {
	private String nome; // Nome do convidado;
	private InformacaoConvidado informacaoConvidado = new InformacaoConvidado(); // instacia a classe informacaoConvidado
	private int quantAcompanhante; // quantidade de acompanhantes;

	/*
	 * Objetivo: Construtor da Classe Convidado ; 
	 * Entrada : nome, quantAcompanhante, telefone, email, redeSocial, endereco;
	 * 
	 */

	public Convidado(String nome, int quantAcompanhante, String telefone, String email, String redeSocial, String endereco) {
		this.nome = nome;
		this.quantAcompanhante = quantAcompanhante;
		informacaoConvidado.setTelefone(telefone);
		informacaoConvidado.setEmail(email);
		informacaoConvidado.setRedesSociais(redeSocial);
		informacaoConvidado.setEndereco(endereco);
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
		informacaoConvidado.setTelefone(telefone);
	}
	
	/*
	 * Objetivo: Atualiza o email do convidado
	 *  Entrada: email
	 */
	public void atualizarEmail (String email) {
		informacaoConvidado.setEmail(email);
	}
	
	/*
	 * Objetivo: Atualiza a rede social do convidado
	 *  Entrada: redeSocial
	 */
	public void atualizarRedeSocial (String redeSocial) {
		informacaoConvidado.setRedesSociais(redeSocial);
	}
	
	/*
	 * Objetivo: Atualiza o endereco do convidado
	 *  Entrada: endereco
	 */
	public void atualizarEnderco (String endereco) {
		informacaoConvidado.setEndereco(endereco);
	}
	/*
	 * Objetivo: Atualiza q quantidade de acompanhantes do convidado
	 *  Entrada: quantAcompanhante
	 */
	public void atualizarQuantAcompanhante (int quantAcompanhante) {
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
