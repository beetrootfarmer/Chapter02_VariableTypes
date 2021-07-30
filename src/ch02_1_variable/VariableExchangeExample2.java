package ch02_1_variable;

public class VariableExchangeExample2 {
	public static void main(String[] args) {
//		[변수에 할당된 값 스와핑]
		int x = 100;
		int y = 200;
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값:" + y);
		
		x=y;
		System.out.println("x=y, x의 값: " + x);
		System.out.println("x=y, y의 값:" + y);
//		여기까지 x의 값이 200이 되었기 때문에 
		y = x;
//		y값이 100이 되지 않음
		
	}

}
