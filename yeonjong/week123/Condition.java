package jasmine.homework1;

import java.util.Scanner;

public class Condition {
	//1. 1�??? 20�?�??? ???? �? 2 ???? 3?? 배�??�? ???? ???? �??��?? 구�??????.
	public void sum() {
		int count = 0;
		for(int i = 1; i <= 20; i++) {
			if(!((i % 2) == 0 || (i % 3) == 0)) {
				System.out.println(i);
				count += i;
			}
		}
		System.out.println(count);
	}
	
	//2. 1 + (1 + 2) + (1 + 2 + 3 ) .... + (1 + 2 + .... + 10) ?? 결과�? 구�??????.
	public void sum2() {
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			count += i + count;
		}
		System.out.println(count);
	}
	
	//3. 1 + (-2) + 3 + (-4) ..... ?��??�? �??? ???????? ?? �?�?�? ???��?? �??��?? 100 ?��???? ???��??�? 구�??????.
	public void sum3() {
		int sw = 1;
		int sum = 0;
		int count = 0;
		for(int i = 1; sum <= 100; i++) {
			sw = sw * -1;
			sum = i * sw;
			sum += sum;
			count ++;
		}
		System.out.println(count);
	}
	//4. ?? �??? 주�?��??�? ??�??? ?? ???? ?��?? 6?? ???? 모�?? 경�?��?? ??�? �??��??????.
	public void sum4() {
		int one[] = new int[]{1, 2, 3, 4, 5, 6};
		int two[] = new int[]{1, 2, 3, 4, 5, 6};
		int count = 0;
		
		for(int turn1 : one) {
			for(int turn2 : two) {
				if((turn1 + turn2) == 6) {
					System.out.println(turn1 + " + " + turn2) ;
					count ++;
				}
			}
		}
		System.out.println(count);
	}
	
	//5. 방�???? 2x + 4y = 10 ?? 모�?? ?��?? 구�??????.
	public void sum5() {
		
		int result = 10;
		
		for(int x = 0 ;; x++) {
			for(int y = 0;; y++) {
				if(result == (2 * x) + (4 * y)) {
					System.out.println(x);
				}
			}
		}
	}
	//6. ?��??�? ???��??? �? ??리�?? ?��?? ???? 결과�? �??��???? �???�? ???��??????. (ex> 12345 ???��?? 1 + 2 + 3 + 4 + 5 ?? 결과 �???)
	public void sum6() {
		
		String result = "123123123";
		String arr[] = new String[]{};
		int sum = 0;
		
		for(int i = 0; i < result.length(); i++) {
			arr[i] = result.substring(0 + i, 1 + i);
			sum += Integer.parseInt(arr[i]);
		}
	}
	
	//7. ?�보??�? ???��?? 10�?�? ???? 무�???��? �??��???? ??�?그�?��?? ???��??????.
	//   (?�보??�? ???��?��?? �?�? ???? ?? ??�? ???? ??�? ?��?? ??�? ???? ???��?��??. 0, 1, 1, 2, 3, 5, 8, 13 .... )
	
	public void fibo() {
		int a = 0;
		int b = 1;
		int temp = 0;
		// 0 1 // 
		for(int i = 0; i < 10; i++) {
			a = a + b;
			b = temp;
			temp = a;
			System.out.println(temp);
		}
	}
	
	//8. 주�?��? 문�???��?? ?��???��? ??�????? ??�?그�?��?? ???��??????.
	public void find() {
		String str = "123jfwdl";
		char check;
		
		for(int i = 0; i<str.length(); i++){
			check = str.charAt(i);
			System.out.println(check);
			if(check < 48 && check > 57) {
				System.out.println("?��?? " + check);
			}
			System.out.println("�? " + check);
		}		
	}
	
	//9. ?��??�?�?�? �???
	//   1) 컴�?��?��?? 1�??? 100�?�??? ?? �? ?????? ??�? �????��????.
	//   2) ?��?��??�? ?��??�? ???? ?? up, down ?��? �????? ??보�?? ?��? ????�?�? ???��?????.
	//   3) ?��?��??�? ?��??�? �?�?�? 컴�?��?��?? �? �? �??? ?��??�? �?�?????�? �??��?��????.
	
	public void game() {

		final int comp = (int) (Math.random() * 100);
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100 �????????????��??");
		int user = scan.nextInt();
		
		while(comp != user) {
			if(comp > user) {
				System.out.println("up"); 
				System.out.println("?��??????");
				user = scan.nextInt();
				count ++;
			} else if (comp < user) {
				System.out.println("down");
				System.out.println("?��??????");
				user = scan.nextInt();
				count ++;
			}
		}
		System.out.println("�?�?");
		System.out.println(count + " �?�??? �?�??��??");
	}
	//10. ???��??? ??�? ??문�??�? �???�?�? �??��???? ??�?그�?��?? ???��??????.
	//(??문�??(palindrome)?? ? ???��? ?��?��?? ?��? ?��?��?? �??? ??. ex> 12321)
	public void palindrome() {
		
		String number = "123445553921";
		boolean isCheck  = false;
//		String front = number.substring(0, number.length() / 2);
//		String back = number.substring(number.length() / 2, number.length());
		for(int i = 0; i < (number.length() / 2); i++) {
            isCheck = number.substring(0 + i, 1 + i).equals(number.substring(number.length() - i - 1, number.length() - i));
		}
		System.out.println(isCheck + " > 결과 ");
	}

	public static void main(String[] args) {
		Condition con = new Condition();
//		con.sum();
		con.sum2();
//		con.sum3();
//		con.sum4();
//		con.sum5();
//		con.sum6(); ????
//		con.fibo();
//		con.find();
//		con.game();
		con.palindrome();//????????
	}
}
