package javaStudy;

public class Arr2 {
	
	//배열 숫자 만큼 * 찍기
	public void ex1() {
		int[] answer = {1, 4, 5, 6, 7, 2, 1};
		
		for(int i = 0, size = answer.length; i < size; i++) {
			for(int j = 0; j < answer[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//배열 회전 시키기 	
	public void ex2() {
		
		String[][] arr = {
							{"*", "*", "*", "*"}, //0 0
							{"*", "*", "*", "*"}, //1 0
							{"*", "*"},           //2 0  
							{"*"}                 //3 0
						  };
		
		for(int i = arr.length; i == 0; i--) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}	
	
	public void ex3() {
		
		int[][] arr = {
							{100, 80, 55}, 
							{88, 22, 80}, 
							{80, 20, 60}     
						};
		
		int[][] result = new int[arr.length][arr[0].length + 1];
		
		int sum = 0;
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				
				
				
			}
		}
	}
	
	public static void main(String[] args) {
	
		Arr2 ex = new Arr2();
		ex.ex1();
		System.out.println("=============");
		ex.ex2();
		System.out.println("=============");
		ex.ex3();

	}
}
