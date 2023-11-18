package rules;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.Item;
import com.sample.Pessoa;


import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class AddCliente extends JFrame {
   

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCliente frame = new AddCliente();
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
	public AddCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 424);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnStock = new JMenu("Stock");
		menuBar.add(mnStock);
		
		JMenuItem mntmMostrarStock = new JMenuItem("Mostrar Stock");
		mntmMostrarStock.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stock stock = new Stock();
				 stock.setVisible(true);
			}
		});
		mnStock.add(mntmMostrarStock);
		
		JMenu mnOpcoes = new JMenu("Opcoes");
		menuBar.add(mnOpcoes);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnOpcoes.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelnome = new JLabel("Nome:");
		labelnome.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelnome.setBounds(24, 46, 48, 14);
		contentPane.add(labelnome);
		
		JLabel labelEstadoCivil = new JLabel("Estado Civil:");
		labelEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelEstadoCivil.setBounds(24, 105, 85, 14);
		contentPane.add(labelEstadoCivil);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(271, 89, 296, 209);
		contentPane.add(textArea);
		
		JTextArea recomendacoes = new JTextArea();
		recomendacoes.setForeground(Color.BLACK);
		recomendacoes.setFont(new Font("Tahoma", Font.BOLD, 11));
		recomendacoes.setBackground(Color.WHITE);
		recomendacoes.setBounds(354, 64, 213, 21);
		contentPane.add(recomendacoes);
		
		txtnome = new JTextField();
		txtnome.setBounds(24, 64, 197, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		JComboBox boxestado = new JComboBox();
		boxestado.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Casado", "Divorciado(a)", "Viuvo(a)"}));
		boxestado.setBounds(24, 120, 85, 22);
		contentPane.add(boxestado);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSexo.setBounds(24, 169, 48, 14);
		contentPane.add(lblSexo);
		
		JComboBox boxsexo = new JComboBox();
		boxsexo.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		boxsexo.setBounds(24, 185, 48, 22);
		contentPane.add(boxsexo);
		
		JLabel lblFilhos = new JLabel("Filhos:");
		lblFilhos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFilhos.setBounds(24, 234, 48, 14);
		contentPane.add(lblFilhos);
		
		JComboBox boxfilhos = new JComboBox();
		boxfilhos.setModel(new DefaultComboBoxModel(new String[] {"Sim", "Nao"}));
		boxfilhos.setBounds(24, 249, 48, 22);
		contentPane.add(boxfilhos);
		
		
		 KieServices ks = KieServices.Factory.get();
		 KieContainer kContainer = ks.getKieClasspathContainer();
		 KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		JButton adicionarcliente = new JButton("Analisar Cliente");
		adicionarcliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String nome=txtnome.getText();
				String sexo = (String) boxsexo.getSelectedItem();
				String estado =  (String) boxestado.getSelectedItem();
				String filhos= (String) boxfilhos.getSelectedItem();
				boolean resultado = filhos.equalsIgnoreCase("Sim");
				Pessoa p = new Pessoa(nome,sexo,estado,resultado,false);
				kSession.insert(p);

				 


	             //default icon, custom title
	          JOptionPane.showMessageDialog(null, "Vamos analisar "+p.getNome());
	          Item i1 = new Item("Cinto",100,12.32,null,"F",true,false);
	        	 Item i2 = new Item("Sandalias",100,12.32,i1,"F",true,true);
	        	 Item i5 = new Item("teste",23,12.32,i1,"F",true,true);
	        	 Item i3 = new Item("T-shirt o meu pai é o boss",100,5.32,null,"F",true,false);
	        	 Item i4 = new Item("T-shirt a minha mãe é a boss",100,5.32,null,"F",true,false);
	        	 kSession.insert(i5);
	        	 kSession.insert(i1);
	        	 kSession.insert(i2);
	        	 kSession.insert(i3);
	        	 kSession.insert(i4);
				
						
		       	 kSession.setGlobal("recomendacoes", recomendacoes);
	        	 kSession.setGlobal("textArea",textArea);
	        	 kSession.setGlobal("textField",textField);
				       
				kSession.fireAllRules();
	        	
			}
		});
		adicionarcliente.setBounds(24, 320, 128, 20);
		contentPane.add(adicionarcliente);
		
		JLabel recomendar = new JLabel("Recomendar:");
		recomendar.setFont(new Font("Tahoma", Font.BOLD, 11));
		recomendar.setBounds(271, 64, 85, 20);
		contentPane.add(recomendar);
		
		textField = new JTextField();
		textField.setBounds(329, 306, 213, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JLabel lblIndique = new JLabel("Indique:");
		lblIndique.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIndique.setBounds(271, 309, 48, 14);
		contentPane.add(lblIndique);
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
		        				

			
			}});
		btnOk.setBounds(381, 336, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\OneDrive - ISEC\\Faculdade\\2 ano\\2\u00BA Semestre\\CR\\Jesualdo Salvador\\TRABALHOCR\\TP_CRFINAL\\roupa.jpg"));
		lblNewLabel.setBounds(0, 0, 630, 363);
		contentPane.add(lblNewLabel);
		
		
		
	
	}
}
