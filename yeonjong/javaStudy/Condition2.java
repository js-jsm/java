package javaStudy;

public class Condition2 {
	
	//2x + 4y = 10
	public void ex1() {
		
		int count = 0;
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				
				if(10 == (2 * i) + (4 * j)) {
					count ++;
					System.out.println("(2 * " + i + ") + (4 * " + j +")");
				}
			}
		}
		System.out.println(count + "��");
	}
	
	//12345 �Է½� 1+2+3+4+5
	public void ex2(String number) {
		
		int result = 0;
		char [] arr = new char[number.length()];
		arr = number.toCharArray();
		
		for(int i = 0; i < number.length(); i++) {
			result += Integer.parseInt(String.valueOf(arr[i]));
		}
		System.out.println(result);
	}
	
	//�Ǻ���ġ���� 10��°�� ���ϱ�
	//0, 1, 1, 2, 3, 5, 8...
	public void ex3() {
		
		int num1 = 0;
		int num2 = 1;
		
		int temp = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 1; i <= 8 ; i++) {
			temp = num1 + num2;
			System.out.println(temp);
			num1 = num2;
			num2 = temp;
		}
	}
	
	//�־��� ���ڿ��� �������� �Ǻ� 
	public void ex4(String str) {
		
		if(isNumber(str)) {
			System.out.println("����");
		} else {
			System.out.println("���ھƴϿ�");
		}
	}
	
	//�Ǽ��� ��ȯ�� �� �ִ��� ���θ� Ȯ��
	public boolean isNumber(String str) {
		
		boolean result;
		
		try {
			//Double.parseDouble() �� ���ڿ��� �Ǽ��� ��ȯ�ؼ�
			//������ ���� ���ڷ� �ƴ� ������ �Ǵ��Ͽ� false(����)�� ��ȯ
			Double.parseDouble(str);
			result = true;	
		} catch (NumberFormatException e) {
			result = false;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Condition2 ex = new Condition2();
		ex.ex1();
		System.out.println("============");
		ex.ex2("12345");
		System.out.println("============");
		ex.ex3();
		System.out.println("============");
		ex.ex4("12123");
		
		
	}
}
