package Modelo;

/**
 * Classe denominada Condidado. Tem como objetivo descrever as informações dos
 * convidados do evento. Essas informações são nome, quantidade de acompanhante,
 * além das informações da classe InformacaoConvidado.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class Convidado {
	private String nome; // Nome do convidado;
	private InformacaoConvidado informacaoConvidado = new InformacaoConvidado(); // instancia a classe
																					// informacaoConvidado
	private int quantAcompanhante; // quantidade de acompanhantes;

	/**
	 * Construtor da classe Convidado.
	 * 
	 * @param nome.              String que fornece o nome do convidado.
	 * @param quantAcompanhante. Inteiro que fornece a quantidade de acompanhantes
	 *                           do convidado.
	 * @param telefone.          String que fornece o telefone do convidado.
	 * @param email.             String que fornece o email do convidado.
	 * @param redeSocial.        String que fornece a rede social do convidado
	 * @param endereco.          String que fornece o endereço do convidado.
	 * @param cep.               String que fornece o CEP do endereço do convidado.
	 * @param complemento.       String que fornece o complemento do endereço do
	 *                           convidado.
	 */

	public Convidado(String nome, int quantAcompanhante, String telefone, String email, String redeSocial,
			String endereco, String cep, String complemento) {
		this.nome = nome;
		this.quantAcompanhante = quantAcompanhante;
		informacaoConvidado.setTelefone(telefone);
		informacaoConvidado.setEmail(email);
		informacaoConvidado.setRedeSocial(redeSocial);
		informacaoConvidado.setEndereco(endereco);
		informacaoConvidado.setCep(cep);
		informacaoConvidado.setComplemento(complemento);
	}

	/**
	 * Construtor padrão da Classe Convidado. Sem parâmetros de entradas.
	 */
	public Convidado() {

	}

	/*
	 * Objetivo: Retorna o nome do convidado;
	 */
	public String getNome() {
		return nome;
	}

	/*
	 * Objetivo: Retorna a qtd de acompanhantes do convidado;
	 */
	public int getQuantAcompanhante() {
		return quantAcompanhante;
	}

	/*
	 * Objetivo: Retorna o telefone do convidado
	 */
	public String getTelefone() {
		return informacaoConvidado.getTelefone();
	}

	/*
	 * Objetivo: Retorna o email do convidado
	 */
	public String getEmail() {
		return informacaoConvidado.getEmail();
	}

	/*
	 * Objetivo: Retorna a rede social do convidado
	 */
	public String getRedeSocial() {
		return informacaoConvidado.getRedesSociais();
	}

	/*
	 * Objetivo: Retorna o endereco do convidado
	 */
	public String getEnd() {
		return informacaoConvidado.getEndereco();
	}

	/*
	 * Objetivo: Retorna o CEP do convidado;
	 */
	public String getCEP() {
		return informacaoConvidado.getCep();
	}

	/*
	 * Objetivo: Retorna o complemento do convidado;
	 */
	public String getComplemento() {
		return informacaoConvidado.getComplemento();
	}

	/*
	 * Objetivo: Atualiza o nome do convidado;
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * Objetivo: Atualiza a qtd de acompanhantes do convidado;
	 */
	public void setQuantAcompanhante(int quantAcompanhante) {
		this.quantAcompanhante = quantAcompanhante;
	}

	/*
	 * Objetivo: Atualiza o telefone do convidado;
	 */

	public void setTelefone(String telefone) {
		informacaoConvidado.setTelefone(telefone);
	}

	/*
	 * Objetivo: Atualiza o email do convidado;
	 */
	public void setEmail(String email) {
		informacaoConvidado.setEmail(email);
	}

	/*
	 * Objetivo: Atualiza a rede social do convidado;
	 */
	public void setRedeSocial(String redeSocial) {
		informacaoConvidado.setRedeSocial(redeSocial);
	}

	/*
	 * Objetivo: Atualiza o endereco do convidado;
	 */
	public void setEndereco(String endereco) {
		informacaoConvidado.setEndereco(endereco);
	}

	/*
	 * Objetivo: Atualiza o complemento do convidado;
	 */
	public void setComplemento(String complemento) {
		informacaoConvidado.setComplemento(complemento);
	}

	/*
	 * Objetivo: Atualiza o cep do convidado;
	 */
	public void setCep(String cep) {
		informacaoConvidado.setCep(cep);
	}

	/*
	 * Objetivo: Retorna a uma string; Saida: nome e quantAcompanhante;
	 * 
	 */

	public String toString() {
		return "Convidado: " + nome + "\nAcompanhante(s): " + quantAcompanhante;
	}

}
