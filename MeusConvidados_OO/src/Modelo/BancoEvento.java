package Modelo;

import java.util.ArrayList;

/**
 * Classe denominada Banco Evento, tem como fun��o armazenar os eventos em um
 * arrayList simulando um banco de dados.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

public class BancoEvento {

	private int qtdEventos; // quantidade de eventos.
	private static ArrayList<Evento> bdEventos = new ArrayList<Evento>(); // cria um arrayList de eventos.

	// get bdEventos
	public ArrayList<Evento> getBdEventos() {
		return bdEventos;
	}

	// set bdEventos
	public void setBdEventos(ArrayList<Evento> bdEventos) {
		BancoEvento.bdEventos = bdEventos;
	}

	// get quantidade de eventos
	public int getQtdEventos() {
		setQtdEventos();
		return qtdEventos;
	}

	// set quantidade de eventos
	public void setQtdEventos() {
		this.qtdEventos = bdEventos.size();
	}

	/**
	 * Adiciona um evento na arrayList banco de dados.
	 * 
	 * @param evento Deve ser uma Classe Evento
	 */

	public void adicionarEvento(Evento evento) {
		bdEventos.add(evento);
	}

	/**
	 * Remove um evento no arrayList banco de dados. Primeiro verifica se a posi��o
	 * passada � maior do que o arrayList; Se for maior retorna falso, caso contr�rio
	 * remove um evento do arrayList na posi��o indicada.
	 * 
	 * @param posicao Inteiro indicando a posi��o do evento na arrayList que ser�
	 *                 removida.
	 * @return verdadeiro ou falso, indicando se o evento foi removido ou n�o.
	 */
	/*
	 * Objetivo: Remover Evento; Entrada: posicao;
	 */
	public boolean removerEvento(int posicao) {
		if (posicao > bdEventos.size()) {

			return false;
		} else {
			bdEventos.remove(posicao);
			return true;

		}

	}

	/**
	 * Inicializa o programa com alguns dados pr�-definidos. Tais como: evento 1-
	 * Casamento, 2- Churrasco, 3 - Niver, 4 - pizzaria.
	 */

	public void fillWithSomeData() {
		// Evento 1
		Evento e1 = new Evento("Casamento", "18/03/2020", "18:00", "23:00", "Alvorada", "72583-250", "Sul", 600.00);
		adicionarEvento(e1);
		Convidado c1 = new Convidado("Klyssmann", 4, "(61)983490979", "klyssmannoliveira@gmail.com",
				"@klyssmannoliveira", "Santa Maria", "72583-250", "Norte");
		Convidado c2 = new Convidado("Hiterson", 5, "(61)983490979", "klyssmannoliveira@gmail.com",
				"@klyssmannoliveira", "Santa Maria", "72583-250", "Norte");
		Tarefa t1 = new Tarefa("Buscar flores", "30/05/2021");
		Tarefa t2 = new Tarefa("Buscar alian�as", "20/05/2021", true);
		Tarefa t3 = new Tarefa("Pegar o uber", "10/05/2021");
		Orcamento g1 = new Bebida(1, "Cervejas", 22, 22.50, 0.0, false, true);
		Bebida b1 = new Bebida(1, "Cervejas", 22, 22.50, 0.0, false, true);
		Orcamento g2 = new Comida(2, "Salgados", 100.00);
		Comida cc2 = new Comida(2, "Salgados", 100.00);
		Orcamento g3 = new Musica(4, "The Beatles", 100.00);
		Musica m3 = new Musica(4, "The Beatles", 100.00);
		Programacao p1 = new Programacao("Casamento", "22:00");
		e1.adicionarProgramacao(p1);
		e1.adicionarConvidado(c1);
		e1.adicionarConvidado(c2);
		e1.adicionarTarefa(t1);
		e1.adicionarTarefa(t2);
		e1.adicionarTarefa(t3);
		e1.adicionarOrcamento(g1);
		e1.adicionarOrcamento(g2);
		e1.adicionarOrcamento(g3);
		e1.adicionarBebida(b1);
		e1.adicionarComida(cc2);
		e1.adicionarMusica(m3);

		// Evento 2
		Evento e2 = new Evento("churrasco", "30/05/2021", "19:00", "24:00", "Alvorada24", "70000-260", "Sudeste",
				90.00);
		adicionarEvento(e2);
		Tarefa t12 = new Tarefa("Buscar alian�as", "20/05/2021", true);
		e2.adicionarTarefa(t12);
		Convidado c12 = new Convidado("Klyssmann", 20, "(61)983490979", "klyssmannoliveira@gmail.com",
				"@klyssmannoliveira", "Santa Maria", "72583-250", "Norte");
		e2.adicionarConvidado(c12);
		// Evento 3
		Evento e3 = new Evento("niver", "18/01/2021", "18:00", "23:00", "Alvorada3", "72583-270", "Sul", 180.00);
		adicionarEvento(e3);
		// Evento 4
		Evento e4 = new Evento("pizzaria", "18/03/2021", "18:00", "23:00", "Alvorada4", "72583-280", "Sul", 50.00);
		adicionarEvento(e4);
	}

}
