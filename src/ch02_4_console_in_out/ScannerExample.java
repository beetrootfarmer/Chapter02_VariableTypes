package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
//		Scanner scn = new Scanner(System.in); // �� ó���� Scanner���� ���ϸ� class�� �� ������ java.until.Scanner��� ���������
//		String str = ""; //������ �� �ʱ�ȭ!
//
//		while(true) {
//			
//			str = scn.nextLine();
//			System.out.printf("�Է��Ͻ� ���ڿ��� \"%s\"�Դϴ�.\n", str );//����Ű �߰� preference�� template���� �߰�
//			if(str.equalsIgnoreCase("q")) {
//				break;
//		}
//		}
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
//		scn.close();

		Scanner scn = new Scanner(System.in); // �� ó���� Scanner���� ���ϸ� class�� �� ������ java.until.Scanner��� ���������
		String str = ""; //������ �� �ʱ�ȭ!

		while(true) {
			System.out.println("��___________��" );
			System.out.println("     �� ��         " );
			System.out.println("��___________��\n" );
			
			str = scn.nextLine();
			if(str.equals("1")) //������� �Է°��� �а� �����ϰ� �ϴ� �κ�!!
//				.... �Է°��� () �϶� ������ ����� ��������. while������ ����� �� ����
				
				
			 System.out.printf("���� ������ \"%s\"�ᱹ���Դϴ�.\n", str );//����Ű �߰� preference�� template���� �߰�
			
			if(str.equals("2"))
				System.out.printf("���� ������ \"%s\"�������Դϴ�.\n", str );
			if(str.equalsIgnoreCase("q")) {
				break;
		}
		}
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		scn.close();
}
}
