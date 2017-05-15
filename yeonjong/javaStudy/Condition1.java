package javaStudy;

public class Condition1 {
	
	//1~20  2또는 3의 배수가 아닌 수의 총합 
	public int ex1() {
		
		int result = 0;
		
		for(int i = 1; i <= 20; i++) {
			if((i % 2) != 0 && (i % 3) != 0) {
				
				result += i;
			}
		}
		return result;
	}
	
	//1 + (1 + 2) + ... + (1 + ... + 10)
	public void ex2() {
			
		int result = 0;
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			result += i;
			total += result;
		}
		System.out.println("1 + (1 + 2) + .. + (1 + .. + 10) : " + total);
	}
	
	// 1 + (-2) + 3 + (-4) ...  100 은 몇번째에 넘을까요?
	public void ex3() {
	
		int count = 0;
		int result = 0;
		int sw = 1;
		
		for(int i = 1; true ; i++) {
			
			result += (i * sw);
			sw *= -1;
			
			if(result <= 100) {
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(result + " // " + count + "번");
		
	}
	
	//주사위를 2개 던졌을때 합이 6이 되는 경우의수 	
	public void ex4() {
		
		int count = 0;
		
		for(int dice1 = 1; dice1 <= 6; dice1++) {
			for(int dice2 = 1; dice2 <=6; dice2++) {
				if(dice1 + dice2 == 6) {
					count++;
				}
			}
		}
		
		System.out.println(count + "가지");
		
	}

	public static void main(String[] args) {

		Condition1 con = new Condition1();
		System.out.println("2 3 배수 총합 : " + con.ex1());
		System.out.println("================");
		con.ex2();
		System.out.println("================");
		con.ex3();
		System.out.println("================");
		con.ex4();
		
	}
}
