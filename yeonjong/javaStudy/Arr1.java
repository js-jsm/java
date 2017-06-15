package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class Arr1 {

	//배열에 담긴 모든값 더하기 	
	public void ex1() {
		
		List<Integer> list = new ArrayList<Integer>();
		int result = 0;
		
		list.add(1);
		list.add(6);
		list.add(4);
		list.add(5);
		
		for(Integer sum : list) {
			result += sum;
		}
		System.out.println(result);
	}
	
	//2차원 배열에 담긴 모든 값으ㅢ 총합과 평균을 구하는 프로그램 	
	public void ex2() {
		
		int sum = 0;
		double aver = 0.0;
		
		int[][] arr = {
							{1,2,3}, //[0][0] [0][1] [0][2]
							{5,4,2}	 //[1][0] [1][1] [1][2]
						};
		
		for(int i = 0; i < arr.length; i++) {
			//arr[i].length => 3
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; 
				aver = sum / (arr.length * arr[i].length);
			}
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + aver);
	}
	
	public static void main(String[] args) {

		Arr1 arr = new Arr1();
		arr.ex1();
		System.out.println("================");
		arr.ex2();
	}

}
