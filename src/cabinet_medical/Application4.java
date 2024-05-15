package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;

public class Application4 {

	 JFrame Application4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application4 window = new Application4();
					window.Application4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application4 = new JFrame();
		Application4.setBounds(100, 100, 500, 370);
		Application4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application4.getContentPane().setLayout(null);
		
		JButton rendez_vous = new JButton("Appointment ");
		rendez_vous.setForeground(Color.WHITE);
		rendez_vous.setBackground(new Color(0, 128, 192));
		rendez_vous.setFont(new Font("Tahoma", Font.BOLD, 15));
		rendez_vous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rendez_vous.setBounds(152, 61, 148, 38);
		Application4.getContentPane().add(rendez_vous);
		
		JButton nouveau = new JButton("New");
		nouveau.setForeground(new Color(255, 255, 255));
		nouveau.setBackground(new Color(0, 128, 192));
		nouveau.setFont(new Font("Tahoma", Font.BOLD, 15));
		nouveau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application5 nouv = new Application5();
				nouv.Application5.setVisible(true);
				Application4.dispose();
			}
		});
		nouveau.setBounds(27, 200, 107, 27);
		Application4.getContentPane().add(nouveau);
		
		JButton view = new JButton("Old");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 128, 192));
		view.setFont(new Font("Tahoma", Font.BOLD, 15));
		view.setBounds(331, 200, 107, 27);
		Application4.getContentPane().add(view);
		
		JLabel Ajout = new JLabel("Add");
		Ajout.setFont(new Font("Tahoma", Font.BOLD, 15));
		Ajout.setBounds(209, 144, 54, 38);
		Application4.getContentPane().add(Ajout);
	}
}
