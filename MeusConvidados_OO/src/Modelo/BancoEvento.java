package Modelo;

import java.util.ArrayList;

public class BancoEvento {

	private int qtdEventos;

	private static ArrayList<Evento> bdEventos = new ArrayList<Evento>();

	public ArrayList<Evento> getBdEventos() {
		return bdEventos;
	}

	public void setBdEventos(ArrayList<Evento> bdEventos) {
		BancoEvento.bdEventos = bdEventos;
	}

	public int getQtdEventos() {
		setQtdEventos();
		return qtdEventos;
	}

	public void setQtdEventos() {
		this.qtdEventos = bdEventos.size();
	}

	public void adicionarEvento(Evento evento) {
		bdEventos.add(evento);
	}
	
	public boolean removerEvento(int posicao) {
		if(posicao > bdEventos.size()) {
			
			return false;
		}else {
			bdEventos.remove(posicao);
			return true;
			
		}
	
	}
	
	public void fillWithSomeData() {
		//Evento 1
		Evento e1 = new Evento("Casamento", "18/03/2020", "18:00", "23:00", "Alvorada", "72583-250", "Sul");
		adicionarEvento(e1);
		Convidado c1 = new Convidado("Klyssmann", 4, "(61)983490979", "klyssmannoliveira@gmail.com", "@klyssmannoliveira", "Santa Maria", "72583-250", "Norte");
		Convidado c2 = new Convidado("Hiterson", 5, "(61)983490979", "klyssmannoliveira@gmail.com", "@klyssmannoliveira", "Santa Maria", "72583-250", "Norte");
		Tarefa t1 = new Tarefa("Buscar flores", "30/05/2021"); 
		Tarefa t2 = new Tarefa("Buscar alianças", "20/05/2021", true);
		Tarefa t3 = new Tarefa("Pegar o uber", "10/05/2021");
		Orcamento g1 = new Bebida(1,"Cervejas", 22.30);
		Orcamento g2 = new Comida(2,"Salgados", 100.00);
		Orcamento g3 = new Musica(4,"The Beatles", 100.00);
		e1.adicionarConvidado(c1);
		e1.adicionarConvidado(c2);
		e1.adicionarTarefa(t1);
		e1.adicionarTarefa(t2);
		e1.adicionarTarefa(t3);
		e1.adicionarOrcamento(g1);
		e1.adicionarOrcamento(g2);
		e1.adicionarOrcamento(g3);
		
		//Evento 2
		Evento e2 = new Evento("churrasco", "30/05/2021", "19:00", "24:00", "Alvorada24", "70000-260", "Sudeste");
		adicionarEvento(e2);
		Tarefa t12 = new Tarefa("Buscar alianças", "20/05/2021", true);
		e2.adicionarTarefa(t12);
		Convidado c12 = new Convidado("Klyssmann", 20, "(61)983490979", "klyssmannoliveira@gmail.com", "@klyssmannoliveira", "Santa Maria", "72583-250", "Norte");
		e2.adicionarConvidado(c12);
		Evento e3 = new Evento("niver", "18/01/2021", "18:00", "23:00", "Alvorada3", "72583-270", "Sul");
		adicionarEvento(e3);
		Evento e4 = new Evento("pizzaria", "18/03/2021", "18:00", "23:00", "Alvorada4", "72583-280", "Sul");
		adicionarEvento(e4);
		
	}
	
}
