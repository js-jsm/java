package array;

public class Array {
	public static void main(String [] args){
		/*
		 * 
		1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
		3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오.
		4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것. 500,100,50,10)
		//욕심쟁이 알고리
		5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1}; 의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.
		6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.
		{100, 100, 100},
		{ 20,  70,   80},
		{ 40,  35,   70},
		{ 50,  40,   30}
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
		 * */
		//1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		int [] arr = {1,2,3,4,5};
		int value1 = 0;
		for(int i = 0; i < arr.length; i++){
			value1 += arr[i];
		}
		System.out.println(value1);
		
		//2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
		int [][] arr2 = {
				{10,20,30,40},
				{40,50,30,60}
			};
		int sum = 0,
			count = 0;
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[i].length; j++){
				sum += arr2[i][j];
				count++;
			}
		}
		System.out.println("sum : " + sum +", average : "+ sum/count);
		
		//3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오.
		//123 n = ;
		//fstNum
		//
		//[a,b,c,d,e]
		
		//1부터 9 사이의 첫번째 랜덤의 숫자를 새 배열에 담고 
		//배열을 순회하며 랜덤숫자와 같으면 해당 배열 인덱스에 첫번째 순서의 인덱스 숫자를 담고
		//랜덤숫자를 첫번째인덱스에 담는다.
		//3번 돌리고
		//0번째 돌릴 
		//arr3[0] = arr3[random], arr3[random] = arr3[0];
		//arr3[1] = arr3[random], arr3[random] = arr3[1];
		//arr3[2] = arr3[random]
		//random  -> arr3[random]  
//		int [] arr3 = {1,2,3,4,5,6,7,8,9};
//		for(int i = 0, randomNum, tmp; i < 3; i++){
//			randomNum = (int)Math.random() * 9 + 1;
//			tmp = arr3[randomNum];
//			arr3[i] = tmp;
//			arr3[randomNum] = i+1;
//		}		
		
		//4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것. 500,100,50,10)
		int money = 3670;
		int [] coin = {500,100,50,10};
		int result2 = 0;
		for(int v : coin){
			result2 += money/v;
			money = money%v;
		}
		System.out.println("4. " + result2);
		//500으로 값을 나눈값이 7 나머지값이 170원
		//100으로 값을 나눈값이 1 나머값이 70원
		//50 값 난눈 1 나머 20
		//10 2 0
				
		
		//5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1}; 의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.
		int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};
		String result3 = "";
		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < answer[i]; j++){
				result3 += "*";
			}
			result3 += "\n";
		}
		System.out.println(result3);
		
		//6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.
		
		
	}
}
