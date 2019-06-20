package interfaces;

// p387 4��
public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {

		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}

interface DataAccessObject {
	
	public abstract void select();
	public abstract void insert();
	public abstract void update();
	public abstract void delete();
}

class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}

}

class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}

}