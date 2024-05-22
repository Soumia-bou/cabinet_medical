package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application5 {

	 JFrame Application5;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 private JTable table;
	 DefaultTableModel model;
	 private JTextField nom_doctor;
	 private JTextField métier;

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
		lblNewLabel.setBounds(39, 67, 263, 25);
		Application5.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(39, 103, 373, 31);
		Application5.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number ");
		lblPhoneNumber.setForeground(Color.GRAY);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhoneNumber.setBounds(39, 145, 263, 25);
		Application5.getContentPane().add(lblPhoneNumber);
		
		JLabel lblSelectedDoctor = new JLabel("Selected doctor ");
		lblSelectedDoctor.setForeground(Color.GRAY);
		lblSelectedDoctor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectedDoctor.setBounds(39, 223, 263, 25);
		Application5.getContentPane().add(lblSelectedDoctor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(39, 181, 373, 31);
		Application5.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(39, 259, 373, 31);
		Application5.getContentPane().add(textField_2);
		
		JLabel lblAppointmentDate = new JLabel("Appointment Date");
		lblAppointmentDate.setForeground(Color.GRAY);
		lblAppointmentDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAppointmentDate.setBounds(39, 301, 263, 25);
		Application5.getContentPane().add(lblAppointmentDate);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 337, 373, 31);
		Application5.getContentPane().add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(449, 74, 343, 294);
		Application5.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model= new DefaultTableModel();
		Object[] column ={"Name doctor","Profession"};
		Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton update = new JButton("Update ");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(nom_doctor.getText(), i, 0);
				model.setValueAt(métier.getText(), i, 1);
				JOptionPane.showMessageDialog(null, "Updated seccessfully");
				} 
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		update.setBackground(new Color(128, 0, 0));
		update.setForeground(new Color(255, 255, 255));
		update.setFont(new Font("Tahoma", Font.BOLD, 14));
		update.setBounds(669, 429, 89, 23);
		Application5.getContentPane().add(update);
		
		JButton delete = new JButton("Delete ");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "Deleted seccessfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete.setForeground(new Color(255, 255, 255));
		delete.setBackground(new Color(64, 0, 128));
		delete.setBounds(669, 395, 89, 23);
		Application5.getContentPane().add(delete);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nom_doctor.setText(" ");
				métier.setText(" ");
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setForeground(new Color(255, 255, 255));
		clear.setBackground(new Color(0, 64, 0));
		clear.setBounds(487, 429, 89, 23);
		Application5.getContentPane().add(clear);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nom_doctor.getText().equals("") || métier.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} 
				else 
				{
				row[0]=nom_doctor.getText();
				row[1]=métier.getText();
				model.addRow(row);
				nom_doctor.setText(" ");
				métier.setText(" ");
			}}
			
		});
		add.setBackground(new Color(128, 0, 64));
		add.setForeground(new Color(255, 255, 255));
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setBounds(487, 395, 89, 23);
		Application5.getContentPane().add(add);
		
		nom_doctor = new JTextField();
		nom_doctor.setBounds(147, 398, 173, 20);
		Application5.getContentPane().add(nom_doctor);
		nom_doctor.setColumns(10);
		
		métier = new JTextField();
		métier.setColumns(10);
		métier.setBounds(147, 432, 173, 20);
		Application5.getContentPane().add(métier);
		
		JLabel nom = new JLabel("Name doctor");
		nom.setForeground(new Color(128, 128, 128));
		nom.setFont(new Font("Tahoma", Font.BOLD, 14));
		nom.setBounds(39, 401, 98, 14);
		Application5.getContentPane().add(nom);
		
		JLabel profession = new JLabel("Profession");
		profession.setForeground(new Color(128, 128, 128));
		profession.setFont(new Font("Tahoma", Font.BOLD, 14));
		profession.setBounds(39, 435, 98, 17);
		Application5.getContentPane().add(profession);
	}
}
