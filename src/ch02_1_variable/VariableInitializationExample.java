package ch02_1_variable;

public class VariableInitializationExample/*단어마다 Camel표기법 낙타등처럼 오르락내리락*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 value 선언
		int /*int는 자료형,4바이트를 차지하는 메모리에 들어가는 것의 이름이 다음에 오는(라벨링) */ 
			value/*변수 이름은 소문자로*/ = 3;
		//변수 value값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
//		int a = 0 , b = 0 , c = 0;  한줄로 합쳐서도 가능
}
	}
