package ch02_1_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =15;
		if(v1>10 ) { //중괄호 안에서 입력된 변수는 같은 괄호 내에서만 적용된다
			int v2;
			v2 =v1 -10;
		int v3 = v1 + v2 + 5;
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);}
	}
//	for 반복문
//	switch 

}
class A{
	void method() {
		if(true) {
			
		}
	}
}
