package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class Arr1 {

	//�迭�� ��� ��簪 ���ϱ� 	
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
	
	//2���� �迭�� ��� ��� ������ ���հ� ����� ���ϴ� ���α׷� 	
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
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + aver);
	}
	
	public static void main(String[] args) {

		Arr1 arr = new Arr1();
		arr.ex1();
		System.out.println("================");
		arr.ex2();
	}

}
