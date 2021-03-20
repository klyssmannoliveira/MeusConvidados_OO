package Trabalho;

public class Teste {
	static Convidado a1;
	static Convidado a2;
	static Convidado a3;
	static Tarefa t1;
	static Tarefa t2;
	static Tarefa t3;
	static Evento e1;
	static Gasto g1;
	static Gasto g2;
	static Gasto g3;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		e1 = new Evento("Casamento", "30/03/2021", 18, 23, "Alvorada");
		a1 = new Convidado("Klyssmann", 1);
		a2 = new Convidado("Giovanna", 5);
		a3 = new Convidado("Hiterson", 6);
		t1 = new Tarefa("Buscar flores", "20/03/2021");
		t2 = new Tarefa("Buscar alianças", "15/03/2021");
		t3 = new Tarefa("Pegar o uber", "15/03/2021");

		t2.setConcluido(true);
		g1 = new Bebida("Cervejas", 22.30, 1);
		g2 = new Comida("Salgados", 100.00, 100);
		g3 = new Musica("The Beatles", 100.00);
		//System.out.println(t1.toString());

		e1.adicionarConvidado(a1);
		e1.adicionarConvidado(a2);
		e1.adicionarConvidado(a3);
		e1.adicionarTarefa(t1);
		e1.adicionarTarefa(t2);
		e1.adicionarTarefa(t3);
		e1.adicionarGasto(g1);
		e1.adicionarGasto(g2);
		e1.adicionarGasto(g3);

		e1.relatorio();
		
		// teste tarefa/gastos
		//e1.removerGasto("Salgados");
		//e1.removerTarefa("Pegar o uber");
		//e1.listarTarefas();
		//e1.listarGastos();

		//teste convidados
		//e1.listarConvidados();
		//e1.removerConvidado("Giovann");
		//e1.listarConvidados();
		

	}

}