package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examplephamacy.DaoUser;
import examplephamacy.ExistingMedicine;
import examplephamacy.Insurance;
import examplephamacy.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsuranceFrame extends JFrame {

	private JPanel contentPane;

	private User user;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public InsuranceFrame(User user) {
		this.user=user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(102, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCodeInsurance = new JLabel("code insurance");
		lblCodeInsurance.setBounds(10, 45, 82, 14);
		contentPane.add(lblCodeInsurance);
		
		JLabel lblNameInsurance = new JLabel("name insurance");
		lblNameInsurance.setBounds(223, 45, 94, 14);
		contentPane.add(lblNameInsurance);
		
		textField_1 = new JTextField();
		textField_1.setBounds(327, 42, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDrugName = new JLabel("drug name");
		lblDrugName.setBounds(10, 99, 82, 14);
		contentPane.add(lblDrugName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 96, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPerecentage = new JLabel("perecentage");
		lblPerecentage.setBounds(223, 96, 82, 14);
		contentPane.add(lblPerecentage);
		
		textField_3 = new JTextField();
		textField_3.setBounds(327, 96, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DaoUser daouser= new DaoUser();
				String code = textField.getText();
				int code1 = Integer.parseInt(code);
				String name = textField_1.getText();
				String nameDrug = textField_2.getText();
				String per = textField_3.getText();
				int percent = Integer.parseInt(per);
				ExistingMedicine drug = new ExistingMedicine ();
				drug.setName(nameDrug);
				Insurance insurance = new Insurance();
				insurance.setName(name);
				insurance.setId(code1);
				if(daouser.is_manager(user.getUsername(), user.getPassword())){
					daouser.InsertInsurancePrecent(drug, insurance, percent);
					JOptionPane.showInternalMessageDialog(contentPane, "insert succesfuly");
				}
				
			}
		});
		btnInsert.setBounds(196, 134, 89, 23);
		contentPane.add(btnInsert);
	}
}
