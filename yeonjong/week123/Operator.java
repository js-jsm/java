package jasmine.homework1;

import java.util.Scanner;

public class Operator {
	
	//1. �Է¹��� ���� ���� '���', '����', '0' �� ����ϴ� �ڵ带 ���׿����ڸ� �̿��Ͽ� �ۼ��Ͻÿ�.
	public void array() {
		
		int[] number = new int[]{1 ,-12 ,0 ,-23 ,5};
		for(int turn : number) {
			System.out.println(turn > 0 ? "���" : turn == 0 ? turn : "����");
		}
	}

	//2. �Է¹��� ���� ���� �ڸ� ���ϸ� ������ �ڵ带 �ۼ��Ͻÿ�. (ex> 456 �Է½� 400 ���)
	public void change1() {

		//public String replace(CharSequence target, CharSequence replacement)
		//�̰��� ��ġ�Ǵ� ��� ���ڿ��� �ٲߴϴ�.
		//public String replaceFirst(String regex, String replacement)
		//�̰��� ù��°�� ��ġ�Ǵ� ���ڿ��� �ٲߴϴ�. 
		//public String replaceAll(String regex, String replacement)
		//�� ó���� replace() �� ����, ��ġ�Ǵ� ��� ���ڿ��� �ٲߴϴ�. 
		//replace()�� �ٸ� ����, ���Խ�/����ǥ����(Regular Expressions; Regex)�� ����� �� �ִٴ� ���Դϴ�.
		//String a = "0123819230";
		//a = a.replaceFirst(a.substring(a.length() -3, a.length()), "000");
		//System.out.println(a);
		int b = 4566;
		System.out.println((b / 100) * 100);
		
	}
	
	//3. �Է¹��� ���� ���� �ڸ��� 1�� �ٲٴ� �ڵ带 �ۼ��Ͻÿ�. (ex> 777 �Է½� 771 ���)

	public void change2() {
		int b = 7777;		
		System.out.println(((b / 10) * 10) + 1);
		
	}
	
	//4. �Է¹��� ������ ũ�鼭 �Է¹��� ���� ���� ����� 10�� ������� �Է¹��� ���� �� ���� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
	public void change3() {
		int a = 231;
		int b = a;
		
		int count = 1;
		while(a > 0) {
			a = a / 10;
			count *= 10;
		}
		
		System.out.println(count - b);
		
	}
	//5. ȭ���� ������ ��ȯ�ϴ� �ڵ带 �ۼ��Ͻÿ�.  //(ȭ���µ� - 32) �� 1.8 = �����µ�
	public void change4() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ȭ�� �Է�");
		int f = scan.nextInt();
		double c = (f - 32) / 1.8;
		System.out.println(c + " > ����");
	}
	
	//6. �빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
	//lower a = 97 , A = 65
	public void change5() {
		String a = "ABCdefSDWsdw";
		int b = a.length();
		String upRegex = "[A-Z]";
		
		String array[] = new String [b];
		for(int i = 0; i < b; i++) {
			array[i] = a.substring(0 + i, 1 + i);
			if(array[i].matches(upRegex)) {
				System.out.print(array[i].toLowerCase());
			} else {
				System.out.print(array[i].toUpperCase());
			}
		}
	}

	public static void main(String[] args) {
		Operator operator = new Operator();
		operator.array();
		operator.change1();
		operator.change2();
		operator.change3();
		operator.change4();
		operator.change5();
	}
}
