package jaenam.week01;
/*
연산자 문제
- 입력받은 수: 상수로 입력 합니다. ex: int a = 33; 
1. 입력받은 수에 따라 '양수', '음수', '0' 을 출력하는 코드를 삼항연산자를 이용하여 작성하시오.
2. 입력받은 수의 백의 자리 이하를 버리는 코드를 작성하시오. (ex> 456 입력시 400 출력)
3. 입력받은 수의 일의 자리를 1로 바꾸는 코드를 작성하시오. (ex> 777 입력시 771 출력)
4. 입력받은 수보다 크면서 입력받은 수에 가장 가까운 10의 배수에서 입력받은 수를 뺀 수를 구하는 코드를 작성하시오.
5. 화씨를 섭씨로 변환하는 코드를 작성하시오. (공식은 c = 5 / 9 * (f - 32))
6. 대문자를 소문자로, 소문자를 대문자로 변경하는 코드를 작성하시오.
 */
public class Operator {
	public static void main(String[] args) {
		System.out.println(a1(10));
		System.out.println(a1(-5));
		System.out.println(a1(0));
		System.out.println(a2(1234));
		System.out.println(a3(5678));
		System.out.println(a4(9012));
		System.out.println(a5(90));
		System.out.println(a6('a'));
		System.out.println(a6('Z'));
	}
	static String a1(int arg) {
		return arg > 0 ? "양수" : arg == 0 ? "0" : "음수";
	}
	static int a2(int arg) {
		return (arg / 100) * 100;
	}
	static int a3(int arg) {
		return arg / 10 * 10 + 1;
	}
	static int a4(int arg) {
		return (arg + 10) / 10 * 10 - arg;
	}
	static float a5(int arg) {
		return (float) ((arg - 32) / 1.8); 
	}
	static char a6(char arg) {
		int n = arg < 97 ? 32 : -32;
		return (char) (arg + n);
	}
}
