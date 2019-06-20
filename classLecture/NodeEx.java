package classLecture;

// linked list class ex
class Node {

	static Node lastNode = null;

	int num;
	Node front;
	Node back;

	Node(int num) {
		this.num = num;
	}
	
	// 링크드 리스트에 append 하기
	static void append(Node node) {
		if (lastNode == null) {
			lastNode = node;
		} else {
			node.front = lastNode;
			lastNode.back = node;
			lastNode = node;
		}
	}
}

public class NodeEx {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		// 링크드 리스트로 만들기
		Node.append(node1);
		Node.append(node2);
		Node.append(node3);
		
		// nodetmp 리스트 사이에 끼워넣기 (수동)
		Node nodetmp = new Node(9);
		nodetmp.front = node2;
		nodetmp.back = node3;
		nodetmp.front.back = nodetmp;
		nodetmp.back.front = nodetmp;
		
		// nodetmp 삭제 (수동)
		nodetmp.front.back = nodetmp.back;
		nodetmp.back.front = nodetmp.front;
		nodetmp = null; 
		// 노드 삭제: 주소값에 null값 넣기  -> nodetmp에 접근할 방법이 없어짐 -> garbage collector -> 삭제
		
		// 링크드 리스트 출력
		Node tmp = node1;
		for(;tmp != null;) {
			System.out.print(tmp.num + " ");
			tmp = tmp.back;
		}
	}
}