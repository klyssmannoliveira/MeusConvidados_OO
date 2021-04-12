package Controle;

import Modelo.*;

public class ControleConvidado {
	
     private  Convidado convidado =  new Convidado();

     
     
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


}
