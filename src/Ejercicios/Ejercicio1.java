package Ejercicios;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ejercicio1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String intAsString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
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
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 10, 366, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                                   SUMADOR");
		lblNewLabel.setBounds(0, 0, 622, 61);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(37, 81, 366, 141);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("NÚMERO 3");
		lblNewLabel_3.setBounds(10, 82, 76, 31);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("NÚMERO 2");
		lblNewLabel_2.setBounds(10, 51, 76, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("NÚMERO 1");
		lblNewLabel_1.setBounds(10, 10, 76, 31);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(96, 16, 63, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 52, 63, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(96, 88, 63, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.setBounds(76, 232, 85, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(262, 232, 85, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.exit(0);
			}
		});
	
	
	
	btnNewButton .addMouseListener(new MouseAdapter() {
	
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		
		JTextField f1 = textField;
		String text = f1.getText();
		int Num1 = Integer.parseInt(text);
		
		
		JTextField f2 = textField_1;
		String text2 = f2.getText();
		int Num2 = Integer.parseInt(text2);
		
		
		int resultado = Num1 + Num2;
		
		intAsString = Integer.toString(resultado);
		textField_2.setText(intAsString);
		
		
	}
	
	});
	}
}
