package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controle.ControleBancoEvento;

public class TelaDetalheProgramacao implements ActionListener{
	
	private JFrame janela;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	private JLabel labelHora = new JLabel("Hora: ");
	private JTextField valorHora;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[2];
	private static ControleBancoEvento dados;
	private int posicao;
	private int opcao;
	private String s;
	private int posObjeto;

	public void inserirEditar(int op, int pos, int posObjeto ,ControleBancoEvento d) {

		opcao = op;
		posicao = pos;
		dados = d;
        this.posObjeto = posObjeto;
        
		if (op == 1)
			s = "Adicionar Programação";
		if (op == 2)
			s = "Editar Programação";

		janela = new JFrame(s);

		if (op == 2) { // Edita um evento já cadastrado
			valorDescricao = new JTextField(dados.getDescricaoPro(pos,posObjeto), 200);
			valorHora = new JTextField(String.valueOf(dados.getHoraPro(pos, posObjeto)), 28);
	
		} else { // Cadastro de um novo evento: As caixas de textos aparecem vazias

			valorDescricao = new JTextField(200);
			valorHora = new JTextField(8);


			botaoSalvar.setBounds(245, 235, 115, 30);
		}

		labelDescricao.setBounds(30, 20, 150, 25);
		valorDescricao.setBounds(180, 20, 180, 25);
		labelHora.setBounds(30, 50, 180, 25);
		valorHora.setBounds(180, 50, 180, 25);
		
		// Coloca botoes de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(120, 235, 115, 30);
			botaoExcluir.setBounds(245, 235, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(labelHora);
		this.janela.add(valorHora);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 335);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;

				novoDado[0] = valorDescricao.getText();
				novoDado[1] = valorHora.getText();

				res = dados.adicionarEditarProgramacao(opcao, posicao, posObjeto ,novoDado);

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {// exclui o evento
				res = dados.removerProgramacao(posicao,posObjeto);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoEvento();
			}

		}
	}


	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos; \n"
						+ "2. A data não está no formato dd/mm/aaaa; \n"
						+ "3. Os horários de início e término não estão no formado hh:mm; \n"
						+ "4. O CEP não está no formato 12345-123;",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoEvento() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o nome do evento está correto\n", null,
				JOptionPane.ERROR_MESSAGE);
	}


}
