package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application11 {

	private JFrame Application11;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application11 window = new Application11();
					window.Application11.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application11 = new JFrame();
		Application11.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		Application11.setBounds(100, 100, 697, 543);
		Application11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application11.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Certificat médical ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(248, 44, 227, 20);
		Application11.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(22, 113, 74, 20);
		Application11.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Profession");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(22, 144, 82, 20);
		Application11.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" Patient :");
		lblNewLabel_1_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(22, 175, 82, 20);
		Application11.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Surname");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(22, 237, 82, 20);
		Application11.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Doctor :");
		lblNewLabel_1_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(22, 82, 106, 20);
		Application11.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Name ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(22, 206, 82, 20);
		Application11.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Age");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1_1.setBounds(22, 268, 89, 20);
		Application11.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Signature :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 436, 106, 26);
		Application11.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(99, 115, 264, 20);
		Application11.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 144, 264, 20);
		Application11.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 206, 264, 20);
		Application11.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 239, 264, 20);
		Application11.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(99, 268, 264, 20);
		Application11.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(22, 473, 248, 20);
		Application11.getContentPane().add(textField_5);
		
		JButton btnNewButton = new JButton("Cancel ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application9 consultation = new Application9();
				consultation.Application9.setVisible(true);
				Application11.dispose();
			}
		});
		btnNewButton.setBackground(new Color(64, 128, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(284, 452, 89, 41);
		Application11.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Details :");
		lblNewLabel_1_2_2.setForeground(Color.GRAY);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(14, 313, 82, 20);
		Application11.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Consultation Date");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(22, 344, 172, 20);
		Application11.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Diagnostic");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1_1.setBounds(22, 375, 98, 20);
		Application11.getContentPane().add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Length of incapacity ");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1_2.setBounds(22, 405, 143, 20);
		Application11.getContentPane().add(lblNewLabel_1_3_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(163, 344, 201, 20);
		Application11.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(99, 375, 264, 20);
		Application11.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(170, 407, 194, 20);
		Application11.getContentPane().add(textField_8);
	}

}
