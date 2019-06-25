package collectionFramework.exercise;

import java.util.ArrayList;
import java.util.List;

// p775 7��
public class ListExample {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		// boardList ���� ���
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

}

class BoardDao {
	
	private List<Board> boardList;
	
	// ArrayList ��ü ����, �� �ʱ�ȭ
	BoardDao() {
		boardList = new ArrayList<>();
		boardList.add(new Board("����1", "����1"));
		boardList.add(new Board("����2", "����2"));
		boardList.add(new Board("����3", "����3"));
	}

	public List<Board> getBoardList() {
		return boardList;
	}
	
}