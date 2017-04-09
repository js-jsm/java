package jsmine.task.yuri.weak02;

public class OperatorYuri {
	public static void main(String [] args){
		/*
		 * 연산자 문제
	- 입력받은 수: 상수로 입력 합니다. ex: int a = 33; 
	1. 입력받은 수에 따라 '양수', '음수', '0' 을 출력하는 코드를 삼항연산자를 이용하여 작성하시오.
	2. 입력받은 수의 백의 자리 이하를 버리는 코드를 작성하시오. (ex> 456 입력시 400 출력)
	3. 입력받은 수의 일의 자리를 1로 바꾸는 코드를 작성하시오. (ex> 777 입력시 771 출력)
	4. 입력받은 수보다 크면서 입력받은 수에 가장 가까운 10의 배수에서 입력받은 수를 뺀 수를 구하는 코드를 작성하시오.
	5. 화씨를 섭씨로 변환하는 코드를 작성하시오. (공식은 c = 5 / 9 * (f - 32))
	6. 대문자를 소문자로, 소문자를 대문자로 변경하는 코드를 작성하시오.
		 */
		//1.
		int num = 33;

		System.out.println(num > 0 ? "양" : num < 0 ? "음" : "0");
		//2.
		int num2 = 456;
		System.out.println((int)(num2/100)*100);
		//3.
		int num3 = 777;
		System.out.println((int)(num3/10)*10 + 1);
		//4.
		int num4 = 50;
		//5.
		
		//6.
		char text1 = 'B';
		int text01 = text1 + 32;
		char text2 = 'b';
		int text02 = text2 - 32;
		
		System.out.println((char)text01);
		System.out.println((char)text02);
		
	}
}
