package ch02_1_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =15;
		if(v1>10 ) { //�߰�ȣ �ȿ��� �Էµ� ������ ���� ��ȣ �������� ����ȴ�
			int v2;
			v2 =v1 -10;
		int v3 = v1 + v2 + 5;
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);}
	}
//	for �ݺ���
//	switch 

}
class A{
	void method() {
		if(true) {
			
		}
	}
}
