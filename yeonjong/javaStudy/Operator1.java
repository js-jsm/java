package javaStudy;

//���׿����ڸ� �̿��Ͽ� ��� ��� 	
class EX1 {
	
	public EX1(int number) {
		
		String result;
		result = (number > 0) ? "���" :  (number < 0) ? "����" : "0";
		System.out.println(result);
		
	}
}

//���� �ڸ� ���� ������ �ڵ� 
class EX2 {
	
	public EX2(int number) {
		
		int result;
		result = (number / 100) * 100;
		System.out.println(result);
		
	}
}

//�Է¹��� ���� �����ڸ��� 1�� �ٲٱ� 
class EX3 {
	
	public EX3(int number) {

		int result;
		result = ((number / 10) * 10 ) + 1;
		System.out.println(result);
		
	}
}

//�Է¹��� ������ ũ�鼭 �Է¹��� ���� ���� ����� 10�� ������� �Է¹��� ���� �� �� 
//10 100 1000 ...
//ex 123 - > 1000 , 1000 - 123
class EX4 {
	
	public EX4(String number) {
		
		int result;
		int length = number.length();	
		int mul = 1;
		
		for(int num = 0; num < length; num++) {
			mul = mul * 10;
		}
		
		result = mul - Integer.parseInt(number);
		System.out.println(result);
		
	}
}

public class Operator1 {
	
	public static void main(String[] args) {
		
		new EX1(100);
		new EX2(4123);
		new EX3(777);
		new EX4("999");
		
	}
}
