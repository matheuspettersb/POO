import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
//OLHAR A AULA DE NOVO E FAZER CORREÇÃO; 24/09
public class Apresentação {

	private JFrame frame;
	private JTextField textField;
	private HashMap<String,Obra> acervo = new HashMap<>();
	private Obra obraAtual;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentação window = new Apresentação();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentação() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 599, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar obra");
		lblNewLabel.setBounds(10, 324, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo da obra:");
		lblNewLabel_1.setBounds(10, 349, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(99, 346, 300, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnConsulta.setBounds(409, 345, 89, 23);
		frame.getContentPane().add(btnConsulta);
		
		JLabel lblNewLabel_6 = new JLabel("Cadastrar nova obra");
		lblNewLabel_6.setBounds(10, 11, 115, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("T\u00EDtulo da obra:");
		lblNewLabel_7.setBounds(10, 36, 100, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Nome do autor:");
		lblNewLabel_8.setBounds(10, 61, 100, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 33, 279, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 58, 279, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adicionar parecer");
		lblNewLabel_2.setBounds(10, 120, 100, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 97, 500, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 311, 500, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nome do parecerista:");
		lblNewLabel_3.setBounds(10, 145, 103, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data:");
		lblNewLabel_4.setBounds(10, 170, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Conte\u00FAdo:");
		lblNewLabel_5.setBounds(10, 195, 100, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(120, 198, 279, 102);
		frame.getContentPane().add(textArea);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 142, 279, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 167, 150, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
