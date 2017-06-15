package javaStudy;

//화씨를 섭씨로
//(화씨온도 - 32) ÷ 1.8 = 섭씨온도
class EX5 {
	
	public EX5(int number) {
		
		double result;
		result = (number - 32) / 1.8;
		System.out.println(result);
	
	}
}

// 문자를한글자 입력받아 숫자일때 true 리턴 

class EX6 {
	
	public EX6(String str) {
		
		boolean isCheck = false;
		
		if(str.matches("[0-9]")) {
			isCheck = true;
		}
		
		System.out.println(isCheck);
	}
}

//대문자를 소문자로 소문자를 대문자로 
class EX7 {
	
 	public EX7(String str) {
		
		String result;

		//문자배열로 변환하는 메소드 사용
		char [] arr = str.toCharArray(); 
		
 		for(int i = 0; i < str.length(); i++) {
 			//아스키 코드 a~x 97~122  // 65~90  A~X
 			if(arr[i] <= 122 && arr[i] >= 97) {
 				result = String.valueOf(arr[i]).toUpperCase();
 				System.out.print(result);
 			} else {
 				result = String.valueOf(arr[i]).toLowerCase();
 				System.out.print(result);
 			}
 		}
	}
}

public class Operator2 {
	

	public static void main(String[] args) {
		
		new EX5(100);
		new EX6("9");
		new EX7("aaVVedsED");
		
	}
}
