package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application7 {

	 JFrame Application7;
	 JTable table;
	 JTable table_1;
	DefaultTableModel model;
	DefaultTableModel model1;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField Ndoc;
	 JTextField Pdoc;
	 JTextField Npatient;
	 JTextField Ntlpatient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application7 window = new Application7();
					window.Application7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Application7 = new JFrame();
		Application7.setBounds(100, 100, 890, 587);
		Application7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Application7.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 388, 294);
		Application7.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model= new DefaultTableModel();
		Object[] column ={"Name doctor","Profession"};
		Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		
		JLabel lblNewLabel = new JLabel("chose a doctor");
		lblNewLabel.setBounds(10, 28, 139, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		Application7.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(466, 68, 398, 294);
		Application7.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		model1= new DefaultTableModel();
		Object[] column1 ={"Name patient","numero de telephone"};
		Object[] row1 = new Object[2];
		model1.setColumnIdentifiers(column1);
		table_1.setModel(model1);
		scrollPane_1.setViewportView(table_1);
		
		
		JLabel lblChoseAPatient = new JLabel("chose a patient ");
		lblChoseAPatient.setBounds(466, 28, 139, 29);
		lblChoseAPatient.setFont(new Font("Tahoma", Font.BOLD, 14));
		Application7.getContentPane().add(lblChoseAPatient);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Ndoc.getText().equals("") || Pdoc.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} 
				else 
				{
				row[0]=Ndoc.getText();
				row[1]=Pdoc.getText();
				model.addRow(row);
				Ndoc.setText(" ");
				Pdoc.setText(" ");
			}
			}
		});
		add.setBounds(10, 393, 89, 23);
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setBackground(new Color(128, 0, 64));
		Application7.getContentPane().add(add);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ndoc.setText(" ");
				Pdoc.setText(" ");
			}
		});
		clear.setForeground(Color.WHITE);
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setBackground(new Color(0, 64, 0));
		clear.setBounds(10, 425, 89, 23);
		Application7.getContentPane().add(clear);
		
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
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete.setBackground(new Color(64, 0, 128));
		delete.setBounds(122, 393, 89, 23);
		Application7.getContentPane().add(delete);
		
		JButton update = new JButton("Update ");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(Ndoc.getText(), i, 0);
				model.setValueAt(Pdoc.getText(), i, 1);
				JOptionPane.showMessageDialog(null, "Updated seccessfully");
				} 
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		update.setForeground(Color.WHITE);
		update.setFont(new Font("Tahoma", Font.BOLD, 14));
		update.setBackground(new Color(128, 0, 0));
		update.setBounds(122, 427, 89, 23);
		Application7.getContentPane().add(update);
		
		textField = new JTextField();
		textField.setBounds(230, 425, 168, 23);
		Application7.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("doctor choisi :");
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(230, 397, 103, 14);
		Application7.getContentPane().add(lblNewLabel_1);
		
		JButton add_1 = new JButton("ADD");
		add_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Npatient.getText().equals("") || Ntlpatient.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} 
				else 
				{
				row[0]=Npatient.getText();
				row[1]=Ntlpatient.getText();
				model1.addRow(row);
				Npatient.setText(" ");
				Ntlpatient.setText(" ");
			}
			}
		});
		add_1.setForeground(Color.WHITE);
		add_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		add_1.setBackground(new Color(128, 0, 64));
		add_1.setBounds(466, 393, 89, 23);
		Application7.getContentPane().add(add_1);
		
		JButton clear_1 = new JButton("Clear");
		clear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Npatient.setText(" ");
				Ntlpatient.setText(" ");
			}
		});
		clear_1.setForeground(Color.WHITE);
		clear_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear_1.setBackground(new Color(0, 64, 0));
		clear_1.setBounds(466, 425, 89, 23);
		Application7.getContentPane().add(clear_1);
		
		JButton delete_1 = new JButton("Delete ");
		delete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				if(i>=0) {
				model1.removeRow(i);
				JOptionPane.showMessageDialog(null, "Deleted seccessfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		delete_1.setForeground(Color.WHITE);
		delete_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete_1.setBackground(new Color(64, 0, 128));
		delete_1.setBounds(580, 393, 89, 23);
		Application7.getContentPane().add(delete_1);
		
		JButton update_1 = new JButton("Update ");
		update_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				if(i>=0) {
				model1.setValueAt(Npatient.getText(), i, 0);
				model1.setValueAt(Ntlpatient.getText(), i, 1);
				JOptionPane.showMessageDialog(null, "Updated seccessfully");
				} 
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		update_1.setForeground(Color.WHITE);
		update_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		update_1.setBackground(new Color(128, 0, 0));
		update_1.setBounds(580, 427, 89, 23);
		Application7.getContentPane().add(update_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(696, 427, 168, 23);
		Application7.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("patient choisi :");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(696, 399, 103, 14);
		Application7.getContentPane().add(lblNewLabel_1_1);
		
		Ndoc = new JTextField();
		Ndoc.setColumns(10);
		Ndoc.setBounds(143, 483, 173, 20);
		Application7.getContentPane().add(Ndoc);
		
		Pdoc = new JTextField();
		Pdoc.setColumns(10);
		Pdoc.setBounds(143, 514, 173, 20);
		Application7.getContentPane().add(Pdoc);
		
		Npatient = new JTextField();
		Npatient.setColumns(10);
		Npatient.setBounds(615, 483, 173, 20);
		Application7.getContentPane().add(Npatient);
		
		Ntlpatient = new JTextField();
		Ntlpatient.setColumns(10);
		Ntlpatient.setBounds(615, 517, 173, 20);
		Application7.getContentPane().add(Ntlpatient);
		
		JLabel nom = new JLabel("Name doctor");
		nom.setForeground(Color.GRAY);
		nom.setFont(new Font("Tahoma", Font.BOLD, 14));
		nom.setBounds(20, 484, 98, 14);
		Application7.getContentPane().add(nom);
		
		JLabel profession = new JLabel("Profession");
		profession.setForeground(Color.GRAY);
		profession.setFont(new Font("Tahoma", Font.BOLD, 14));
		profession.setBounds(20, 517, 98, 17);
		Application7.getContentPane().add(profession);
		
		JLabel profession_1 = new JLabel("Name patient");
		profession_1.setForeground(Color.GRAY);
		profession_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		profession_1.setBounds(466, 486, 111, 17);
		Application7.getContentPane().add(profession_1);
		
		JLabel lblNumeroTelephone = new JLabel("numero telephone ");
		lblNumeroTelephone.setForeground(Color.GRAY);
		lblNumeroTelephone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumeroTelephone.setBounds(466, 517, 139, 17);
		Application7.getContentPane().add(lblNumeroTelephone);
	}
}
