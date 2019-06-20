package nestedClass.nestedInterface;

public class ButtonEx {

	public static void main(String[] args) {
		
		Button btn = new Button();
	
		// 전화 거는 버튼으로 지정
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		// 메세지 보내는 버튼으로 지정
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
