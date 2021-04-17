package Modelo;

/*
Sintese
Objetivo: Classe denominada Orcamento para ser a classe Pai de todos os gastos do evento; 
*/

public class Orcamento {
    protected String descricao; // descricao do gasto
    protected double valorTotal; // valor total do gasto
    protected int tipo; // se tipo == 1: bebida, tipo == 2: comida;  tipo == 3: infraestrutura;  tipo == 4: musica; 
	
	/*
	 * Objetivo: Construtor da Classe Orcamento; 
	 * Entrada : descricao, valorTotal;
	 * 
	 */
	public Orcamento(int tipo, String descricao ,double valorTotal) {
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.tipo = tipo;
	}
	

	public Orcamento() {
	
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

}
