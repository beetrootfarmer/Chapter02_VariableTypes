package ch02_primitive;

public class CharExample {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		char c1 = 'A'; 
		char c2 = 65; 
		char c3 = '\u0041';
//		인코딩 : character를 숫자기호로 ~ A->65
//		디코딩 : 숫자기호를 character로 ~ 65->A
//		\ u 뒤에오는 것은 16진수 
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
				
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		
	

	}

}
