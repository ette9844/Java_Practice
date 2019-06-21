package generic;

// multi type
public class Product<T, M> {
	// 관례: <> 안의 클래스는 한글자 대문자로 적는 것이 관례
	private T kind;
	private M model;
	
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}
