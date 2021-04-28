package View;

/*
Sintese
Objetivo: Classe denominada Tela Programação a interface gráfica do Programação do evento; 
*/

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controle.ControleBancoEvento;

/**
 * Classe denominada TelaProgramacao, tem como função 
 * listar a programação de um evento.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class TelaProgramacao implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton adicionar;
	private JButton atualizar;
	private static ControleBancoEvento dados;
	private JList<String> listaDadosDescricao;
	private JList<String> listaDadosHora;
	private String[] listaDescricao = new String[200];
	private String[] listaHora = new String[200];
	private String s;
	private int posicao;

	/*
	 * Objetivo: Método para mostrar a programação do evento. Entrada : pos,
	 * ControleBancoEvento d;
	 * 
	 */
	/**
	 * Método para mostrar a programação do evento.
	 * @param pos Posição do Evento selecionado.
	 * @param d Dados inicializados no menu principal.
	 */
	public void mostrarProgramacao(int pos, ControleBancoEvento d) {
		dados = d;
		posicao = pos;
		s = "Lista de Programação";

		janela = new JFrame(s);

		listaDescricao = new ControleBancoEvento(dados).getDescricaoProgramacao(posicao);
		listaDadosDescricao = new JList<String>(listaDescricao);
		listaHora = new ControleBancoEvento(dados).getHoraProgramacao(posicao);
		listaDadosHora = new JList<String>(listaHora);

		titulo = new JLabel("Lista de Programação");
		adicionar = new JButton("Adicionar");
		atualizar = new JButton("Atualizar");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaDadosDescricao.setBounds(100, 50, 250, 120);
		listaDadosDescricao.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDadosDescricao.setVisibleRowCount(10);

		listaDadosHora.setBounds(40, 50, 60, 120);
		listaDadosHora.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDadosHora.setVisibleRowCount(10);

		adicionar.setBounds(70, 197, 100, 30);
		atualizar.setBounds(200, 197, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaDadosDescricao);
		janela.add(listaDadosHora);
		janela.add(adicionar);
		janela.add(atualizar);

		janela.setSize(400, 290);
		janela.setVisible(true);

		adicionar.addActionListener(this);
		atualizar.addActionListener(this);
		listaDadosDescricao.addListSelectionListener(this);

	}

	/**
	 * Captura eventos relacionados aos botões da interface.
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Cadastro do novo evento
		if (src == adicionar) {

			new TelaDetalheProgramacao().inserirEditar(1, posicao, 0, dados);
		}
		// Atualiza a lista de nomes dos eventos mostrada no JList
		if (src == atualizar) {

			listaDadosDescricao.setListData(new ControleBancoEvento(dados).getDescricaoProgramacao(posicao));
			listaDadosDescricao.updateUI();
			listaDadosHora.setListData(new ControleBancoEvento(dados).getHoraProgramacao(posicao));
			listaDadosHora.updateUI();

		}

	}

	/**
	 * Captura eventos relacionados ao JList.
	 */
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDadosDescricao) {

			new TelaDetalheProgramacao().inserirEditar(2, posicao, listaDadosDescricao.getSelectedIndex(), dados);

		}

	}

}
