package JavaSwingTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lotto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lotto window = new Lotto();
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
	public Lotto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("num1");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("DialogInput", Font.BOLD, 30));
		label1.setBounds(53, 59, 84, 89);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("num2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("DialogInput", Font.BOLD, 30));
		label2.setBounds(168, 59, 97, 89);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("num3");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("DialogInput", Font.BOLD, 30));
		label3.setBounds(291, 59, 84, 89);
		frame.getContentPane().add(label3);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] arr = new int[3];
				for(int i=0; i<arr.length; i++) {
					arr[i] = (int) (Math.random()*45 + 1);
				}
				
				label1.setText(Integer.toString(arr[0]));
				label2.setText(Integer.toString(arr[1]));
				label3.setText(Integer.toString(arr[2]));
			}
		});
		btnNewButton.setBounds(53, 172, 322, 44);
		frame.getContentPane().add(btnNewButton);
	}

}
