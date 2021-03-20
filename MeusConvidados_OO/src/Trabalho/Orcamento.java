package Trabalho;

/*
Sintese
Objetivo: Classe denominada Orcamento para ser a classe Pai de todos os gastos do evento; 
*/

public class Orcamento {
    protected String descricao; // descricao do gasto
    protected double valorTotal; // valor total do gasto
	
	/*
	 * Objetivo: Construtor da Classe Orcamento; 
	 * Entrada : descricao, valorTotal;
	 * 
	 */
	public Orcamento(String descricao, double valorTotal) {
		this.descricao = descricao;
		this.valorTotal = valorTotal;
	}
	
	/*
	 * Objetivo: Getters e Setters referentes ao evento;
	 */
	
	// get da descricao
	public String getDescricao() {
		return descricao;
	}
	
	// set da descricao
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// get do valor total
	public double getValorTotal() {
		return valorTotal;
	}
	
	// set do valor total
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
