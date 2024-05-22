package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application9 {

	 JFrame Application9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application9 window = new Application9();
					window.Application9.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application9 = new JFrame();
		Application9.setBounds(100, 100, 625, 414);
		Application9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application9.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("create a medical certificate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(184, 130, 235, 28);
		Application9.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Start the consultation");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(198, 50, 191, 28);
		Application9.getContentPane().add(lblNewLabel);
		
		JButton btnCreateAMedical = new JButton("create a medical prescription");
		btnCreateAMedical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application10 consultation = new Application10();
				consultation.Application10.setVisible(true);
				Application9.dispose();
			}
		});
		btnCreateAMedical.setForeground(Color.WHITE);
		btnCreateAMedical.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreateAMedical.setBackground(new Color(0, 0, 128));
		btnCreateAMedical.setBounds(184, 195, 235, 28);
		Application9.getContentPane().add(btnCreateAMedical);
		
		JButton btnNewButton_1 = new JButton("Continue ");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(220, 266, 147, 51);
		Application9.getContentPane().add(btnNewButton_1);
	}

}
