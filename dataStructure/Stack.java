package dataStructure;

public interface Stack {
	
	public abstract int length(); // 현재 저장되어있는 데이터의 개수

	public abstract Object pop(); // 추출

	public abstract boolean push(Object ob); // 삽입

	public abstract Object peek(); // 읽기
}

class CharStack implements Stack {

	// 5칸 짜리 char 타입 array
	private char charStack[] = { ' ', ' ', ' ', ' ', ' ' };

	@Override
	public int length() { // 현재 저장되어있는 데이터의 개수
		int i;
		for (i = 0; i < charStack.length; i++) {
			if (charStack[i] == ' ')
				break;
		}
		return i;
	}

	@Override
	public Object pop() { // 추출

		int i = this.length();
		
		// 스택이 비어있다면 false 리턴
		if (i == 0)
			return false;
		else { // 스택이 비어있지 않다면
			// 스택의 마지막 값 저장
			char tmp = charStack[i - 1];
			// stack 비우기
			charStack[i - 1] = ' ';
			// 비운 값 출력
			return tmp;
		}
	}

	@Override
	public boolean push(Object ob) { // 삽입

		// 스택이 꽉 차지 않았다면 마지막에 추가
		if (this.length() != 5) {
			charStack[this.length()] = (char) ob;
			return true;
		}
		// 스택이 꽉 찼을 경우에는 false 리턴
		return false;
	}

	@Override
	public Object peek() { // 읽기

		// 스택이 비어있다면 false 리턴
		if (this.length() == 0) {
			return false;
		} else // 비어있지 않다면 마지막 값 리턴
			return charStack[this.length() - 1];
	}

}