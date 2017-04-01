package javaHomeWork;

import java.util.Random;

public class Array {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5, 6};
		int tot = 0;
		//1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		for(int i : intArr) {
			tot += i;
		}
		System.out.println("1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오. : result = " + tot);
		System.out.println();
		
		//2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
		tot = 0;
		int arrLeng = 0;
		double avg = 0;
		int[][] intArrs = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
		};
		for(int[] arr : intArrs) {
			for(int i : arr) {
				tot += i;
			}
			arrLeng += arr.length;
		}
		avg = tot / arrLeng;
		System.out.println("2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오. : 총합 = " + tot + " / 평균 : " + avg);
		System.out.println();
		
		//3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오.
		Random random = new Random();
		intArr = new int[3];
		for(int i = 0, size = intArr.length; i < size; i++) {
			int num = random.nextInt(9) + 1;
			intArr[i] = num;
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(intArr[j] == intArr[i]) {
						i--;
						break;
					}
				}
			}
		}
		System.out.println("3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오. 결과 : " + intArr[0] + "," + intArr[1] + "," + intArr[2]);
		System.out.println();
		
		//4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것.)
		int money = 1890;
		int[] coinArr = {500, 100, 50, 10};
		System.out.println("4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것.)");
		for(int coin : coinArr) {
			System.out.print(coin + " : " + money / coin + " / ");
			money = money % coin;
		}
		System.out.println("\n");
		
		//5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};  의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.
		System.out.println("5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};  의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.");
		int[] answer = {1, 4, 4, 3, 5, 4, 2, 1};
		for(int i : answer) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.
		//{100, 100, 100},
		//{ 20,  70,   80},
		//{ 40,  35,   70},
		//{ 50,  40,   30}
		System.out.println("6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.");
		intArrs = new int[][] {
				{100, 100, 100},
				{ 20,  70,   80},
				{ 40,  35,   70},
				{ 50,  40,   30}
		};
		int[][] resultArr = new int[intArrs.length + 1][intArrs[0].length + 1] ;
		for(int i = 0, size = intArrs.length; i < size; i++) {
			int jResult = 0;
			for(int j = 0, jSize = intArrs[i].length; j < jSize; j++) {
				resultArr[i][j] = intArrs[i][j];
				jResult += intArrs[i][j];
			}
			resultArr[i][resultArr[i].length - 1] = jResult; 			
		}
		for(int i = 0, size = intArrs[0].length; i < size; i++) {
			int iResult = 0;
			for(int j = 0, jSize = intArrs.length; j < jSize; j++) {
				iResult += intArrs[j][i];
			}
			resultArr[intArrs.length][i] = iResult;
		}
		for(int[] arr : resultArr) {
			for(int i : arr) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
		
		//7. 학생 성적 등수 및 랭킹을 정렬하세요. 
		//    - 학생 수 5명 
		//    - 학생 이름 
		//    - 학생 성별
		//    - 국어 성적 
		//    - 영어 성적
		//    - 수학 성적 
		//    - 총점 
		//    - 평균 
		//    
		//평균을 기준으로 성적순으로 정렬하여 출력하세요. 
		//------------------- 
		//이름   성별  국어  영어 수학 총점 평균 등수
		//최태산  남자  100  0   50  150 50  1
		System.out.println("7. 학생 성적 등수 및 랭킹을 정렬하세요.");
		String[] studentName = {"studentA", "studentB", "studentC", "studentD", "studentE"};
		String[] studentSex = {"남자", "여자", "남자", "여자", "남자"};
		int[] kor = {60, 80, 50, 100, 90};
		int[] eng = {30, 40, 30, 70, 20};
		int[] math = {70, 30, 20, 10, 10};
		int[] totArr = {0, 0, 0, 0, 0};
		double[] avgArr = {0, 0, 0, 0, 0};
		
		int[] index = {0, 0, 0, 0, 0};
		
		for(int i = 0, size = studentName.length; i < size; i++) {
			totArr[i] = kor[i] + eng[i] + math[i];
			avgArr[i] = totArr[i] / 3.0;
			
			if(i > 0) {
				for(int j = 0, jSize = i; j < jSize; j++) {
					
					if(totArr[i] > totArr[j]) {
						index[i]++;
					} else {
						index[j]++;
					}
				}
			}
		}
		
		for(int i = index.length - 1, k = 1; i >= 0; i--, k++) {
			for(int j = 0, jSize = index.length; j < jSize; j++) {
				if(index[j] == i) {
					System.out.println("name : " + studentName[j] + " / tot : " + totArr[j] + " / 등수 : " + k);
					break;
				}
			}
		}

		
	}
}
