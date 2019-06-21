package generic;

public class ProductEx {
	public static void main(String[] args) {
		
		Product<String, Integer> p = new Product<>();
		p.setKind("TV");
		p.setModel(12083);
		
		String kind = p.getKind();
		int model = p.getModel();
		
		System.out.println(kind + " " + model);
	}
}
