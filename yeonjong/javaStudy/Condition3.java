package javaStudy;

import java.util.Scanner;

public class Condition3 {
	
	//���� ���߱�
	//��ǻ�ʹ� 1~100 ���� �� ����
	//���� �Է½� up down  �˷���
	//����ڰ� �� �� ���� ���߾����� ��� 
	public void ex1() {
		
		int comp = (int) (Math.random() * 100) ;
		
		String result;
		int count = 1;
		
		while(true) {
			
			System.out.println("1~100 ���� �� �Է� ");
			Scanner scan = new Scanner(System.in);
			int user = scan.nextInt();
			
			if(comp > user) {
				result = "up";
				count++;
				System.out.println(result);
			} else if(comp < user) {
				result = "down";
				count++;
				System.out.println(result);
			} else if (comp == user){
				result = "¦";
				System.out.println(result);
				System.out.println(count + "��");
				break;
			}
		}
	}
	
	//�Է¹��� ���� ȸ������ �´��� �˻� 
	//123454321
	public void ex2(String number) {
		
	}
	
	public static void main(String[] args) {
		
		Condition3 ex = new Condition3();
		ex.ex1();
		ex.ex2("1234321");
		
	}

}
