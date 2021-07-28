package ch02_4_console_in_out;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) {
	int keyCode;
	
	while(true) {
		try {
			System.out.printf("keyCode: %d\n", System.in.read());
		
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	}
}
	


