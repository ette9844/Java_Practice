package generic.inheritance;

public class ProductEx {

	public static void main(String[] args) {

		ChildProduct<String, String, String> cp = new ChildProduct<>();
		
		cp.setKind("Tv");
		cp.setModel("SmartTv");
		cp.setCompany("LG");
	}

}
