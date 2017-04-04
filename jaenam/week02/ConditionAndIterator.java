package jaenam.week02;
/*
조건문과 반복문 문제
 */
public class Condition {
	public static void main(String[] args) {
		System.out.println(a1());
		System.out.println(a2());
		System.out.println(a3());
		System.out.println(a4());
		System.out.println(a5());
		System.out.println(a6("12345"));
		System.out.println(a6("192837465"));
		System.out.println(a7());
		System.out.println(a8("3548"));
		System.out.println(a8("758a39f"));
		a9(76);
		a9(53);
		System.out.println(a10(1023201));
		System.out.println(a10(1023212));
		System.out.println(a10(1023223201));
	}

//	1. 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	static int a1() {
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		return sum;
	}

//	2. 1 + (1 + 2) + (1 + 2 + 3 ) .... + (1 + 2 + .... + 10) 의 결과를 구하시오.
	static int a2() {
		int res = 0;
		int prev = 0;
		for(int i = 1; i <= 10; i++) {
			prev += i;
			res += prev;
		}
		return res;
	}
	
//	3. 1 + (-2) + 3 + (-4) ..... 이렇게 계속 더하였을 때 몇까지 더해야 총합이 100 이상이 나오는지 구하시오.
	static int a3() {
		int res = 0;
		int sign = -1;
		int i = 0;
		do {
			i++;
			sign *= -1;
			res += i * sign;
		} while(res < 100);
		return i;
	}
	
//	4. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.
	static String a4() {
		String res = "";
		for(int i = 1; i <= 5; i++) {
			int j = 6 - i;
			res += "[" + i + ", " + j + "] ";
		}
		return res;
	}
	
//	5. 방정식 2x + 4y = 10 의 모든 해를 구하시오.
//	y = 2.5 - 0.5 * x;
	static String a5() {
		String res = "";
		float y;
		for(int x = 0; x <= 10; x++) {
			y = (float) (2.5 - 0.5 * x);
			if((float)(int)y == y && y >= 0) {
				res += "[" + x + ", " + (int)y + "] ";
			}
		}
		return res;
	}
	
//	6. 숫자를 입력받아 각 자리의 합을 더한 결과를 출력하는 코드를 작성하시오. (ex> 12345 입력시 1 + 2 + 3 + 4 + 5 의 결과 출력)
	static int a6(String input) {
		int res = 0;
		for(String v : input.split("")) {
			res += v.charAt(0) - 48;
		}
		return res;
	}
	
//	7. 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.
//	   (피보나치 수열이란 바로 전의 두 수를 더한 수가 다음 수가 되는 수열이다. 0, 1, 1, 2, 3, 5, 8, 13 .... )
	static int a7() {
		int c = 3;
		int pp = 0;
		int p = 1;
		int res = 0;
		do {
			c++;
			res = pp + p;
			pp = p;
			p = res;
		} while(c <= 10);
		return res;
	}
	
//	8. 주어진 문자열이 숫자인지 판별하는 프로그램을 작성하시오.
	static boolean a8(String arg) {
		for(char v : arg.toCharArray()) {
			if(v < 48 || v > 57) {
				return false;
			}
		}
		return true;
	}
	
//	9. 숫자맞추기 게임
//	   1) 컴퓨터는 1부터 100까지의 수 중 임의의 수를 지정합니다.
//	   2) 사용자가 숫자를 입력 시 up, down 으로 지정된 수보다 큰지 작은지를 알려줍니다.
//	   3) 사용자가 숫자를 맞추면 컴퓨터는 몇 번 만에 숫자를 맞추었는지 출력합니다.
	static void a9(int input) {
		int count = 0;
		int guess = 0;
		int max = 100;
		int min = 0;
		
		do {
			guess = (int)(Math.random() * (max - min)) + min;
			if(guess < input) {
				min = guess + 1;
				System.out.println(guess + " : up");
			} else if(guess > input) {
				max = guess - 1;
				System.out.println(guess + " : down");
			}
			count++;
		} while(guess != input);
		System.out.println("정답 : " + guess + ", 맞추는 데 걸린 횟수 : " + count);
	}
	
//	10. 입력받은 수가 회문수가 맞는지를 검사하는 프로그램을 작성하시오.
//	   (회문수(palindrome)란 ? 앞으로 읽어도 뒤로 읽어도 같은 수. ex> 12321)
	static boolean a10(int num) {
		char[] ch = Integer.toString(num).toCharArray();
		for(int i = 0, lth = ch.length; i < lth / 2; i++) {
			if(ch[i] != ch[lth - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
