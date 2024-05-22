package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Application6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application6 window = new Application6();
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
	public Application6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel ficherdv = new JLabel("Fiche de rendez-vous ");
		ficherdv.setForeground(new Color(128, 128, 128));
		ficherdv.setFont(new Font("Tahoma", Font.BOLD, 15));
		ficherdv.setBounds(10, 28, 172, 30);
		frame.getContentPane().add(ficherdv);
		
		JButton btnNewButton = new JButton("click here ");
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(20, 80, 128, 46);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblFicheDePatient = new JLabel("Fiche de patient");
		lblFicheDePatient.setForeground(Color.GRAY);
		lblFicheDePatient.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFicheDePatient.setBounds(10, 156, 172, 30);
		frame.getContentPane().add(lblFicheDePatient);
		
		JButton btnClickHere = new JButton("click here ");
		btnClickHere.setBackground(new Color(0, 128, 192));
		btnClickHere.setForeground(new Color(255, 255, 255));
		btnClickHere.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClickHere.setBounds(20, 209, 128, 46);
		frame.getContentPane().add(btnClickHere);
		
		JLabel lblNewLabel = new JLabel("lazm nzidou icon wla photo hna");
		lblNewLabel.setBounds(345, 80, 155, 175);
		frame.getContentPane().add(lblNewLabel);
	}
}
