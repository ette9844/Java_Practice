package variable;

public class Variable {
	public static void main(String[] args) {
		// ����
		byte by = 1;	// 1 byte = 8 bit = 256
		short sh = 2;	// 2 byte
		int in = 4;		// 4 byte *
		long lo = 8;	// 8 byte
		
		// �Ǽ�
		float fl = 4;	// 4 byte
		double db = 8.8;	// 8 byte *
		
		by += 2;
		in = in + 2;
		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lo);
		
		db = db + 0.2;
		System.out.println(fl);
		System.out.println(db);
	
		// ����
		char ch = 'a';		// 2 byte
		System.out.println(ch);
		
		// ����
		boolean bl = true;	// 1 byte
		System.out.println(bl);
		
		// overflow
		byte by1 = 127;
		byte by2 = 127;
		by1 = (byte) (by1 + by2);
		System.out.println(by1);	// ���� byte ������ �Ѿ -> ����
		
		System.out.println(Integer.MAX_VALUE);	// int 	�ִ밪
		System.out.println(Byte.MIN_VALUE);		// byte �ּҰ�
	}
}
