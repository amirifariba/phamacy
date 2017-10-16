package view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examplephamacy.User;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baseFrame extends JFrame {

	private JPanel contentPane;
    private User user;
	public baseFrame(User user) {
		this.user=user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton medicinesPage = new JButton("Insurance");
		medicinesPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsuranceFrame InsuranceFrame = new InsuranceFrame(user);
				InsuranceFrame.setVisible(true);
				dispose();
				
			}
		});
		medicinesPage.setBounds(287, 46, 89, 23);
		contentPane.add(medicinesPage);
		
		JButton btnNewButton_1 = new JButton("Insurance");
		btnNewButton_1.setBounds(287, 136, 36, -23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MedicinesPage");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DrugFrame DrugFrame = new DrugFrame(user);
				DrugFrame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(287, 103, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Patient");
		btnNewButton_3.setBounds(287, 176, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
