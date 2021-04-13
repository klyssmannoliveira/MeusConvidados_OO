package Modelo;
/*
   Sintese
   Objetivo: Classe denominada Convidado para as informações dos convidados do evento; 
*/

public class Convidado {
	private String nome; // Nome do convidado;
	private InformacaoConvidado informacaoConvidado = new InformacaoConvidado(); // instancia a classe informacaoConvidado
	private int quantAcompanhante; // quantidade de acompanhantes;

	/*
	 * Objetivo: Construtor da Classe Convidado ; 
	 * Entrada : nome, quantAcompanhante, telefone, email, redeSocial, endereco;
	 * 
	 */

	public Convidado(String nome, int quantAcompanhante, String telefone, String email, String redeSocial, String endereco, String cep, String complemento) {
		this.nome = nome;
		this.quantAcompanhante = quantAcompanhante;
		informacaoConvidado.setTelefone(telefone);
		informacaoConvidado.setEmail(email);
		informacaoConvidado.setRedeSocial(redeSocial);
		informacaoConvidado.setEndereco(endereco);
		informacaoConvidado.setCep(cep);
		informacaoConvidado.setComplemento(complemento);
	}
	

	/*
	 * Objetivo: Construtor da Classe Convidado (sobrecarga)
	 *  Entrada : sem entrada
	 * 
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
	public String getTelefone () {
		return informacaoConvidado.getTelefone();
	}
	
	/*
	 * Objetivo: Retorna o email do convidado
	 */
	public String getEmail () {
		return informacaoConvidado.getEmail();
	}
	
	/*
	 * Objetivo: Retorna a rede social do convidado
	 */
	public String getRedeSocial () {
		return informacaoConvidado.getRedesSociais();
	}
	
	/*
	 * Objetivo: Retorna o endereco do convidado
	 */
	public String getEnd () {
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
	
	public void setTelefone (String telefone) {
	         informacaoConvidado.setTelefone(telefone);
	}
	
	/*
	 * Objetivo: Atualiza o email do convidado;
	 */
	public void setEmail (String email) {
        informacaoConvidado.setEmail(email);
}

	/*
	 * Objetivo: Atualiza a rede social do convidado;
	 */
	public void setRedeSocial (String redeSocial) {
        informacaoConvidado.setRedeSocial(redeSocial);
}

	/*
	 * Objetivo: Atualiza o endereco do convidado;
	 */
	public void setEndereco (String endereco) {
        informacaoConvidado.setEndereco(endereco);
}
	/*
	 * Objetivo: Atualiza o complemento do convidado;
	 */
	public void setComplemento (String complemento) {
        informacaoConvidado.setComplemento(complemento);
}	
	/*
	 * Objetivo: Atualiza o cep do convidado;
	 */
	public void setCep (String cep) {
        informacaoConvidado.setCep(cep);
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
