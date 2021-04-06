package Modelo;
/*
Sintese
Objetivo: Classe denominada InformacaoConvidado para as informações dos convidados do evento; 
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
	public void setRedesSociais(String redesSociais) {
		this.redesSociais = redesSociais;
	}
	
	

}
