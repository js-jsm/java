package javaStudy;

public class OOP2 {

	//���ڿ��� ��� ���ڷθ� �̷���� �ִ��� Ȯ�� 
	public boolean isNumber(String str) {
		
		boolean result;
		
		try {
			//Double.parseDouble() �� ���ڿ��� �Ǽ��� ��ȯ�ؼ�
			//������ ���� ���ڷ� �ƴ� ������ �Ǵ��Ͽ� false(����)�� ��ȯ
			Double.parseDouble(str);
			result = true;	
		} catch (NumberFormatException e) {
			result = false;
		}
		return result;
	}
	
	//�ִ밪 ���ϱ� 	
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

	//�޼ҵ� �׽�Ʈ ���밪 ��ȯ 	
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
