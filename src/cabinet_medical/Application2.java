package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Application2 {

	         JFrame Application2;
	         JTextField full_name;
	         JTextField textField;
	         JTextField textField_1;
	         JTextField textField_2;
	         JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application2 window = new Application2();
					window.Application2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application2 = new JFrame();
		Application2.setBounds(100, 100, 840, 519);
		Application2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application2.getContentPane().setLayout(null);
		
		JLabel f_name = new JLabel("Full Name");
		f_name.setForeground(new Color(128, 128, 128));
		f_name.setFont(new Font("Tahoma", Font.BOLD, 15));
		f_name.setBounds(10, 31, 119, 19);
		Application2.getContentPane().add(f_name);
		
		full_name = new JTextField();
		full_name.setBounds(10, 51, 373, 28);
		Application2.getContentPane().add(full_name);
		full_name.setColumns(10);
		
		JLabel profession = new JLabel("Profession");
		profession.setForeground(new Color(128, 128, 128));
		profession.setFont(new Font("Tahoma", Font.BOLD, 15));
		profession.setBounds(10, 96, 179, 19);
		Application2.getContentPane().add(profession);
		
		textField = new JTextField();
		textField.setBounds(10, 118, 761, 28);
		Application2.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Add = new JLabel("Adresse");
		Add.setForeground(new Color(128, 128, 128));
		Add.setFont(new Font("Tahoma", Font.BOLD, 15));
		Add.setBounds(10, 170, 104, 19);
		Application2.getContentPane().add(Add);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 190, 761, 28);
		Application2.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel mail = new JLabel("Email");
		mail.setForeground(new Color(128, 128, 128));
		mail.setFont(new Font("Tahoma", Font.BOLD, 15));
		mail.setBounds(10, 242, 119, 14);
		Application2.getContentPane().add(mail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 267, 373, 28);
		Application2.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel mot_de_passe = new JLabel("Password ");
		mot_de_passe.setFont(new Font("Tahoma", Font.BOLD, 15));
		mot_de_passe.setForeground(new Color(128, 128, 128));
		mot_de_passe.setBounds(398, 242, 104, 14);
		Application2.getContentPane().add(mot_de_passe);
		
		textField_3 = new JTextField();
		textField_3.setBounds(398, 267, 373, 28);
		Application2.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel check = new JLabel("check me out");
		check.setForeground(new Color(128, 128, 128));
		check.setFont(new Font("Tahoma", Font.BOLD, 12));
		check.setBounds(10, 346, 96, 19);
		Application2.getContentPane().add(check);
		
		JButton Bt_connexion = new JButton("Log in");
		Bt_connexion.setFont(new Font("Tahoma", Font.BOLD, 15));
		Bt_connexion.setBackground(new Color(0, 128, 192));
		Bt_connexion.setForeground(new Color(255, 255, 255));
		Bt_connexion.setBounds(10, 388, 89, 28);
		Application2.getContentPane().add(Bt_connexion);
	}
}
