package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Application5 {

	 JFrame Application5;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application5 window = new Application5();
					window.Application5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application5 = new JFrame();
		Application5.setBounds(100, 100, 840, 519);
		Application5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application5.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setBounds(39, 30, 263, 25);
		Application5.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(39, 61, 405, 31);
		Application5.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number ");
		lblPhoneNumber.setForeground(Color.GRAY);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhoneNumber.setBounds(39, 103, 263, 25);
		Application5.getContentPane().add(lblPhoneNumber);
		
		JLabel lblSelectedDoctor = new JLabel("Selected doctor ");
		lblSelectedDoctor.setForeground(Color.GRAY);
		lblSelectedDoctor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectedDoctor.setBounds(39, 192, 263, 25);
		Application5.getContentPane().add(lblSelectedDoctor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(39, 139, 405, 31);
		Application5.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(39, 228, 405, 31);
		Application5.getContentPane().add(textField_2);
		
		JLabel lblAppointmentDate = new JLabel("Appointment Date");
		lblAppointmentDate.setForeground(Color.GRAY);
		lblAppointmentDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAppointmentDate.setBounds(39, 284, 263, 25);
		Application5.getContentPane().add(lblAppointmentDate);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 320, 405, 31);
		Application5.getContentPane().add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(454, 62, 360, 290);
		Application5.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"FELLAH Fatima", null},
				{"BOUAISSI Soumia", null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, ""},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Doctor Name", "Profession"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(248);
		table.getColumnModel().getColumn(1).setPreferredWidth(302);
	}
}
