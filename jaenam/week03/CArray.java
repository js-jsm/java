package jaenam.week03;

import java.util.Arrays;

public class CArray {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[][] arr2 = {
			{53, 55, 40, 55, 65},
			{70, 80, 35, 95, 100},
			{20, 73, 79, 43, 48}
		};
		sum1(arr1);
		sum2(arr2);
		build3();
		getMoney4(4280);
		printStar5();
		getSum6(arr2);
		getAverage7();
	}
	// 1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오. 
	static void sum1(int[] arr) {
		int sum = 0;
		for(int v : arr) {
			sum += v;
		}
		System.out.println("SUM : " + sum);
	}
	
	//	2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
	static void sum2(int[][] arr) {
		int sum = 0;
		float avg = 0;
		for(int [] r : arr) {
			for(int c : r) {
				sum += c;
			}
		}
		avg = (float) sum / (arr.length * arr[0].length);
		System.out.println("SUM : " + sum + ", AVERAGE : " + avg);
	}
	
	//	3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오.
	static int getRandom(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}
	static void build3() {
		int [] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int res = 0;
		
		for(int i = 0; i < 3; i++) {
			int n = getRandom(0, 9);
			if((i == 0 && n == 0) || nums[n] == -1) {
				i -= 1;
			} else {
				nums[n] = -1;
				res += n * Math.pow(10,  2 - i);
			}
		}
		System.out.println(res);
	}
	
	//	4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것.)
	static void getMoney4(int money) {
		int m = money;
		int [] coin = {500, 100, 50, 10};
		int [] arr = {0, 0, 0, 0};
		String res = "";
		
		for(int i = 0; i < 4; i++) {
			arr[i] = (int) m / coin[i];
			m -= arr[i] * coin[i];
			res += coin[i] + "원 : " + arr[i] + "개\n";
		}
		
		System.out.println(res);
	}
	
	//	5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};  의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.
	static void printStar5() {
		int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};
		String res = "";
		
		for(int i : answer) {
			for(int j = 0; j < i; j++) {
				res += "*";
			}
			res += "\n";
		}
		System.out.println(res);
	}
	
	// 6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.
	static void getSum6(int[][] arr) {
		int rowLength = arr.length;
		int colLength = arr[0].length;
		int [][] res = new int[rowLength + 1][colLength + 1];
		
		for(int i = 0; i < colLength + 1; i++) {
			res[rowLength][i] = 0;
		}
		
		for(int i = 0; i < rowLength; i++) {
			int colResult = 0;
			for(int j = 0; j < colLength; j++) {
				res[i][j] = arr[i][j];
				colResult += arr[i][j];
				res[rowLength][j] += arr[i][j];
			}
			res[i][colLength] = colResult;
			res[rowLength][colLength] += colResult;
		}
		
		for(int i = 0; i < rowLength + 1; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	}
	
	
	/*
	7. 학생 성적 등수 및 랭킹을 정렬하세요. 
		    - 학생 수 5명 
		    - 학생 이름 
		    - 학생 성별
		    - 국어 성적 
		    - 영어 성적
		    - 수학 성적 
		    - 총점 
		    - 평균 
		    
		평균을 기준으로 성적순으로 정렬하여 출력하세요. 
		------------------- 
		이름   성별  국어  영어 수학 총점 평균 등수
		최태산  남자  100  0   50  150 50  1
	*/
	
	static void getAverage7() {
		String[] names = {"가가멜", "나랏님", "다래끼", "라미란", "마구간"};
		String[] gender = {"남", "여", "남", "남", "여"};
		int[] kor = {100, 80, 50, 65, 85};
		int[] eng = {90, 90, 80, 70, 90};
		int[] mat = {95, 85, 80, 40, 70};
		int[] tot = {0, 0, 0, 0, 0};
		float[] avg = {0, 0, 0, 0, 0};
		int[] rank = {0, 0, 0, 0, 0};
		String[] res = {"", "", "", "", ""};
		
		for(int i = 0; i < names.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (float) Math.floor(tot[i] * 100 / 3) / 100;
		}
		
		for(int i = 0; i < names.length ; i++) {
			for(int j = 0; j < names.length; j++) {
				if(avg[i] > avg[j]) rank[j] += 1;
			}
		}
		
		for(int i = 0; i < names.length; i++) {
			int j = rank[i];
			res[j] = names[i] + "\t" + gender[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i] + "\t" + avg[i] + "\t" + (rank[i]+1) + "\n";
		}
		for(String r : res) {
			System.out.println(r);
		}
	}
}
