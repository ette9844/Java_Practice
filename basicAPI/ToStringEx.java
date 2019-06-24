package basicAPI;

public class ToStringEx {

	public static void main(String[] args) {
		Object obj = new Print();
		System.out.println(obj.hashCode());
		System.out.println(Integer.toHexString(obj.hashCode()));
		System.out.println(obj.toString());
	}

}

class Print {
	int num = 10;
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
}
