package cabinet_dentaire;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;
//import java.awt.image.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Application1 {

	private JFrame frame;
	private JTextField email;
	private JTextField mot_de_passe;
	private Connection connection;
	private Statement statement;
	private JTextField Nom_utilisateur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application1 window = new Application1();
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
	public Application1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 839, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		try {
			//chargement de drive ojdbc pour ce connecter a une base de donnes oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//configurer le lien vers la bdd oracle avec toutes les informations necessaires a la bdd
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","soumia123");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QuickSmileCare");
		lblNewLabel.setBounds(306, 13, 269, 42);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 128, 192));
		lblNewLabel.setForeground(new Color(0, 128, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Connexion");
		lblNewLabel_1.setBounds(15, 66, 109, 17);
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		email = new JTextField();
		email.setBounds(125, 153, 263, 25);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel mail = new JLabel("Email");
		mail.setBounds(15, 156, 84, 14);
		mail.setForeground(new Color(128, 128, 128));
		mail.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(mail);
		
		JLabel mot_passe = new JLabel("Password ");
		mot_passe.setBounds(15, 202, 96, 14);
		mot_passe.setForeground(new Color(128, 128, 128));
		mot_passe.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(mot_passe);
		
		mot_de_passe = new JTextField();
		mot_de_passe.setBounds(125, 199, 263, 25);
		frame.getContentPane().add(mot_de_passe);
		mot_de_passe.setColumns(10);
	
		
		JLabel image1 = new JLabel("");
		image1.setBounds(468, 66, 340, 368);
		frame.getContentPane().add(image1);
		
		JButton New_account = new JButton("sign up");
		New_account.setBounds(125, 313, 263, 32);
		New_account.setBackground(new Color(0, 128, 192));
		New_account.setFont(new Font("Tahoma", Font.BOLD, 15));
		New_account.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(New_account);
		
		JButton FG_pswrd = new JButton("Forget Password");
		FG_pswrd.setFont(new Font("Tahoma", Font.BOLD, 14));
		FG_pswrd.setBackground(new Color(0, 128, 192));
		FG_pswrd.setBounds(15, 375, 378, 32);
		frame.getContentPane().add(FG_pswrd);
		
		JLabel user_name = new JLabel("User Name");
		user_name.setForeground(new Color(128, 128, 128));
		user_name.setFont(new Font("Tahoma", Font.BOLD, 15));
		user_name.setBounds(15, 117, 84, 14);
		frame.getContentPane().add(user_name);
		
		Nom_utilisateur = new JTextField();
		Nom_utilisateur.setBounds(125, 114, 263, 25);
		frame.getContentPane().add(Nom_utilisateur);
		Nom_utilisateur.setColumns(10);
		
		
		
		JButton Bt_connexion = new JButton("Log in ");
		Bt_connexion.setBackground(new Color(0, 128, 192));
		Bt_connexion.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(Bt_connexion);
		Bt_connexion.setBounds(125, 253, 263, 32);
		Bt_connexion.setIcon(new ImageIcon(Application1.class.getResource("/images/connexion .png")));
		Bt_connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String Nom_utilisateur=user_name.getText();
				String mail=email.getText();
				String mot_pasee=mot_de_passe.getText();
				
				//System.out.println(Nom_util+"-"+mot_pasee+"-"+prof);
				String query="INSERT INTO interface values('"+Nom_utilisateur+"','"+mail+"','"+mot_pasee+"')";	
				try {
					statement=connection.createStatement();
					statement.execute(query); 
				 //JOptionPane.showMessageDialog(Bt_connexion,"l'utilisteur a bien ete insere");
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
	}
}
