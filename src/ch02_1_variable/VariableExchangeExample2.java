package ch02_1_variable;

public class VariableExchangeExample2 {
	public static void main(String[] args) {
//		[������ �Ҵ�� �� ������]
		int x = 100;
		int y = 200;
		
		System.out.println("x�� ��: " + x);
		System.out.println("y�� ��:" + y);
		
		x=y;
		System.out.println("x=y, x�� ��: " + x);
		System.out.println("x=y, y�� ��:" + y);
//		������� x�� ���� 200�� �Ǿ��� ������ 
		y = x;
//		y���� 100�� ���� ����
		
	}

}
