package Controle;

import Modelo.*;

public class ControleConvidado {

	private Convidado convidado = new Convidado();

	public ControleConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	public String getNome() {

		return convidado.getNome();
	}

	public int getQuantAcompanhanteConvidado() {

		return convidado.getQuantAcompanhante();
	}

	public String getTelefone() {

		return convidado.getTelefone();
	}

	public String getEmail() {

		return convidado.getEmail();
	}

	public String getRedeSocial() {

		return convidado.getRedeSocial();
	}

	public String getEnd() {

		return convidado.getEnd();

	}

	public String getCEP() {

		return convidado.getCEP();
	}

	public String getComplemenConvidado() {

		return convidado.getComplemento();
	}

// set aki

	public void setNome(String nome) {
		convidado.setNome(nome);

	}

	public void setQuantAcompanhante(int quantAcompanhanteConvidado) {

		convidado.setQuantAcompanhante(quantAcompanhanteConvidado);
	}

	public void setTelefone(String telefone) {

		convidado.setTelefone(telefone);
	}

	public void setEmail(String email) {

		convidado.setEmail(email);
	}

	public void setRedeSocial(String redeSocial) {

		convidado.setRedeSocial(redeSocial);
	}

	public void setEnd(String end) {

		convidado.setEndereco(end);

	}

	public void setCEP(String Cep) {

		convidado.setCep(Cep);
	}

	public void setComplemenConvidado(String complemento) {

		convidado.setComplemento(complemento);
	}

}
