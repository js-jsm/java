package javaStudy;

//삼항연산자를 이용하여 결과 출력 	
class EX1 {
	
	public EX1(int number) {
		
		String result;
		result = (number > 0) ? "양수" :  (number < 0) ? "음수" : "0";
		System.out.println(result);
		
	}
}

//백의 자리 이하 버리는 코드 
class EX2 {
	
	public EX2(int number) {
		
		int result;
		result = (number / 100) * 100;
		System.out.println(result);
		
	}
}

//입력받은 수의 일의자리를 1로 바꾸기 
class EX3 {
	
	public EX3(int number) {

		int result;
		result = ((number / 10) * 10 ) + 1;
		System.out.println(result);
		
	}
}

//입력받은 수보다 크면서 입력받은 수에 가장 가까운 10의 배수에서 입력받은 수를 뺀 수 
//10 100 1000 ...
//ex 123 - > 1000 , 1000 - 123
class EX4 {
	
	public EX4(String number) {
		
		int result;
		int length = number.length();	
		int mul = 1;
		
		for(int num = 0; num < length; num++) {
			mul = mul * 10;
		}
		
		result = mul - Integer.parseInt(number);
		System.out.println(result);
		
	}
}

public class Operator1 {
	
	public static void main(String[] args) {
		
		new EX1(100);
		new EX2(4123);
		new EX3(777);
		new EX4("999");
		
	}
}
