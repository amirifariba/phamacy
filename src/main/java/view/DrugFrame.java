package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examplephamacy.DaoUser;
import examplephamacy.ExistingMedicine;
import examplephamacy.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrugFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
   private User user;
	
	
	public DrugFrame(User user) {
		this.user=user;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodeDrug = new JLabel("code Drug");
		lblCodeDrug.setBounds(10, 45, 81, 14);
		contentPane.add(lblCodeDrug);
		
		textField = new JTextField();
		textField.setBounds(78, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(206, 48, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(278, 42, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrice = new JLabel("price");
		lblPrice.setBounds(32, 103, 46, 14);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 100, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCount = new JLabel("count");
		lblCount.setBounds(219, 103, 46, 14);
		contentPane.add(lblCount);
		
		textField_3 = new JTextField();
		textField_3.setBounds(278, 111, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDate = new JLabel("date");
		lblDate.setBounds(32, 162, 46, 14);
		contentPane.add(lblDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(78, 156, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DaoUser user = new DaoUser();
				ExistingMedicine medicine =new ExistingMedicine(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText());
				user.addMedicine(medicine);
				JOptionPane.showInternalMessageDialog(contentPane, "insert succesfuly");
			}
		});
		btnAdd.setBounds(184, 193, 89, 23);
		contentPane.add(btnAdd);
	}

}
