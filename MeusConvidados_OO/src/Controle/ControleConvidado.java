package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Convidado para controlar a classe Convidado do pacote modelo; 
*/

import Modelo.*;

/**
 * Classe denominada Controle Convidado, tem como função ligar os atributos 
 * da classe Convidado no pacote modelo
 * com o pacote View.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class ControleConvidado {

	private Convidado convidado = new Convidado(); // Instanciação da classe convidado do pacote modelo

	/**
	 * Construtor da Classe Controle Convidado.
	 * @param convidado Convidado selecionado para adicionar/editar os atributos.
	 */
	public ControleConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	/**
	 * Retorna o nome do convidado selecionado.
	 * @return String com o nome do convidado.
	 */
	public String getNome() {

		return convidado.getNome();
	}

	/**
	 * Retorna a quantidade de acompanhantes do convidado.
	 * @return Inteiro com a quantidade de acompanhantes.
	 */
	public int getQuantAcompanhanteConvidado() {

		return convidado.getQuantAcompanhante();
	}

	/**
	 * Retorna o telefone de contato do convidado.
	 * @return String com o telefone do convidado.
	 */
	public String getTelefone() {
		return convidado.getTelefone();
	}

	/**
	 * Retorna o email de contato do convidado.
	 * @return String com o email do convidado.
	 */
	public String getEmail() {
		return convidado.getEmail();
	}

	/**
	 * Retorna a rede social cadastrada do convidado.
	 * @return String com a rede social do convidado.
	 */
	public String getRedeSocial() {
		return convidado.getRedeSocial();
	}

	/**
	 * Retorna o endereço do convidado.
	 * @return String com o endereço do convidado.
	 */
	public String getEnd() {
		return convidado.getEnd();

	}

	/**
	 * Retorna o Código de Endereçamento Postal do convidado.
	 * @return String com o cep do convidado.
	 */
	public String getCEP() {
		return convidado.getCEP();
	}

	/**
	 * Retorna o complemento do endereço do convidado.
	 * @return String com o complemento do convidado.
	 */
	public String getComplemenConvidado() {
		return convidado.getComplemento();
	}

	/**
	 * Insere o nome do convidado.
	 * @param nome String com o nome do convidado.
	 */
	public void setNome(String nome) {
		convidado.setNome(nome);
	}

	/**
	 * Insere a quantidade de acompanhantes do convidado.
	 * @param quantAcompanhanteConvidado Inteiro com a quantidade de acompanhantes.
	 */
	public void setQuantAcompanhante(int quantAcompanhanteConvidado) {
		convidado.setQuantAcompanhante(quantAcompanhanteConvidado);
	}

	/**
	 * Insere o telefone do convidado.
	 * @param telefone String com o telefone.
	 */
	public void setTelefone(String telefone) {
		convidado.setTelefone(telefone);
	}

	/**
	 * Insere o Email do convidado.
	 * @param email String com o email.
	 */
	public void setEmail(String email) {
		convidado.setEmail(email);
	}

	/**
	 * Insere a rede social do convidado.
	 * @param redeSocial String com o email do convidado.
	 */
	public void setRedeSocial(String redeSocial) {
		convidado.setRedeSocial(redeSocial);
	}

	/**
	 * Insere o endereço do convidado.
	 * @param end String com o endereço do convidado.
	 */
	public void setEnd(String end) {
		convidado.setEndereco(end);

	}

	/**
	 * Insere o Código de Endereçamento Postal do convidado.
	 * @param Cep String com o CEP do convidado.
	 */
	public void setCEP(String Cep) {
		convidado.setCep(Cep);
	}

	/**
	 * Insere o complemento do endereço do convidado.
	 * @param complemento String com o complemento do convidado.
	 */
	public void setComplemenConvidado(String complemento) {
		convidado.setComplemento(complemento);
	}

}
