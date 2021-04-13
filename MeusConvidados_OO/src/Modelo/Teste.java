/*package Modelo;


public class Teste {

	// Definindo as classes;
	static Convidado a1;
	static Convidado a2;
	static Convidado a3;
	static Tarefa t1;
	static Tarefa t2;
	static Tarefa t3;
	static Evento e1;
	static Orcamento g1;
	static Orcamento g2;
	static Orcamento g3;

	public static void main(String[] args) throws Exception {

		// Instanciando os objetos.
		//e1 = new Evento("Casamento", "30/03/2021", 18, 23, "Alvorada"); // argumentos: nomeEvento, data, horaInicio,
																		// horatermino, enderecao
		a1 = new Convidado("Klyssmann", 4, "99996789", "klyssmannoliveira@gmail.com", "@Klyssmann", "Santa Maria",
				72200300, "TotalVille"); // argumentos: (String nome, int quantAcompanhante, String telefone, String
											// email, String redeSocial, String endereco, int cep, String complemento)
		a2 = new Convidado("Giovanna", 5); // argumentos: nome e quantiddadeAcompanhante;
		a3 = new Convidado("Hiterson", 6); // argumentos: nome e quantiddadeAcompanhante;
		t1 = new Tarefa("Buscar flores", "30/05/2021"); // argumentos: descrição e dataLimite;
		t2 = new Tarefa("Buscar alianças", "20/05/2021", true); // argumentos: (String descricao, String dataLimite,
																// boolean concluido)
		t3 = new Tarefa("Pegar o uber", "10/05/2021");// argumentos: descrição e dataLimite;

		g1 = new Bebida("Cervejas", 22.30);
		g2 = new Comida("Salgados", 100.00);
		g3 = new Musica("The Beatles", 100.00);

		// Fazendo o relacionamento entre os objetos;
		e1.adicionarConvidado(a1);
		e1.adicionarConvidado(a2);
		e1.adicionarConvidado(a3);
		e1.adicionarTarefa(t1);
		e1.adicionarTarefa(t2);
		e1.adicionarTarefa(t3);
		e1.adicionarOrcamento(g1);
		e1.adicionarOrcamento(g2);
		e1.adicionarOrcamento(g3);

		// Imprimi relatório (lista de convidados, lista de tarefas e lista de
		// orçamento);
		e1.relatorio();

		// teste para remover orçamento/tarefas
		e1.removerOrcamento("Salgados");
		e1.removerOrcamento("The Beatles");
		e1.removerTarefa("Pegar o uber");
		e1.listarTarefas();
		e1.listarOrcamentos();

		// teste convidados
		e1.listarConvidados();
		e1.removerConvidado("Giovann");
		e1.listarConvidados();
		e1.atualizarNomeConvidado("Hiterson", "Hitterson"); // atualizar nome
		e1.listarConvidados();
	}

}*/