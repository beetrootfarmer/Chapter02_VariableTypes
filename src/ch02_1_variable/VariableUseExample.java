package ch02_1_variable;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute =5;
		System.out.println(hour + "�ð�" + minute + "��");
//							3	+	�ð�		5	 	��
//				���ڿ�: 		"3"+"�ð�" ~> �� + ���ڴ� ���ڿ��� �ȴ�
		/*���� System.out.println(3+3);�� 6���� �������Ǿ ������
				System.out.println("3"+3);�� 3���� 3 ���ڰ� �پ 33���� ���´�*/

		int totalMinute = (hour*60) + minute;
		System.out.println("��" + totalMinute + "��");
	}

}
