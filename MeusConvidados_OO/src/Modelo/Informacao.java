package Modelo;

/*
Sintese
Objetivo: Classe abstrata denominada Informacao para ser o endere�o do evento e dos convidados; 
*/

public abstract class Informacao {

	private String endereco; // endere�o do evento ou convidado;
	private String cep; // CEP com 8 digitos. EX: 72583250
	private String complemento; // complemento do endere�o

	/*
	 * Objetivo: Getters e Setters referente ao endere�o;
	 * 
	 */

	// get do endere�o;
	public String getEndereco() {
		return endereco;
	}

	// set do endere�o;
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// get do cep;
	public String getCep() {
		return cep;
	}

	// set do cep;
	public void setCep(String cep) {
		this.cep = cep;
	}

	// get do complemento;
	public String getComplemento() {
		return complemento;
	}

	// set do complemento;
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	

}
