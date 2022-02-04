import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTamanho;
	private JTextField tfValor;
	private JTextField tfPosição;
	private JButton btnOK;
	private VetorDeReais meuObjetoVR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
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
		
		JLabel lblNewLabel = new JLabel("Digite o tamanho do vetor:");
		lblNewLabel.setBounds(10, 11, 137, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfTamanho = new JTextField();
		tfTamanho.setBounds(157, 8, 86, 20);
		frame.getContentPane().add(tfTamanho);
		tfTamanho.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{VetorDeReais meuObjetoVR = new VetorDeReais(Integer.parseInt(tfTamanho.getText()));
				tfValor.setEditable(true);
				tfPosição.setEditable(true);
				btnOK.setEnabled(true);
				}
			
		});
		btnNewButton.setBounds(253, 7, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Entre com:");
		lblNewLabel_1.setBounds(10, 83, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValor = new JTextField();
		tfValor.setEditable(false);
		tfValor.setBounds(90, 80, 86, 20);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		tfPosição = new JTextField();
		tfPosição.setEditable(false);
		tfPosição.setBounds(186, 80, 86, 20);
		frame.getContentPane().add(tfPosição);
		tfPosição.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setBounds(111, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Posi\u00E7\u00E3o");
		lblNewLabel_3.setBounds(197, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(59, 43, 312, 2);
		frame.getContentPane().add(separator);
		
		btnOK = new JButton("OK");
		// action listener, REVER AULA
		btnOK.setEnabled(false);
		btnOK.setBounds(282, 79, 89, 23);
		frame.getContentPane().add(btnOK);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(60, 134, 312, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnInverter = new JButton("Inverter");
		btnInverter.addActionListener(new ActionListener() { //REVER AULA PRA FAZER DIREITO
			public void actionPreformed(ActionEvent arg0) {
				meuObjetoVR.inverter();
			}
		}
		btnInverter.setBounds(59, 160, 89, 23);
		frame.getContentPane().add(btnInverter);
	}
}
