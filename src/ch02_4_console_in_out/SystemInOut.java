package ch02_4_console_in_out;

public class SystemInOut {

	public static void main(String[] args) throws Exception {
//	[KeyCodeExample.java]
		
		int keyCode;
		
		try {
		//keyCode = System.in.read();
//						int�� ���ڰ� �´�
			System.out.printf("keyCode: %d\n", System.in.read());
			System.out.printf("keyCode: %d\n", System.in.read());
			System.out.printf("keyCode: %d\n", System.in.read());
			System.out.printf("keyCode: %d\n", System.in.read());
			System.out.printf("keyCode: %d\n", System.in.read());
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//System.out.printf("keyCode: %d\n") //try catch ���̿� �̷��� ���⵵System.out.printf("keyCode: %d\n", System.in.read())
	}

}
