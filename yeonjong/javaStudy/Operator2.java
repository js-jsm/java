package javaStudy;

//ȭ���� ������
//(ȭ���µ� - 32) �� 1.8 = �����µ�
class EX5 {
	
	public EX5(int number) {
		
		double result;
		result = (number - 32) / 1.8;
		System.out.println(result);
	
	}
}

// ���ڸ��ѱ��� �Է¹޾� �����϶� true ���� 

class EX6 {
	
	public EX6(String str) {
		
		boolean isCheck = false;
		
		if(str.matches("[0-9]")) {
			isCheck = true;
		}
		
		System.out.println(isCheck);
	}
}

//�빮�ڸ� �ҹ��ڷ� �ҹ��ڸ� �빮�ڷ� 
class EX7 {
	
 	public EX7(String str) {
		
		String result;

		//���ڹ迭�� ��ȯ�ϴ� �޼ҵ� ���
		char [] arr = str.toCharArray(); 
		
 		for(int i = 0; i < str.length(); i++) {
 			//�ƽ�Ű �ڵ� a~x 97~122  // 65~90  A~X
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
