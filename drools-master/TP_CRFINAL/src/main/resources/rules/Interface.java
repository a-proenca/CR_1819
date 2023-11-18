package rules;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCliente AddCliente = new AddCliente();
				AddCliente.setVisible(true);
				setVisible(false);
			}
		});
		btnEntrar.setBackground(UIManager.getColor("CheckBox.light"));
		btnEntrar.setBounds(216, 139, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(UIManager.getColor("CheckBox.light"));
		btnSair.setBounds(216, 184, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblASuaLoja = new JLabel("A Sua Loja Online");
		lblASuaLoja.setBackground(Color.DARK_GRAY);
		lblASuaLoja.setIcon(null);
		lblASuaLoja.setHorizontalAlignment(SwingConstants.CENTER);
		lblASuaLoja.setForeground(Color.DARK_GRAY);
		lblASuaLoja.setFont(new Font("Tw Cen MT", Font.BOLD, 42));
		lblASuaLoja.setBounds(0, 11, 491, 46);
		contentPane.add(lblASuaLoja);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\OneDrive - ISEC\\Faculdade\\2 ano\\2\u00BA Semestre\\CR\\Jesualdo Salvador\\TRABALHOCR\\TP_CRFINAL\\roupa.jpg"));
		lblNewLabel.setBounds(0, 0, 491, 307);
		contentPane.add(lblNewLabel);
	}
}
