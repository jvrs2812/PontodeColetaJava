package ViewPrin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.IntegerValue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ViewPesquisa;
import ViewCadastro;

public class ViewPrin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrin frame = new ViewPrin();
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
	public ViewPrin() {
		setResizable(false);
		
		//pega o tamanho da tela
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setTitle("Pontos de coleta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH); 
		
		JButton btnPesquisarPontosDe = new JButton("Pesquisar pontos de coleta");
		btnPesquisarPontosDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewPesquisa.ViewPesquisa pes = new ViewPesquisa.ViewPesquisa();
				pes.setVisible(true);
			}
		});
		int alinha = (int)Math.round((width*0.5)-351);
		
		btnPesquisarPontosDe.setBounds(alinha, 12, 351, 25);
		contentPane.add(btnPesquisarPontosDe);
		
		JButton btnCadastrarPontosDe = new JButton("Cadastrar pontos de coleta");
		btnCadastrarPontosDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastro.ViewCadastro cad = new ViewCadastro.ViewCadastro();
				cad.setVisible(true);
			}
		});
		btnCadastrarPontosDe.setBounds(alinha, 68, 351, 25);
		contentPane.add(btnCadastrarPontosDe);
	}
}
