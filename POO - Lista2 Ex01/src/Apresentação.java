import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Apresentação {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField textField;
	private JTextField textField_1;
	//antigo: private Contribuinte[] vetorContrib = new Contribuinte[100];
	//antigo: private int indiceVetor = 0;
	private JTextField textField_2;
	private JTextField tf_ConsultaCPF;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Contribu\u00EDnte:");
		lblNewLabel.setBounds(10, 11, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(128, 8, 220, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(128, 39, 220, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UF:");
		lblNewLabel_2.setBounds(10, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(128, 70, 220, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 101, 220, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Renda Anual (R$):");
		lblNewLabel_3.setBounds(10, 104, 108, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(127, 132, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Valor a consultar:");
		lblNewLabel_4.setBounds(10, 169, 108, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 166, 118, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Consultar");
		btnNewButton_1.setBounds(259, 165, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Pesquisar CPF:");
		lblNewLabel_5.setBounds(10, 236, 89, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tf_ConsultaCPF = new JTextField();
		tf_ConsultaCPF.setBounds(128, 233, 118, 20);
		frame.getContentPane().add(tf_ConsultaCPF);
		tf_ConsultaCPF.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Consultar");
		btnNewButton_2.setBounds(259, 232, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
