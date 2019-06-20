package homework8;

class GoodsStock {
	
	String goodsCode;
	int stockNum;
	
	GoodsStock(String code, int num) {
		goodsCode = code;
		stockNum = num;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) throws StockshortageException {
		if(stockNum < amount)
			throw new StockshortageException("재고가 부족합니다.");
		stockNum -= amount;
		return amount;
	}
}

// answer
class StockshortageException extends Exception {
	
	StockshortageException() {}
	StockshortageException(String message) {
		super(message);
	}
}


// testing
public class Exercise3 {

	public static void main(String[] args) {
		GoodsStock stuff = new GoodsStock("양말", 3);
		try {
			stuff.subtractStock(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
