package ch02_4_console_in_out;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		
			
		boolean working = true;
		int keyCode;
		
			while(working) {
				try {
					
				keyCode = System.in.read();
			
				System.out.printf("keyCode: %d\n ", keyCode);
				if(keyCode == 'q' /*(���Ϳ���??) keyCode == 'Q'*/) { //q�ΰ�?)
						working = false;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
	System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");		}
	
			


	}
	}


