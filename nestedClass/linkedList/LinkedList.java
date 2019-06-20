package nestedClass.linkedList;

public class LinkedList {

	int size;
	Node head;
	Node rear;

	void firstNode(int num) {
		Node firstNode = new Node(num);

		head = firstNode;
		rear = firstNode;

		size = 1;
	}

	// 끝에 Node 추가
	void addRearNode(int num) {
		if (size != 0) {
			Node newNode = new Node(num);

			rear.back = newNode;
			newNode.front = rear;
			rear = newNode;

			size++;

		} else
			firstNode(num);
	}

	// 앞단에 Node 추가
	void addHeadNode(int data) {
		if (size != 0) {
			Node newNode = new Node(data);

			head.front = newNode;
			newNode.back = head;
			head = newNode;

			size++;
		} else
			firstNode(data);
	}

	// 특정 위치(index) Node Data 읽기
	int readData(int index) { // 0 1 2...
		// index가 리스트 길이를 over할 때
		if (index >= size || index < 0)
			return -1;

		// 해당 index의 노드 찾기
		Node result = head;
		for (int i = 0; i < index; i++) {
			result = result.back;
		}
		return result.num;
	}

	// 특정 위치(index) Node 삭제
	boolean removeNode(int index) {
		// index가 리스트 길이를 over할 때, 리스트가 비엇을 때
		if (index >= size || index < 0 || size <= 0)
			return false;

		// 리스트에서 삭제
		if (index == 0) { // head 삭제
			if (size == 1) {
				removeAllNode();
			} else {
				head.back.front = null;
				head = head.back;
			}
		} else if (index == size - 1) { // rear 삭제
			rear.front.back = null;
			rear = rear.front;
		} else {
			// 해당 index의 노드 찾기
			Node result = head;
			for (int i = 0; i < index; i++) {
				result = result.back;
			}
			result.front.back = result.back;
			result.back.front = result.front;
		}
		size--;

		return true;
	}

	// 전체 노드의 data 출력
	void printData() {
		try {
			Node tmp = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tmp.num + " ");
				tmp = tmp.back;
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("printData() Exception 발생");
		}
	}

	// 전체 삭제 (정확한 삭제는 아님 -> 나머지는 garbage collector가 처리해줌)
	boolean removeAllNode() {
		head = null;
		rear = null;
		size = 0;
		return true;
	}

	// Node 중첩 클래스
	class Node {
		int num;
		Node front;
		Node back;

		Node(int num) {
			this.num = num;
		}
	}

	// 테스트
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.firstNode(1);
		link.addRearNode(2);
		link.addRearNode(3);
		link.addRearNode(4);
		link.addRearNode(5);
		link.printData();

		link.addHeadNode(0);
		link.addRearNode(6);
		link.printData();

		System.out.println(link.readData(3));
		System.out.println(link.readData(0));

		link.removeNode(4);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(4);
		link.printData();
		link.removeNode(7);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
		link.removeNode(0);
		link.printData();
	}
}
