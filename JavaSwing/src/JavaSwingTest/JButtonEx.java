package JavaSwingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JButtonEx {

	public static void main(String[] args) {
		
		// ������(â) �̸� -> JFrame("String")�� String
		JFrame frame = new JFrame("My first Swing GUI");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel idLabel = new JLabel("ID : ");
		JTextField textField = new JTextField(10);	// ������ ����
		JButton button = new JButton("Press");
		
		// ��ư ������ ����
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �Է°� ��/�ַܼ� ���
				String str = textField.getText();
				idLabel.setText("ID : " + str);
				System.out.println(str);
			}
		});
		
		// �г�(Partition)�� ���̱�
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(idLabel);
		
		// ������(â)�� �г� ���̱�
		frame.setContentPane(panel);
		
		// X ��ư ���� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// â ũ�� ����
		frame.setSize(400, 400);
		// GUI â ����
		frame.setVisible(true);

	}

}
