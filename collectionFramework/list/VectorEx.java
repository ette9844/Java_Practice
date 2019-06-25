package collectionFramework.list;

import java.util.*;

// ArrayList과 동일하나, 동기화된 메소드로 구성 / 멀티 스레드 환경에서 좋음 / 속도는 ArrayList보다 딸림
public class VectorEx {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>(); 
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		List<Board> linked = new LinkedList<>();
		linked.add(new Board("제목1", "내용1", "글쓴이1"));
		linked.add(new Board("제목2", "내용2", "글쓴이2"));
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}

class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}