package JavaSwingTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IDPW {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDPW window = new IDPW();
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
	public IDPW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblResult = new JLabel("result:");
		lblResult.setBounds(35, 48, 77, 25);
		frame.getContentPane().add(lblResult);
		
		JLabel result = new JLabel("0");
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setBounds(124, 48, 277, 25);
		frame.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("1");
			}
		});
		btnNewButton.setBounds(35, 118, 77, 77);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBounds(124, 118, 77, 77);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(213, 118, 77, 77);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(35, 205, 77, 77);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(124, 205, 77, 77);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(213, 205, 77, 77);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(35, 292, 77, 77);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(124, 292, 77, 77);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(213, 292, 77, 77);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBounds(124, 379, 77, 77);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("=");
		button_9.setBounds(213, 379, 77, 77);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.setBounds(324, 118, 77, 77);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(324, 205, 77, 77);
		frame.getContentPane().add(button_11);

	}
}
