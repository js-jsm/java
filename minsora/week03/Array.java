package array;

public class Array {
	public static void main(String [] args) {
		
		//1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		int [] arr1 = {1, 2, 3, 4, 5};
		int total = 0;
		
		for(int i=0; i<arr1.length; i++){
			total += arr1[i];
		}
		System.out.println("1번  : " + total);
		
		//2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
		int [][] arr2 = {
				{1, 2, 3},
				{1, 2, 3}
		};
		
		int total2 = 0;
		int count2 = 0;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++){
				total2 += arr2[i][j];
				count2++;
			}
		}
		System.out.println("2-1번: " + total2);
		System.out.println("2-2번: " + (total2/count2));
		
		//3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오.
		int [] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i=0; i<arr3.length; i++){
			int first = arr3[i];
			
			for(int j=0; j<arr3.length; j++){
				int second = arr3[j];
				
				for(int k=0; k<arr3.length; k++){
					int third = arr3[k];

					if(first == second || first == third || second == third){
						continue;
					} else {
						System.out.println(String.valueOf(first) + String.valueOf(second) + String.valueOf(third));
					}
				}
			}
		}
		
		//4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것.)
		int money = 54320;
		
			
			
		
		//5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};  의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.
		int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};
		
		for(int i=0; i<answer.length; i++){
			String starData = "";
	        
			for(int j=0; j<answer[i]; j++){
				starData += "*";
			}
			System.out.println(starData);
		}
		
		//6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.
		//{100, 100, 100},
		//{ 20,  70,   80},
		//{ 40,  35,   70},
		//{ 50,  40,   30}
		
		
		
		
		//7. 학생 성적 등수 및 랭킹을 정렬하세요. 
		//- 학생 수 5명 
		//- 학생 이름 
		//- 학생 성별
		//- 국어 성적 
		//- 영어 성적
		//- 수학 성적 
		//- 총점 
		//- 평균 
		
		//평균을 기준으로 성적순으로 정렬하여 출력하세요. 
		//------------------- 
		//이름   성별  국어  영어 수학 총점 평균 등수
		//최태산  남자  100  0   50  150 50  1
		
		
		
	}
}
