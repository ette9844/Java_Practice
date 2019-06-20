package nestedClass.nestedInterface;

public class Button {
	
	OnClickListener listener;
	
	// 무슨 버튼 이냐에 따라 다르게 동작
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 버튼을 눌렀을 때만 이벤트가 터지게 하고 싶으니까 중첩 인터페이스로
	interface OnClickListener {
		void onClick();
	}
}
