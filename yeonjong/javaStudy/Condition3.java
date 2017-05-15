package javaStudy;

import java.util.Scanner;

public class Condition3 {
	
	//숫자 맞추기
	//컴퓨터는 1~100 임의 수 저장
	//숫자 입력시 up down  알려줌
	//사용자가 몇 번 만에 맞추었는지 출력 
	public void ex1() {
		
		int comp = (int) (Math.random() * 100) ;
		
		String result;
		int count = 1;
		
		while(true) {
			
			System.out.println("1~100 사이 수 입력 ");
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
				result = "짝";
				System.out.println(result);
				System.out.println(count + "번");
				break;
			}
		}
	}
	
	//입력받은 수가 회문수가 맞는지 검사 
	//123454321
	public void ex2(String number) {
		
	}
	
	public static void main(String[] args) {
		
		Condition3 ex = new Condition3();
		ex.ex1();
		ex.ex2("1234321");
		
	}

}
