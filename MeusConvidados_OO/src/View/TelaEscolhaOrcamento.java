package View;

/**
 * Classe denominada Tela Escolha Orcamento para mostrar a interface gráfica para escolha do tipo do orcamento do evento; 
 * 
 * @author HITER E KLYSSMANN
 * @version 1.0 [Maio 2021]
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Controle.*;

public class TelaEscolhaOrcamento implements ActionListener {

	private static JFrame janela = new JFrame("Meus Convidados");
	private static JLabel titulo = new JLabel("Menu Orçamento");
	private static JButton comida = new JButton("Comida");
	private static JButton bebida = new JButton("Bebida");
	private static JButton musica = new JButton("Música");
	private static JButton infraestrutura = new JButton("Infraestrutura");
	private int posEvento;
	private static ControleBancoEvento dados;

	/**
	 * Método da tela menu do orcamento.
	 * 
	 * @param posEvento Posição do evento.
	 * @param d         Dados inicializados no menu principal.
	 */

	public void TelaMenuOrcamento(int posEvento, ControleBancoEvento d) {

		this.posEvento = posEvento;

		dados = d;
		// Layout da janela: posicionamento, fonte e etc
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 40, 250, 30);
		bebida.setBounds(40, 100, 140, 30);
		comida.setBounds(220, 100, 140, 30);
		infraestrutura.setBounds(40, 140, 140, 30);
		musica.setBounds(220, 140, 140, 30);
		janela.setLayout(null);

		janela.add(titulo);
		janela.add(comida);
		janela.add(bebida);
		janela.add(musica);
		janela.add(infraestrutura);

		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		bebida.addActionListener(this);
		comida.addActionListener(this);
		infraestrutura.addActionListener(this);
		musica.addActionListener(this);
	}

	/**
	 * Método para clicar no botão da interface gráfica do icones do orçamento.
	 */

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == bebida) {
			new TelaCrudOrcamento().inserirEditarOrcamento(1, 1, posEvento, 0, dados);
			janela.dispose();
		}
		if (src == comida) {
			new TelaCrudOrcamento().inserirEditarOrcamento(1, 2, posEvento, 0, dados);
			janela.dispose();
		}

		if (src == infraestrutura) {
			new TelaCrudOrcamento().inserirEditarOrcamento(1, 3, posEvento, 0, dados);
			janela.dispose();
		}

		if (src == musica) {
			new TelaCrudOrcamento().inserirEditarOrcamento(1, 4, posEvento, 0, dados);
			janela.dispose();
		}

	}

}
