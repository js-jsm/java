package homework;

public class Iterator {
	public static void main(String [] args){
		/*조건문과 반복문 문제
		1. 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		2. 1 + (1 + 2) + (1 + 2 + 3 ) .... + (1 + 2 + .... + 10) 의 결과를 구하시오.
		3. 1 + (-2) + 3 + (-4) ..... 이렇게 계속 더하였을 때 몇까지 더해야 총합이 100 이상이 나오는지 구하시오.
		4. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.
		5. 방정식 2x + 4y = 10 의 모든 해를 구하시오.
		6. 숫자를 입력받아 각 자리의 합을 더한 결과를 출력하는 코드를 작성하시오. (ex> 12345 입력시 1 + 2 + 3 + 4 + 5 의 결과 출력)
		7. 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.
		   (피보나치 수열이란 바로 전의 두 수를 더한 수가 다음 수가 되는 수열이다. 0, 1, 1, 2, 3, 5, 8, 13 .... )
		8. 주어진 문자열이 숫자인지 판별하는 프로그램을 작성하시오.
		9. 숫자맞추기 게임
		   1) 컴퓨터는 1부터 100까지의 수 중 임의의 수를 지정합니다.
		   2) 사용자가 숫자를 입력 시 up, down 으로 지정된 수보다 큰지 작은지를 알려줍니다.
		   3) 사용자가 숫자를 맞추면 컴퓨터는 몇 번 만에 숫자를 맞추었는지 출력합니다.
		
		10. 입력받은 수가 회문수가 맞는지를 검사하는 프로그램을 작성하시오.
		   (회문수(palindrome)란 ? 앞으로 읽어도 뒤로 읽어도 같은 수. ex> 12321)
		Add Comment
		*/
		//1.
		int value = 0;
		for(int i = 1; i <= 20; i++){
			if(i%2 != 0 || i%3 != 0){
				value += i;
			}
		}
		System.out.println("1. : " + value);

		//2.
		int value2 = 0;
		for(int i = 1; i <= 10; i++){
			value2+=(value2 + i);
		}
		System.out.println("2. : " + value2);

		//3.
		int value3 = 0;
		for(int i = 1,result = 0; result < 100; i++, value3 = i){
			if(i%2 == 0){
				result -= i;
			}else{
				result += i;
			}
		}
		System.out.println("3. : " + value3);

		//4.
		for(int i = 1; i <= 6; i++){
			for(int j = 1; j <= 6; j++){
				if(i + j == 6){
					System.out.println("4.문제 : " + i + "+" + j + "=" + (i + j));
				}
			}
		}
		//5. 2x + 4y = 10
		for(int x = 0; x <= 10; x++){
			for(int y = 0; y <= 10; y++){
				if(2*(x + 2*y) == 10){
					System.out.println("5.문제 : " + " 2 * " + x + " + 4 * " + y + " = " + 2*(x + 2*y));
				}
			}
		}
		//6.
		int value6 = 0;
		for(int i = 10, a = 12456; a > 0; a = a/i){
			value6 += (a%i);
		}
		System.out.println("6.문제 : " + value6);

		//7. 0 1 1 2 3 5 8 13 21 34 55 89
		int value7 = 0;
		for(int i = 0, j = 1, count = 1; count <= 10; count++ ){
			value7 = i + j;
			i = j;
			j = value7;
		}
		System.out.println("7.문제 : " + value7);

		//8.주어진 문자열이 숫자인지 판별하는 프로그램을 작성하시오.
		String numberTxt = "123mrrkk";
		System.out.println(numberTxt.length());
		char [] arrNum = numberTxt.toCharArray();
		String result2 = "숫자다";
		for(char v : arrNum){
			if(v < 48 || v > 57){
				result2 = "숫자가 아니다";
				break;
			}
		}
		System.out.println("8.문제 : " + result2);

		/*9. 숫자맞추기 게임
		   1) 컴퓨터는 1부터 100까지의 수 중 임의의 수를 지정합니다.
		   2) 사용자가 숫자를 입력 시 up, down 으로 지정된 수보다 큰지 작은지를 알려줍니다.
		   3) 사용자가 숫자를 맞추면 컴퓨터는 몇 번 만에 숫자를 맞추었는지 출력합니다.*/
		int computerNum = (int)(Math.random()*100) + 1;
		int resultCnt = 0;
		System.out.println(computerNum);
		for(int min = 0, max = 100, input = (int)(Math.random() * (max - min)) + min + 1, cnt = 0; input > min && input <= max;cnt++){
			if(computerNum > input){
				System.out.println("up");
				min = input;
				input = (int)(Math.random() * (max - min)) + min + 1;
				System.out.println(input);
			}else if(computerNum < input){
				System.out.println("down");
				max = input;
				input = (int)(Math.random() * (max - min)) + min + 1;
				System.out.println(input);
			}else {
				resultCnt = cnt;
				break;
			}
		}
		System.out.println("9.문제 : " + resultCnt + "번");
		
		/*10. 입력받은 수가 회문수가 맞는지를 검사하는 프로그램을 작성하시오.
		   (회문수(palindrome)란 ? 앞으로 읽어도 뒤로 읽어도 같은 수. ex> 12321)*/
		int result = 0;
		int input = 1456541;
		for(int v = input; v > 0; v /= 10){
			result = v%10 + result*10;
			System.out.println(result);
		}
		System.out.println("10.문제 : " + (input == result ? "회문수가 맞다" : "회문수가 아니다"));

	}
}
