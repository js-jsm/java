package jasmine.homework1;

import java.util.Scanner;

public class Operator {
	
	//1. 입력받은 수에 따라 '양수', '음수', '0' 을 출력하는 코드를 삼항연산자를 이용하여 작성하시오.
	public void array() {
		
		int[] number = new int[]{1 ,-12 ,0 ,-23 ,5};
		for(int turn : number) {
			System.out.println(turn > 0 ? "양수" : turn == 0 ? turn : "음수");
		}
	}

	//2. 입력받은 수의 백의 자리 이하를 버리는 코드를 작성하시오. (ex> 456 입력시 400 출력)
	public void change1() {

		//public String replace(CharSequence target, CharSequence replacement)
		//이것은 일치되는 모든 문자열을 바꿉니다.
		//public String replaceFirst(String regex, String replacement)
		//이것은 첫번째로 일치되는 문자열만 바꿉니다. 
		//public String replaceAll(String regex, String replacement)
		//맨 처음의 replace() 와 같이, 일치되는 모든 문자열을 바꿉니다. 
		//replace()와 다른 점은, 정규식/정규표현식(Regular Expressions; Regex)을 사용할 수 있다는 것입니다.
		//String a = "0123819230";
		//a = a.replaceFirst(a.substring(a.length() -3, a.length()), "000");
		//System.out.println(a);
		int b = 4566;
		System.out.println((b / 100) * 100);
		
	}
	
	//3. 입력받은 수의 일의 자리를 1로 바꾸는 코드를 작성하시오. (ex> 777 입력시 771 출력)

	public void change2() {
		int b = 7777;		
		System.out.println(((b / 10) * 10) + 1);
		
	}
	
	//4. 입력받은 수보다 크면서 입력받은 수에 가장 가까운 10의 배수에서 입력받은 수를 뺀 수를 구하는 코드를 작성하시오.
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
	//5. 화씨를 섭씨로 변환하는 코드를 작성하시오.  //(화씨온도 - 32) ÷ 1.8 = 섭씨온도
	public void change4() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("화씨 입력");
		int f = scan.nextInt();
		double c = (f - 32) / 1.8;
		System.out.println(c + " > 섭씨");
	}
	
	//6. 대문자를 소문자로, 소문자를 대문자로 변경하는 코드를 작성하시오.
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
