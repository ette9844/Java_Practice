package JavaSwingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JButtonEx {

	public static void main(String[] args) {
		
		// 프레임(창) 이름 -> JFrame("String")의 String
		JFrame frame = new JFrame("My first Swing GUI");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel idLabel = new JLabel("ID : ");
		JTextField textField = new JTextField(10);	// 사이즈 지정
		JButton button = new JButton("Press");
		
		// 버튼 리스너 지정
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력값 라벨/콘솔로 출력
				String str = textField.getText();
				idLabel.setText("ID : " + str);
				System.out.println(str);
			}
		});
		
		// 패널(Partition)에 붙이기
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(idLabel);
		
		// 프레임(창)에 패널 붙이기
		frame.setContentPane(panel);
		
		// X 버튼 동작 지정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 크기 지정
		frame.setSize(400, 400);
		// GUI 창 생성
		frame.setVisible(true);

	}

}
