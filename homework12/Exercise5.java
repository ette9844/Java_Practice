package homework12;

import java.util.*;

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard) obj;
			return num == c.num && isKwang == c.isKwang;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		SutdaCard c3 = new SutdaCard(1, true);

		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);

		System.out.println(set);
	}

}
