package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import examplephamacy.DaoUser;
import examplephamacy.User;

import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;

public class loginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrame frame = new loginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(95, 96, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(95, 168, 130, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(271, 94, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		 JPasswordField passF = new JPasswordField();
		passF.setBounds(271, 167, 137, 20);
		contentPane.add(passF);
		passF.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DaoUser daouser = new DaoUser();
				User user = new User();
				user.setPassword(String.valueOf(passF.getPassword()));
				user.setUsername(textField.getText());
				if(daouser.ExitUser(user)){
					JOptionPane.showInternalMessageDialog(contentPane, "hello " + textField.getText());
					baseFrame pf = new baseFrame(user);
					pf.setVisible(true);
					dispose();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(198, 283, 89, 23);
		contentPane.add(btnNewButton);
	}
}
