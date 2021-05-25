package ViewPesquisa;

import CRUD.*;
import jdk.jfr.ContentType;
import model.PontodeColeta;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;

public class ViewPesquisa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPesquisa frame = new ViewPesquisa();
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
	public ViewPesquisa() {
		
		
		
		setTitle("Pesquisar pontos de coleta");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 904, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDaColeta = new JLabel("Nome da coleta");
		lblNomeDaColeta.setBounds(25, 12, 126, 15);
		contentPane.add(lblNomeDaColeta);
		
		JLabel lblEndereco_1 = new JLabel("Endereco");
		lblEndereco_1.setBounds(230, 12, 126, 15);
		contentPane.add(lblEndereco_1);
		
		JLabel lblCidade_1 = new JLabel("Cidade");
		lblCidade_1.setBounds(395, 12, 70, 15);
		contentPane.add(lblCidade_1);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(595, 12, 70, 15);
		contentPane.add(lblBairro);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(784, 12, 70, 15);
		contentPane.add(lblEstado);
		

		ResultSet rs = CRUD.PesquisarColeta();
		List nome = new List();
		List Endereco = new List();
		List Cidade = new List();
		List Bairro = new List();
		List Estado = new List();
		int larguraNome = 25;
		int larguraEnd = 230;
		int larguraCidade = 395;
		int larguraEstado = 784;
		int larguraBairro = 595;
		int altura = 12;
		int count = 0;
		int i;

		
		try {
			while (rs.next()) {
				nome.add(rs.getString("NomeColeta")); 
				Endereco.add(rs.getString("Endereco"));
				Cidade.add(rs.getString("Cidade"));
				Bairro.add(rs.getString("Bairro"));
				Estado.add(rs.getString("Estado"));
				count++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (i = 0;i<count;i++) {
			JLabel lblPontosDeColeta = new JLabel(nome.getItem(i));
			lblPontosDeColeta.setBounds(larguraNome, altura*(i+2), 300, 27);
			
			JLabel lblEndereco = new JLabel(Endereco.getItem(i));
			lblEndereco.setBounds(larguraEnd,altura*(i+2),300,27);
			
			JLabel lblCidade = new JLabel(Cidade.getItem(i));
			lblCidade.setBounds(larguraCidade,altura*(i+2),300,27);
			
			JLabel lblBairro1 = new JLabel(Bairro.getItem(i));
			lblBairro1.setBounds(larguraBairro,altura*(i+2),300,27);
			
			JLabel lblEstado1 = new JLabel(Estado.getItem(i));
			lblEstado1.setBounds(larguraEstado,altura*(i+2),300,27);
			
			contentPane.add(lblEstado1);
			contentPane.add(lblBairro1);
			contentPane.add(lblCidade);
			contentPane.add(lblPontosDeColeta);
			contentPane.add(lblEndereco);
		}
	}
}
