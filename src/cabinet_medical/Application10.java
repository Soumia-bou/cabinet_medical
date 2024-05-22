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

public class Application10 {

	 JFrame Application10;
	 JTextField textField;
	 JTextField textField_1;
	JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;
	 JTextField textField_5;
	 JTextField textField_6;
	 JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application10 window = new Application10();
					window.Application10.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application10 = new JFrame();
		Application10.getContentPane().setForeground(new Color(0, 0, 64));
		Application10.setBounds(100, 100, 786, 537);
		Application10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application10.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ordonnance Medicale");
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(243, 32, 214, 22);
		Application10.getContentPane().add(lblNewLabel);
		
		JLabel lblPatienteName = new JLabel("Patient Name");
		lblPatienteName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatienteName.setBounds(10, 128, 103, 22);
		Application10.getContentPane().add(lblPatienteName);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(427, 128, 62, 14);
		Application10.getContentPane().add(lblDate);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAge.setBounds(10, 183, 56, 19);
		Application10.getContentPane().add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(122, 127, 295, 20);
		Application10.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(470, 128, 177, 20);
		Application10.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 184, 205, 20);
		Application10.getContentPane().add(textField_2);
		
		JLabel lblGander = new JLabel("Gander ");
		lblGander.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGander.setBounds(260, 183, 56, 19);
		Application10.getContentPane().add(lblGander);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(326, 184, 177, 20);
		Application10.getContentPane().add(textField_3);
		
		JLabel lblWeight = new JLabel("Weight ");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight.setBounds(513, 183, 75, 19);
		Application10.getContentPane().add(lblWeight);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(583, 184, 177, 20);
		Application10.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Doctor Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 81, 103, 14);
		Application10.getContentPane().add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(128, 80, 289, 20);
		Application10.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Médicaments / dosages : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 229, 193, 22);
		Application10.getContentPane().add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 262, 578, 225);
		Application10.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSignature = new JLabel("Signature :");
		lblSignature.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSignature.setBounds(598, 283, 81, 19);
		Application10.getContentPane().add(lblSignature);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(598, 313, 167, 20);
		Application10.getContentPane().add(textField_7);
		
		JButton btnNewButton = new JButton("Cancel ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application9 consultation = new Application9();
				consultation.Application9.setVisible(true);
				Application10.dispose();
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(64, 128, 128));
		btnNewButton.setBounds(620, 377, 89, 41);
		Application10.getContentPane().add(btnNewButton);
	}

}
