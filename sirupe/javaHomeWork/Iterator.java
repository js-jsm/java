package javaHomeWork;

//조건문과 반복문 문제
//
public class Iterator {
	public static void main(String[] args) {
		int result = 0;
		
		//1. 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		System.out.println("1. 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오.");		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				result += i;
			}
		}
		System.out.println("\t결과 => " + result);

		//2. 1 + (1 + 2) + (1 + 2 + 3 ) .... + (1 + 2 + .... + 10) 의 결과를 구하시오.
		result = 0;
		System.out.println("2. 1 + (1 + 2) + (1 + 2 + 3 ) .... + (1 + 2 + .... + 10) 의 결과를 구하시오.");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				result += j;
			}
		}
		System.out.println("\t결과 => " + result);
	
		//3. 1 + (-2) + 3 + (-4) ..... 이렇게 계속 더하였을 때 몇까지 더해야 총합이 100 이상이 나오는지 구하시오.
		System.out.println("3. 1 + (-2) + 3 + (-4) ..... 이렇게 계속 더하였을 때 몇까지 더해야 총합이 100 이상이 나오는지 구하시오.");
		result = 1;
		int sum = 0;
		while(sum < 100) {
			sum = result % 2 != 0 ? sum + result : sum - result; 
			result++;
		}
		System.out.println("\t결과 => " + result);
				
		//4. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.
		result = 0;
		System.out.println("4. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.");
		for(int i = 1; i <= 3; i++) {
			for(int j = 3; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println("\t결과 => " + i + " / " + j);
				}
			}
		}

		//5. 방정식 2x + 4y = 10 의 모든 해를 구하시오.
		System.out.println("5. 방정식 2x + 4y = 10 의 모든 해를 구하시오.");
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 2; j++) {
				if((2 * i) + (4 * j) == 10) {
					System.out.println("\t결과 => " + "x : " + i + " / y : " + j);
				}
			}
		}

		//6. 숫자를 입력받아 각 자리의 합을 더한 결과를 출력하는 코드를 작성하시오. (ex> 12345 입력시 1 + 2 + 3 + 4 + 5 의 결과 출력)
		System.out.println("6. 숫자를 입력받아 각 자리의 합을 더한 결과를 출력하는 코드를 작성하시오. (ex> 12345 입력시 1 + 2 + 3 + 4 + 5 의 결과 출력)");
		int a = 123456;
		result = a % 10;
		int it = 10;
		int prevIt = it;
		while( a % it > 0) {
//			System.out.println(a % it);
			result += (a % it) / prevIt;
//			System.out.println((a % it) / prevIt);
			a = a - (a % it);
			it *= 10;
			prevIt = it / 10;
		}
		System.out.println("\t결과 => result = " + result);

		//7. 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.
		// (피보나치 수열이란 바로 전의 두 수를 더한 수가 다음 수가 되는 수열이다. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 .... )
		System.out.println("7. 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.");
		result = 1;
		int prevNum = 0;
		int nextNum = 0;
		for(int i = 0; i < 10; i++) {
			nextNum = result + prevNum;
			result = prevNum;
			prevNum = nextNum;
		}
		System.out.println("\t결과 => " + result);
		
		
		
		//8. 주어진 문자열이 숫자인지 판별하는 프로그램을 작성하시오.
		System.out.println("8. 주어진 문자열이 숫자인지 판별하는 프로그램을 작성하시오.");
		String s = "12";
		boolean b = true;
		for(int i = 0, size = s.length(); i < size; i++) {
			if((int)s.charAt(i) < 80 && (int)s.charAt(i) > 89) {
				b = false;
				break;
			} 
		}
		System.out.println("\t입력하신 문자열은 숫자" + (b ? "입니다." : "가 아닙니다."));
		
		//9. 숫자맞추기 게임
		// 1) 컴퓨터는 1부터 100까지의 수 중 임의의 수를 지정합니다.
		// 2) 사용자가 숫자를 입력 시 up, down 으로 지정된 수보다 큰지 작은지를 알려줍니다.
		// 3) 사용자가 숫자를 맞추면 컴퓨터는 몇 번 만에 숫자를 맞추었는지 출력합니다.
		result = 33;
		int userInput = 50;
		int count = 0;
		System.out.println("9. 숫자맞추기 게임");
		while(userInput != result) {
			System.out.println("\t입력한 수 => " + userInput);
			if(userInput > result) {
				System.out.println("\tup");
				userInput--;
			} else {
				System.out.println("\tdown");
				userInput++;
			}
			count++;
		}
		System.out.println("\t총 " + count + " 회 만에 정답! > " + result);

		//10. 입력받은 수가 회문수가 맞는지를 검사하는 프로그램을 작성하시오.
		// (회문수(palindrome)란 ? 앞으로 읽어도 뒤로 읽어도 같은 수. ex> 12321)
		System.out.println("10. 입력받은 수가 회문수가 맞는지를 검사하는 프로그램을 작성하시오.");
		String inputNum = "13731";
		String num = "";
		for(int i = inputNum.length() - 1; i >= 0; i--) {
			num += inputNum.charAt(i);
		}
		System.out.println("\t입력받은 수는 회문수가 " + (inputNum.equals(num) ? "맞습니다." : "아닙니다."));
		
	}
}
