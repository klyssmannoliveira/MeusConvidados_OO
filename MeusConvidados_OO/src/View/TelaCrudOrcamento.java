package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controle.ControleBancoEvento;

public class TelaCrudOrcamento implements ActionListener {

	private JFrame janela;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleBancoEvento dados;
	private int opcao;
	private JLabel labelDescricao = new JLabel("Descri��o: ");
	private JTextField valorDescricao;
	private JLabel labelValorTotal = new JLabel("Valor total: ");
	private JTextField valorValorTotal;
	private JLabel labelQuantidade = new JLabel("Quantidade: ");
	private JTextField valorQuantidade;
	private JLabel labelValorUnitario = new JLabel("Valor Unit�rio: ");
	private JTextField valorValorUnitario;
	private JCheckBox valorAlcoolico = new JCheckBox(" Alco�lico ");
	private JCheckBox valorBebidaQuente = new JCheckBox(" Bebida Quente ");
	private JCheckBox valorPrincipal = new JCheckBox(" Prato Principal ");
	private JCheckBox valorDegustativo = new JCheckBox(" Prato Degustativo ");
	private JCheckBox valorSobremessa = new JCheckBox(" Sobremessa ");
	private JCheckBox valorDecoracao = new JCheckBox(" Decora��o ");
	private JCheckBox valorEstacionamento = new JCheckBox(" Estacionamento ");
	private JCheckBox valorImobiliario = new JCheckBox(" Imobiliario ");
	private JCheckBox valorInternet = new JCheckBox(" Internet ");
	private JCheckBox valorEquipamento= new JCheckBox(" Equipamento ");
	private JCheckBox valorToalete= new JCheckBox(" Toalete ");
	private JLabel labelGeneroMusical = new JLabel("G�nero Musical: ");
	private JTextField valorGeneroMusical;
	private JCheckBox valorBanda = new JCheckBox(" Banda ");
	private JCheckBox valorDj = new JCheckBox(" Dj ");
	
	
	
	private int posObjeto;
	private int posEvento;
	private String s;
	private int tipo;
	
	public void inserirEditarOrcamento(int op, int tipo ,int posEvento, int posObjeto, ControleBancoEvento d) {

		opcao = op;
		
		this.posObjeto = posObjeto;
		this.posEvento = posEvento;
		this.tipo = tipo;
		dados = d;

		if (op == 1)
			s = "Cadastro de Or�amento";
		if (op == 2)
			s = "Atualizar Or�amento";

		janela = new JFrame(s);

		if (op == 1 && tipo == 1) {    //Cadastro Bebidas

			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
			valorValorUnitario  = new JTextField(200);
			valorQuantidade = new JTextField(200);
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelQuantidade.setBounds(30, 50, 180, 25);
			valorQuantidade.setBounds(120, 50, 180, 25);
			valorValorUnitario.setBounds(120, 80, 180, 25);
			labelValorUnitario.setBounds(30, 80, 180, 25);
			
			labelValorTotal.setBounds(30, 110, 180, 25);
			valorValorTotal.setBounds(120, 110, 180, 25);
			valorBebidaQuente.setBounds(30, 140, 180, 25);
			valorAlcoolico.setBounds(30, 170, 180, 25);
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelQuantidade);
			this.janela.add(valorQuantidade);
			this.janela.add(valorBebidaQuente);
			this.janela.add(valorValorUnitario);
			this.janela.add(labelValorUnitario);
			this.janela.add(valorAlcoolico);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);

		}
		if (op == 1 && tipo == 2 ) { // cadastro comida

			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
			valorValorUnitario  = new JTextField(200);
			valorQuantidade = new JTextField(200);
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelQuantidade.setBounds(30, 50, 180, 25);
			valorQuantidade.setBounds(120, 50, 180, 25);
			valorValorUnitario.setBounds(120, 80, 180, 25);
			labelValorUnitario.setBounds(30, 80, 180, 25);
			labelValorTotal.setBounds(30, 110, 180, 25);
			valorValorTotal.setBounds(120, 110, 180, 25);
			
			valorPrincipal.setBounds(30, 140, 180, 25);
			valorDegustativo.setBounds(30, 170, 180, 25);
			valorSobremessa.setBounds(30, 200, 180, 25);
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelQuantidade);
			this.janela.add(valorQuantidade);
			this.janela.add(valorDegustativo);
			this.janela.add(valorValorUnitario);
			this.janela.add(labelValorUnitario);
			this.janela.add(valorPrincipal);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			this.janela.add(valorSobremessa);
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		}
		if (op == 1 && tipo== 3) { // cadastro Infraestrutura


			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
		
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(120, 20, 180, 25);
			labelValorTotal.setBounds(30, 50, 180, 25);
			valorValorTotal.setBounds(120, 50, 180, 25);
			valorDecoracao.setBounds(30, 80, 180, 25);
			valorEstacionamento.setBounds(30, 110, 180, 25);
			valorImobiliario.setBounds(30, 140, 180, 25);
			valorInternet.setBounds(30, 170, 180, 25);
			valorEquipamento.setBounds(30, 200, 180, 25);
			valorToalete.setBounds(30, 230, 180, 25);
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(valorDecoracao);
			this.janela.add(valorEstacionamento);
			this.janela.add(valorImobiliario);
			this.janela.add(valorInternet);
			this.janela.add(valorEquipamento);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			this.janela.add(valorToalete);
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
			
		}
		if (op == 1 && tipo == 4) { // cadastro musica
			
			valorDescricao = new JTextField(200);
			valorValorTotal = new JTextField(8);
			valorGeneroMusical = new JTextField(20);
		
	
			labelDescricao.setBounds(30, 20, 180, 25);
			valorDescricao.setBounds(130, 20, 180, 25);
			labelValorTotal.setBounds(30, 50, 180, 25);
			valorValorTotal.setBounds(130, 50, 180, 25);
			labelGeneroMusical.setBounds(30, 80, 180, 25);
			valorGeneroMusical.setBounds(130, 80, 180, 25);
			valorBanda.setBounds(30, 110, 180, 25);
			valorDj.setBounds(30, 140, 180, 25);
			
			
			botaoSalvar.setBounds(245, 265, 115, 30);

			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(valorBanda);
			this.janela.add(valorDj);
			this.janela.add(labelGeneroMusical);
			this.janela.add(valorGeneroMusical);
			this.janela.add(valorValorTotal);
			this.janela.add(labelValorTotal);
			
			

			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 360);
			
		}

		this.janela.setVisible(true);
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				/*if (opcao == 1 || opcao == 3) {
					novoDado[1] = valorNome.getText();
					novoDado[2] = valorQuantAcompanhante.getText();
					novoDado[3] = valorEmail.getText();
					novoDado[4] = valorRedeSocial.getText();
					novoDado[5] = valorEnd.getText();
					novoDado[6] = valorCEP.getText();
					novoDado[7] = valorComplemen.getText();
					novoDado[8] = valorTelefone.getText();
					res = dados.adicionarEditarConvidado(opcao, posEvento, posObjeto, novoDado);
				} else if (opcao == 2 || opcao == 4) {

					novoDado[1] = valorDescricao.getText();
					novoDado[2] = valorDataLimite.getText();
					if (valorConcluido.isSelected())
						novoDado[3] = "true";
					else
						novoDado[3] = "false";

					res = dados.adicionarEditarTarefa(opcao, posEvento, posObjeto, novoDado);
				} else
					res = false;

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();
*/
			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) // exclui o evento
				res = dados.removerConvidado(posEvento, posObjeto);

			if (opcao == 4)
				res = dados.removerTarefa(posEvento, posObjeto);
			if (res)
				mensagemSucessoExclusao();
			else
				mensagemErroExclusaoEvento();
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
						+ "2. A data n�o est� no formato dd/mm/aaaa; \n"
						+ "3. Os hor�rios de in�cio e t�rmino n�o est�o no formado hh:mm; \n"
						+ "4. O CEP n�o est� no formato 12345-123;",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoEvento() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o nome do evento est� correto\n", null,
				JOptionPane.ERROR_MESSAGE);
	}

}
