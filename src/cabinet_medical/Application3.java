package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Application3 {

	private JFrame frame;
	private JTextField name;
	private JTextField dateh;
	private JTextField doctor;
	private JTextField setting;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application3 window = new Application3();
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
	public Application3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel NAME = new JLabel("full name");
		NAME.setForeground(new Color(128, 128, 128));
		NAME.setFont(new Font("Tahoma", Font.BOLD, 15));
		NAME.setBounds(10, 317, 78, 19);
		frame.getContentPane().add(NAME);
		
		JLabel date_h = new JLabel("date/hour");
		date_h.setForeground(new Color(128, 128, 128));
		date_h.setFont(new Font("Tahoma", Font.BOLD, 15));
		date_h.setBounds(10, 356, 78, 19);
		frame.getContentPane().add(date_h);
		
		JLabel medCH = new JLabel("doctor ");
		medCH.setForeground(new Color(128, 128, 128));
		medCH.setFont(new Font("Tahoma", Font.BOLD, 15));
		medCH.setBounds(10, 395, 78, 19);
		frame.getContentPane().add(medCH);
		
		JLabel lSettings = new JLabel("settings");
		lSettings.setForeground(new Color(128, 128, 128));
		lSettings.setFont(new Font("Tahoma", Font.BOLD, 15));
		lSettings.setBounds(10, 431, 78, 19);
		frame.getContentPane().add(lSettings);
		
		name = new JTextField();
		name.setBounds(98, 315, 156, 26);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		dateh = new JTextField();
		dateh.setColumns(10);
		dateh.setBounds(98, 357, 156, 27);
		frame.getContentPane().add(dateh);
		
		doctor = new JTextField();
		doctor.setColumns(10);
		doctor.setBounds(98, 396, 156, 25);
		frame.getContentPane().add(doctor);
		
		setting = new JTextField();
		setting.setColumns(10);
		setting.setBounds(98, 432, 156, 26);
		frame.getContentPane().add(setting);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 752, 267);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();	
				
				name.setText(model.getValueAt(i, 0).toString());
				dateh.setText(model.getValueAt(i, 1).toString());
				doctor.setText(model.getValueAt(i, 2).toString());
				setting.setText(model.getValueAt(i, 3).toString());
				
				
			}
		});
		model= new DefaultTableModel();
		Object[] column ={"full name","Date/hour","doctor","settings"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton addition = new JButton("ADD");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals("") || dateh.getText().equals("") || doctor.getText().equals("") || setting.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} 
				else 
				{
					row[0]=name.getText();
					row[1]=dateh.getText();
					row[2]=doctor.getText();
					row[3]=setting.getText();
					model.addRow(row);
					
					
					name.setText(" ");
					dateh.setText(" ");
					doctor.setText(" ");
					setting.setText(" ");
					JOptionPane.showMessageDialog(null, "Saved seccessfully");
					
				}
				
				
			}
		});
		addition.setForeground(new Color(248, 248, 255));
		addition.setBackground(new Color(139, 0, 139));
		addition.setFont(new Font("Tahoma", Font.BOLD, 15));
		addition.setBounds(297, 425, 89, 36);
		frame.getContentPane().add(addition);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(" ");
				dateh.setText(" ");
				doctor.setText(" ");
				setting.setText(" ");
				
			}
		});
		btnClear.setForeground(new Color(245, 255, 250));
		btnClear.setBackground(new Color(0, 0, 128));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(407, 425, 89, 36);
		frame.getContentPane().add(btnClear);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(name.getText(), i, 0);
				model.setValueAt(dateh.getText(), i, 1);
				model.setValueAt(doctor.getText(), i, 2);
				model.setValueAt(setting.getText(), i, 3);
				JOptionPane.showMessageDialog(null, "Updated seccessfully");
				} 
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		btnUpdate.setForeground(new Color(245, 255, 250));
		btnUpdate.setBackground(new Color(47, 79, 79));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(570, 425, 89, 36);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete ");
		btnDelete.addActionListener(new ActionListener() {
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
		btnDelete.setForeground(new Color(248, 248, 255));
		btnDelete.setBackground(new Color(139, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(675, 425, 89, 36);
		frame.getContentPane().add(btnDelete);
	}
}
