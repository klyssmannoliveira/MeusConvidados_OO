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
	 *  Entrada : nome e quantAcompanhante
	 * 
	 */

	public Convidado(String nome, int quantAcompanhante) {
		this.nome = nome;
		this.quantAcompanhante = quantAcompanhante;
	}
	
	public Convidado() {
	
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
	public String getTelefone () {
		return informacaoConvidado.getTelefone();
	}
	
	/*
	 * Objetivo: Atualiza o email do convidado
	 *  Entrada: email
	 */
	public String getEmail () {
		return informacaoConvidado.getEmail();
	}
	
	/*
	 * Objetivo: Atualiza a rede social do convidado
	 *  Entrada: redeSocial
	 */
	public String getRedeSocial () {
		return informacaoConvidado.getRedesSociais();
	}
	
	/*
	 * Objetivo: Atualiza o endereco do convidado
	 *  Entrada: endereco
	 */
	public String getEnd () {
		return informacaoConvidado.getEndereco();
	}
	/*
	 * Objetivo: Atualiza  quantidade de acompanhantes do convidado
	 *  Entrada: quantAcompanhante
	 */
	public void atualizarQuantAcompanhante (int quantAcompanhante) {
		setQuantAcompanhante(quantAcompanhante);
	}
	
	
	/*
	 * Objetivo: Atualiza o CEP do convidado;
	 *  Entrada: cep
	 */
	public String getCEP() {
		return informacaoConvidado.getCep();
	}
	

	/*
	 * Objetivo: Atualiza o CEP do convidado;
	 *  Entrada: cep
	 */
	public String getComplemento() {
		return informacaoConvidado.getComplemento();
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

	
	
	public void setTelefone (String telefone) {
	         informacaoConvidado.setTelefone(telefone);
	}
	
	
	public void setEmail (String email) {
        informacaoConvidado.setEmail(email);
}

	
	public void setRedeSocial (String redeSocial) {
        informacaoConvidado.setRedeSocial(redeSocial);
}

	
	public void setEndereco (String endereco) {
        informacaoConvidado.setEndereco(endereco);
}
	
	public void setComplemento (String complemento) {
        informacaoConvidado.setComplemento(complemento);
}	
	
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
