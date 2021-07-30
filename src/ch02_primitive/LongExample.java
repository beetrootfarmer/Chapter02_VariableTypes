package ch02_primitive;

public class LongExample {
	public static void main(String[] args) {
		/*
		 * 기본적으로 자바 컴파일러는 정수 리터럴을 int 형으로 간주한다
		 * long타입임을 명시적으로 컴파일러에게 알려줘야 한다
		 */
		
		
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;
		long var4 = 1000000000000L; //L표시 : "8byte로 세팅해" 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	
}
}
