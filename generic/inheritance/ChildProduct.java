package generic.inheritance;

// product가 가지고 있는 타입은 모두 포함시켜야 한다 <T, C> -> error
public class ChildProduct<T, M, C> extends Product<T, M> {

	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
