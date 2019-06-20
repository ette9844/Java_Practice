package dataStructure;

// Queue = FIFO
// 칭찬받음쓰
public class QueueEx {

	public static void main(String[] args) {
		Queue queue = new Queue() {

			char charArr[] = { ' ', ' ', ' ', ' ', ' ' };
			int first = 0;
			int last = 0;

			@Override
			public int size() {
				int cnt = 0;
				for (int i = 0; i < 5; i++) {
					if (charArr[i] != ' ')
						cnt++;
				}
				return cnt;
			}

			@Override
			public Object peek() {
				if (this.empty()) {
					System.out.println("배열이 비었습니다");
					return false;
				}
				System.out.println("읽기: " + charArr[first]);
				return charArr[first];
			}

			@Override
			public Object pop() {
				char result = ' ';

				if (this.empty()) {
					System.out.println("배열이 비었습니다");
					first = 0;
					last = 0;
					return false;
				}

				int tmp = first;
				result = charArr[first++];
				if (first >= 5) {
					first %= 5;
				}
				charArr[tmp] = ' ';
				System.out.println("출력: " + result);
				return result;
			}

			@Override
			public boolean push(Object ob) {
				if (this.size() == 5) {
					System.out.println("배열이 가득 찼습니다");
					return false;
				} else if (last >= 5) {
					last %= 5;
				}

				charArr[last++] = (char) ob;
				System.out.println("입력: " + charArr[last - 1]);
				return true;
			}

			@Override
			public boolean empty() {
				if (this.size() == 0)
					return true;
				return false;
			}
		};

		queue.push('A');
		queue.push('B');
		queue.push('C');
		queue.push('D');
		queue.push('E');
		queue.push('F');
		queue.pop();
		System.out.println(queue.size());
		queue.pop();
		System.out.println(queue.size());
		queue.pop();
		System.out.println(queue.size());

		queue.push('H');
		queue.push('I');
		queue.push('G');
		queue.push('M');
		queue.pop();
		queue.peek();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.push('A');

	}

}

interface Queue {
	public abstract int size(); // 원소 개수

	public abstract Object peek(); // 읽기

	public abstract Object pop(); // 읽고 삭제

	public abstract boolean push(Object ob); // 삽입

	public abstract boolean empty(); // 확인
}
