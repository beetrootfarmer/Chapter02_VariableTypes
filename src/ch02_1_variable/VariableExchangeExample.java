package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		[변수에 할당된 값 스와핑]
		int x = 100;
		int y = 200;
		int temp;
		
		temp = x; //100
		
		x=y; //200
		System.out.println("x=y, x의 값: " + x);
		System.out.println("x=y, y의 값:" + y);

		y = temp; //x:200 temp:100
		System.out.println("y=x, x의 값: " + x);
		System.out.println("y=x, y의 값:" + y);
		
		System.out.println("x="+x+", y="+y);
	}

}
