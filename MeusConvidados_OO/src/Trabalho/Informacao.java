package Trabalho;

/*
Sintese
Objetivo: Classe abstrata denominada Informacao para ser o endere�o do evento e dos convidados; 
*/

public abstract class Informacao {

	private String endereco; // endere�o do evento ou convidado;

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

}
