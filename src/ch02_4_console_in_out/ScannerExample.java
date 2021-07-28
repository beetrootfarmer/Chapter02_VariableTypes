package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
//		Scanner scn = new Scanner(System.in); // 맨 처음에 Scanner선언 안하면 class명 쓸 때마다 java.until.Scanner라고 적어줘야함
//		String str = ""; //시작할 때 초기화!
//
//		while(true) {
//			
//			str = scn.nextLine();
//			System.out.printf("입력하신 문자열은 \"%s\"입니다.\n", str );//단축키 추가 preference에 template에서 추가
//			if(str.equalsIgnoreCase("q")) {
//				break;
//		}
//		}
//		System.out.println("프로그램이 정상적으로 종료되었습니다.");
//		scn.close();

		Scanner scn = new Scanner(System.in); // 맨 처음에 Scanner선언 안하면 class명 쓸 때마다 java.until.Scanner라고 적어줘야함
		String str = ""; //시작할 때 초기화!

		while(true) {
			System.out.println("│___________│" );
			System.out.println("     메 뉴         " );
			System.out.println("│___________│\n" );
			
			str = scn.nextLine();
			if(str.equals("1")) //사용자의 입력값을 읽고 동작하게 하는 부분!!
//				.... 입력값이 () 일때 정해진 결과가 나오도록. while구조를 사용할 수 있음
				
				
			 System.out.printf("오늘 점심은 \"%s\"콩국수입니다.\n", str );//단축키 추가 preference에 template에서 추가
			
			if(str.equals("2"))
				System.out.printf("오늘 점심은 \"%s\"샐러드입니다.\n", str );
			if(str.equalsIgnoreCase("q")) {
				break;
		}
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		scn.close();
}
}
