package ch02_primitive;

public class CharExample {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		char c1 = 'A'; 
		char c2 = 65; 
		char c3 = '\u0041';
//		���ڵ� : character�� ���ڱ�ȣ�� ~ A->65
//		���ڵ� : ���ڱ�ȣ�� character�� ~ 65->A
//		\ u �ڿ����� ���� 16���� 
		
		char c4 = '��';
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
