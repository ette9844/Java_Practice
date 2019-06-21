package generic;

// multi type
public class Product<T, M> {
	// ����: <> ���� Ŭ������ �ѱ��� �빮�ڷ� ���� ���� ����
	private T kind;
	private M model;
	
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}
