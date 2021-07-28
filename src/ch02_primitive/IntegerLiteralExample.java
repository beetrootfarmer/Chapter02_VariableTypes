package ch02_primitive;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;

		
//		System.out.println("var1: " + var1);
//		System.out.println("var2: " + var2);
//		System.out.println("var3: " + var3);
//		System.out.println("var4: " + var4);
		
		int m = 0b1011;
		System.out.println("2진수: " + m);
		int hour = 031;
			System.out.println("8진수: " + hour);
			int minute = 00000000000000000000000000000011;
			System.out.println("8진수: " + minute);
		int n  = 0xB3;
		System.out.println("16진수: " + n);
		int s = 0x0F;
		System.out.println("16진수: " + s);
	}

}
