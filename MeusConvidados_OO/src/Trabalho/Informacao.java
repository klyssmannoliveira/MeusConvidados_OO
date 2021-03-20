package Trabalho;

/*
Sintese
Objetivo: Classe abstrata denominada Informacao para ser o endereço do evento e dos convidados; 
*/

public abstract class Informacao {

	private String endereco; // endereço do evento ou convidado;

	/*
	 * Objetivo: Getters e Setters referente ao endereço;
	 * 
	 */

	// get do endereço;
	public String getEndereco() {
		return endereco;
	}

	// set do endereço;
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
