package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		[������ �Ҵ�� �� ������]
		int x = 100;
		int y = 200;
		int temp;
		
		temp = x; //100
		
		x=y; //200
		System.out.println("x=y, x�� ��: " + x);
		System.out.println("x=y, y�� ��:" + y);

		y = temp; //x:200 temp:100
		System.out.println("y=x, x�� ��: " + x);
		System.out.println("y=x, y�� ��:" + y);
		
		System.out.println("x="+x+", y="+y);
	}

}
