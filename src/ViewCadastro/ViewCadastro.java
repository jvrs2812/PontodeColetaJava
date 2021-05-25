package ViewCadastro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import CRUD.CRUD;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField TextNome;
	private JTextField TextEnd;
	private JTextField TextBairro;
	private JTextField TextEstado;
	private JTextField TextTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastro frame = new ViewCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewCadastro() {
		setResizable(false);
		setTitle("Cadastro de pontos de coleta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 490, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextNome = new JTextField();
		TextNome.setBounds(47, 43, 185, 27);
		contentPane.add(TextNome);
		TextNome.setColumns(10);
		
		JLabel lblNomeDaColeta = new JLabel("Nome da coleta");
		lblNomeDaColeta.setBounds(47, 26, 131, 15);
		contentPane.add(lblNomeDaColeta);
		
		TextEnd = new JTextField();
		TextEnd.setColumns(10);
		TextEnd.setBounds(47, 102, 185, 27);
		contentPane.add(TextEnd);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setBounds(47, 85, 131, 15);
		contentPane.add(lblEndereco);
		
		TextBairro = new JTextField();
		TextBairro.setColumns(10);
		TextBairro.setBounds(261, 43, 185, 27);
		contentPane.add(TextBairro);
		
		JLabel lblNomeDaColeta_1_1 = new JLabel("Bairro");
		lblNomeDaColeta_1_1.setBounds(261, 26, 131, 15);
		contentPane.add(lblNomeDaColeta_1_1);
		
		TextEstado = new JTextField();
		TextEstado.setColumns(10);
		TextEstado.setBounds(261, 102, 185, 27);
		contentPane.add(TextEstado);
		
		JLabel lblNomeDaColeta_1_2 = new JLabel("Estado");
		lblNomeDaColeta_1_2.setBounds(261, 85, 131, 15);
		contentPane.add(lblNomeDaColeta_1_2);
		
		TextTipo = new JTextField();
		TextTipo.setColumns(10);
		TextTipo.setBounds(47, 158, 185, 27);
		contentPane.add(TextTipo);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(47, 141, 131, 15);
		contentPane.add(lblTipo);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = "";
				String end = "";
				String Bairro = "";
				String Estado = "";
				String Tipo = "";
				
				nome = TextNome.getText();
				end = TextEnd.getText();
				Bairro = TextBairro.getText();
				Estado = TextEstado.getText();
				Tipo = TextTipo.getText();
				
				if ((nome.isEmpty())||(end.isEmpty())||(Bairro.isEmpty())||(Estado.isEmpty())||(Tipo.isEmpty())) {
					JOptionPane.showMessageDialog(ViewCadastro.this, "Todos campos são obrigatório. Verifique !!!");
				}else {
					if (CRUD.CadastrarColeta(nome, end, end, Bairro, Estado, Tipo)) {
						JOptionPane.showMessageDialog(ViewCadastro.this, "Ponto de Coleta Cadastrado com sucesso !!!");
					}else {
						JOptionPane.showMessageDialog(ViewCadastro.this, "Falha no Cadastro !!!");
					}
				}
				
			}
		});
		btnNewButton.setBounds(275, 242, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastro.this.dispose();
			}
		});
		btnFechar.setBounds(101, 242, 117, 25);
		contentPane.add(btnFechar);
	}
}
