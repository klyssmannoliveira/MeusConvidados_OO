package Trabalho;

public class Programacao {

	private String descricao; // Descrição da Programação

	// Construtor 
	public Programacao(String descricao) {
		this.descricao = descricao;
	}

	
	public String toString() {
		return "A descrição da Programação do evento é:\n " + descricao;
	}

	// getters and setters da programação
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
