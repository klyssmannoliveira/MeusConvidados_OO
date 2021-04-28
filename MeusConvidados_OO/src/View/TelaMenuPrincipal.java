package View;

/*
Sintese
Objetivo: Classe denominada Tela Menu Principal  para mostrar a interface gráfica do menu principal do programa; 
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Controle.*;

/**
 * Classe denominada TelaMenuPrincipal, tem como função 
 * apresentar a tela de menu principal, é a classe main do programa.
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */
public class TelaMenuPrincipal implements ActionListener {
	// instancia os objetos da tela
	private static JFrame janela = new JFrame("Meus Convidados");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton gerenciarEvento = new JButton("Gerenciar Evento");
	private static JButton criarEvento = new JButton("Novo Evento");
	private static JButton relatorio = new JButton("Relatorio");
	public static ControleBancoEvento dados = new ControleBancoEvento();

	/**
	 * Método para layout da tela principal do programa.
	 */
	public TelaMenuPrincipal() {
		// Layout da janela: posicionamento, fonte e etc
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 40, 150, 30);
		gerenciarEvento.setBounds(40, 100, 140, 30);
		criarEvento.setBounds(220, 100, 140, 30);
		relatorio.setBounds(130, 150, 140, 30);
		janela.setLayout(null);

		janela.add(titulo);
		janela.add(gerenciarEvento);
		janela.add(criarEvento);
		janela.add(relatorio);

		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	/**
	 * Método para Tela menu principal com os seguintes botões: gerenciar
	 * evento, criar evento e relatorio.
	 * @param args Main
	 */
	public static void main(String[] args) {
		TelaMenuPrincipal menu = new TelaMenuPrincipal();

		gerenciarEvento.addActionListener(menu);
		criarEvento.addActionListener(menu);
		relatorio.addActionListener(menu);
	}

	
	/**
	 * Método para clicar no botão da interface gráfica.
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == gerenciarEvento)
			new TelaEvento().mostrarDadosEventos(dados, 1);

		if (src == criarEvento)
			new TelaDetalheEvento().inserirEditar(1, 0, dados);

		if (src == relatorio)
			new TelaEvento().mostrarDadosEventos(dados, 2);

	}
}
