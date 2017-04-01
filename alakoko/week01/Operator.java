//연산자 문제
//- 입력받은 수: 상수로 입력 합니다. ex: int a = 33; 
//1. 입력받은 수에 따라 '양수', '음수', '0' 을 
//   출력하는 코드를 삼항연산자를 이용하여 작성하시오.
//2. 입력받은 수의 백의 자리 이하를 버리는 코드를 작성하시오. 
//   (ex> 456 입력시 400 출력)
//3. 입력받은 수의 일의 자리를 1로 바꾸는 코드를 작성하시오.
//   (ex> 777 입력시 771 출력)
//4. 입력받은 수보다 크면서 입력받은 수에 가장 가까운 
//   10의 배수에서 입력받은 수를 뺀 수를 구하는 코드를 작성하시오.
//5. 화씨를 섭씨로 변환하는 코드를 작성하시오. 
//   (공식은 c = 5 / 9 * (f - 32))
//6. 대문자를 소문자로, 소문자를 대문자로 변경하는 코드를 작성하시오.

package homework;

public class Operator {
	public static void main (String [] args){
		String apple = "apple";
		String APPLE = "APPLE";
		String bigLetter = apple.toUpperCase();
		String smallLetter = APPLE.toLowerCase() ;
		
		System.out.println(apple+ "이 이렇게 "+ bigLetter);
		System.out.println(APPLE+ "이 이렇게 "+ smallLetter);
		
		char A = 'A';
		int a = (int)A + 32; 
		System.out.println((char)a);
		
		
	}
}
