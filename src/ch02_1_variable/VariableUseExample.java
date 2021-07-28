package ch02_1_variable;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute =5;
		System.out.println(hour + "시간" + minute + "분");
//							3	+	시간		5	 	분
//				문자열: 		"3"+"시간" ~> 수 + 문자는 문자열이 된다
		/*예시 System.out.println(3+3);은 6으로 산술연산되어서 나오고
				System.out.println("3"+3);은 3옆에 3 문자가 붙어서 33으로 나온다*/

		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
	}

}
