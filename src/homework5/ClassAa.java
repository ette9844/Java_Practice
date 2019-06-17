package homework5;

class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (num == 3 || num == 6 || num == 9) || (i + 1) / 10 == 3;
			cards[i] = new SutdaCard(i + 1, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info() 대신 Object클래스의 toStrin()을 오버라이딩
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class ClassAa {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length - 1; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.print(deck.cards[deck.cards.length - 1]);
	}

}
