package Modelo;

/**
 * Classe denominada InformacaoConvidado. Tem como objetivo descrever as
 * informa��es de contato dos convidados, tais como: telefone, email, rede
 * social. � a classe filho que herda as informa��es de endere�o da classe
 * informacao.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class InformacaoConvidado extends Informacao {
	private String telefone; // telefone do convidado em string
	private String email; // email do convidado em string
	private String redesSociais; // rede social do convidado em string

	/*
	 * Objetivo: Getters e Setters referentes aos atributos;
	 */
	// get do Telefone
	public String getTelefone() {
		return telefone;
	}

	// set do Telefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// get do email
	public String getEmail() {
		return email;
	}

	// set do email
	public void setEmail(String email) {
		this.email = email;
	}

	// get da rede social
	public String getRedesSociais() {
		return redesSociais;
	}

	// set da rede social
	public void setRedeSocial(String redesSociais) {
		this.redesSociais = redesSociais;
	}

}
