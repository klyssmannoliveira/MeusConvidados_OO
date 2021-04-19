package Controle;

/*
Sintese
Objetivo: Classe denominada Controle Convidado para controlar a classe Convidado do pacote modelo; 
*/

import Modelo.*;

public class ControleConvidado {

	private Convidado convidado = new Convidado(); // Instanciação da classe convidado do pacote modelo

	/*
	 * Objetivo: Construtor da Classe controle Convidado. Entrada : Convidado
	 * convidado;
	 * 
	 */
	public ControleConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	// get Nome convidado
	public String getNome() {

		return convidado.getNome();
	}

	// get Quantidade Acompanhante Convidado
	public int getQuantAcompanhanteConvidado() {

		return convidado.getQuantAcompanhante();
	}

	// get telefone convidado
	public String getTelefone() {
		return convidado.getTelefone();
	}

	// get Email
	public String getEmail() {
		return convidado.getEmail();
	}

	// get Rede Social
	public String getRedeSocial() {
		return convidado.getRedeSocial();
	}

	// get Endereco
	public String getEnd() {
		return convidado.getEnd();

	}

	// get CEP
	public String getCEP() {
		return convidado.getCEP();
	}

	// get Complemento Convidado
	public String getComplemenConvidado() {
		return convidado.getComplemento();
	}

	// set Nome
	public void setNome(String nome) {
		convidado.setNome(nome);
	}

	// set quantidade acompanhante
	public void setQuantAcompanhante(int quantAcompanhanteConvidado) {
		convidado.setQuantAcompanhante(quantAcompanhanteConvidado);
	}

	// set telefone
	public void setTelefone(String telefone) {
		convidado.setTelefone(telefone);
	}

	// set email
	public void setEmail(String email) {
		convidado.setEmail(email);
	}

	// set Rede Social
	public void setRedeSocial(String redeSocial) {
		convidado.setRedeSocial(redeSocial);
	}

	// set Endereco
	public void setEnd(String end) {
		convidado.setEndereco(end);

	}

	// set CEP
	public void setCEP(String Cep) {
		convidado.setCep(Cep);
	}

	// set Complemento Convidado
	public void setComplemenConvidado(String complemento) {
		convidado.setComplemento(complemento);
	}

}
