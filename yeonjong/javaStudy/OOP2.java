package javaStudy;

public class OOP2 {

	//문자열이 모두 숫자로만 이루어져 있는지 확인 
	public boolean isNumber(String str) {
		
		boolean result;
		
		try {
			//Double.parseDouble() 로 문자열을 실수로 변환해서
			//에러가 나면 숫자로 아닌 것으로 판단하여 false(거짓)를 반환
			Double.parseDouble(str);
			result = true;	
		} catch (NumberFormatException e) {
			result = false;
		}
		return result;
	}
	
	//최대값 구하기 	
	public int max(int[] arr) {
		
		int result = 0;
		
		if(arr.length != 0) {
			int max = arr[0];
			
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i] >= max) {
					max = arr[i];
				} 
				result = max;
			}
			
		} else {
			result = -9999;
		}
		return result;
	}

	//메소드 테스트 절대값 반환 	
	public void abs(int number) {
		
		int result = 0;
		
		if(number < 0) {
			result = number * -1;
		} else {
			result = number;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		OOP2 oop = new OOP2();
		int[] arr = new int[]{1,6,0,4};
		
		System.out.println(oop.max(arr));
		
		oop.abs(-23);
		
	}

}
