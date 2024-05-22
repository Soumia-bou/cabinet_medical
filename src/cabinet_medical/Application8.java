package cabinet_medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application8 {

	private JFrame frame;
	private JTable table;
	private JTextField Date_hour;
	private JTextField Fullname;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application8 window = new Application8();
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
	public Application8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 883, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 24, 548, 319);
		frame.getContentPane().add(scrollPane);
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();	
				
				Fullname.setText(model.getValueAt(i, 0).toString());
				Date_hour.setText(model.getValueAt(i, 1).toString());
				
				
				
			}
		});
		model= new DefaultTableModel();
		Object[] column ={"full name","Date/hour"};
		Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		
		JLabel NAME = new JLabel("full name");
		NAME.setForeground(Color.GRAY);
		NAME.setFont(new Font("Tahoma", Font.BOLD, 15));
		NAME.setBounds(600, 98, 78, 19);
		frame.getContentPane().add(NAME);
		
		JLabel date_h = new JLabel("date/hour");
		date_h.setForeground(Color.GRAY);
		date_h.setFont(new Font("Tahoma", Font.BOLD, 15));
		date_h.setBounds(600, 152, 78, 19);
		frame.getContentPane().add(date_h);
		
		Date_hour = new JTextField();
		Date_hour.setColumns(10);
		Date_hour.setBounds(688, 150, 156, 26);
		frame.getContentPane().add(Date_hour);
		
		Fullname = new JTextField();
		Fullname.setColumns(10);
		Fullname.setBounds(688, 96, 156, 26);
		frame.getContentPane().add(Fullname);
		
		JButton btnNewButton = new JButton("Start consultation");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(643, 228, 185, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeleteConsultation = new JButton("Delete consultation ");
		btnDeleteConsultation.setBackground(new Color(128, 0, 0));
		btnDeleteConsultation.setForeground(new Color(255, 255, 255));
		btnDeleteConsultation.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDeleteConsultation.setBounds(643, 303, 185, 40);
		frame.getContentPane().add(btnDeleteConsultation);
		
		JButton addition = new JButton("ADD");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fullname.getText().equals("") || Date_hour.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} 
				else 
				{
					row[0]=Fullname.getText();
					row[1]=Date_hour.getText();
					
					model.addRow(row);
					
					
					Fullname.setText(" ");
					Date_hour.setText(" ");
					
					JOptionPane.showMessageDialog(null, "Saved seccessfully");
					
				}
			}
		});
		addition.setForeground(new Color(248, 248, 255));
		addition.setFont(new Font("Tahoma", Font.BOLD, 15));
		addition.setBackground(new Color(139, 0, 139));
		addition.setBounds(72, 373, 89, 36);
		frame.getContentPane().add(addition);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fullname.setText(" ");
				Date_hour.setText(" ");
			}
		});
		btnClear.setForeground(new Color(245, 255, 250));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBackground(new Color(0, 0, 128));
		btnClear.setBounds(189, 373, 89, 36);
		frame.getContentPane().add(btnClear);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(Fullname.getText(), i, 0);
				model.setValueAt(Date_hour .getText(), i, 1);
				
				JOptionPane.showMessageDialog(null, "Updated seccessfully");
				} 
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first");
				}
			}
		});
		btnUpdate.setForeground(new Color(245, 255, 250));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBackground(new Color(47, 79, 79));
		btnUpdate.setBounds(384, 373, 89, 36);
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
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBackground(new Color(139, 0, 0));
		btnDelete.setBounds(498, 373, 89, 36);
		frame.getContentPane().add(btnDelete);
	}

}
