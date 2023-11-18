package rules;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Stock extends JFrame {

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
					Stock frame = new Stock();
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
	public Stock() {
		
		
		 KieServices ks = KieServices.Factory.get();
		 KieContainer kContainer = ks.getKieClasspathContainer();
		 KieSession kSession = kContainer.newKieSession("ksession-rules");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnMostra = new JButton("Mostra");
		btnMostra.setBounds(118, 227, 89, 23);
		btnMostra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnMostra);
		
		JTextArea textStock = new JTextArea();
		textStock.setBounds(29, 11, 142, 40);
		contentPane.add(textStock);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSair.setBounds(217, 227, 89, 23);
		contentPane.add(btnSair);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Camisola");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				System.out.print("teste");
		        kSession.fireAllRules();
			}
		});
		rdbtnNewRadioButton.setBounds(71, 143, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
	}
}
