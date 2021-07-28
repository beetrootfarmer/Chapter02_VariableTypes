package ch02_4_console_in_out;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		
			
		boolean working = true;
		int keyCode;
		
			while(working) {
				try {
					
				keyCode = System.in.read();
			
				System.out.printf("keyCode: %d\n ", keyCode);
				if(keyCode == 'q' /*(오와연산??) keyCode == 'Q'*/) { //q인가?)
						working = false;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
	System.out.println("프로그램이 정상적으로 종료되었습니다.");		}
	
			


	}
	}


