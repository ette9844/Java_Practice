package dataStructure;

// Stack = LIFO
public class StackAns {

	public static void main(String[] args) {
		StackA stack = new StackA() {
			char[] charArr = new char[5];
			int pointer = 0;

			@Override
			public boolean push(Object ob) {
				if (pointer < 5) {
					charArr[pointer++] = (char) ob;
				} else {
					System.out.println("배열에 값을 넣을 수 없습니다.");
					return false;
				}
				return true;
			}

			@Override
			public Object pop() {
				if (pointer != 0) {
					char result = charArr[--pointer];
					charArr[pointer] = ' ';
					return result;
				} else {
					System.out.println("배열에 값이 없습니다.");
				}
				return ' ';
			}

			@Override
			public int length() {
				return pointer;
			}

			@Override
			public Object peek() {
				if (pointer != 0) {
					char result = charArr[--pointer];
					pointer++;
					return result;
				} else {
					System.out.println("배열에 값이 없습니다.");
				}
				return ' ';
			}

		};
		
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.length());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.length());

	}

}

interface StackA {
	public abstract int length(); // 현재 저장되어있는 데이터의 개수

	public abstract Object pop(); // 추출

	public abstract boolean push(Object ob); // 삽입

	public abstract Object peek(); // 읽기
}
