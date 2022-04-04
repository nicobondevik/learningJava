package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.ComplimentMachine;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;

public class ComplimentFrame extends JFrame {

	private JPanel contentPane;
	private ComplimentMachine machine = new ComplimentMachine("ComplimentMachine/src/kompliment.csv");
	private JLabel lblCompliment;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplimentFrame frame = new ComplimentFrame();
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
	public ComplimentFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 133);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton = new JButton("Nytt kompliment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleCompliment();
			}
		});
		
		lblCompliment = new JLabel("");
		lblCompliment.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblCompliment.setBackground(Color.WHITE);
		lblCompliment.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblCompliment = new GridBagConstraints();
		gbc_lblCompliment.weighty = 1.0;
		gbc_lblCompliment.weightx = 1.0;
		gbc_lblCompliment.fill = GridBagConstraints.BOTH;
		gbc_lblCompliment.insets = new Insets(0, 0, 5, 0);
		gbc_lblCompliment.gridx = 0;
		gbc_lblCompliment.gridy = 0;
		contentPane.add(lblCompliment, gbc_lblCompliment);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

	protected void handleCompliment() {
		String compliment = machine.getCompliment();
		lblCompliment.setText(compliment);
	}
}
