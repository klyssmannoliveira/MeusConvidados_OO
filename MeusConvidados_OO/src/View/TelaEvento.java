package View;

import Controle.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaEvento implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroEvento;
	private JButton atualizarEvento;
	private static ControleBancoEvento dados;
	private JList<String> listaEventosCriados;
	private String[] listaNomesEvento = new String[50];

	public void mostrarDadosEventos(ControleBancoEvento d, int op) {
		dados = d;

		if (op == 1) {
		
			listaNomesEvento = new ControleBancoEvento(dados).getNomeEventos();
			listaEventosCriados = new JList<String>(listaNomesEvento);
			janela = new JFrame("Eventos");
			titulo = new JLabel("Eventos Cadastrados");
			cadastroEvento = new JButton("Cadastrar");
			atualizarEvento = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaEventosCriados.setBounds(20, 50, 350, 120);
			listaEventosCriados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaEventosCriados.setVisibleRowCount(10);

			cadastroEvento.setBounds(70, 177, 100, 30);
			atualizarEvento.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaEventosCriados);
			janela.add(cadastroEvento);
			janela.add(atualizarEvento);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroEvento.addActionListener(this);
			atualizarEvento.addActionListener(this);
			listaEventosCriados.addListSelectionListener(this);

		} else {
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		// Cadastro do novo evento
		if (src == cadastroEvento)
			new TelaDetalheEvento().inserirEditar(1, dados, null, 0);

		// Atualiza a lista de nomes dos eventos mostrada no JList
		if (src == atualizarEvento) {
			listaEventosCriados.setListData(new ControleBancoEvento(dados).getNomeEventos());
			listaEventosCriados.updateUI();
		}

		}


	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaEventosCriados ) {
			new TelaMostraEvento().mostrarEvento(listaEventosCriados.getSelectedIndex(), this, dados);
		}

		
	}
}

