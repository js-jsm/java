package javaHomeWork;
//2. 저번주에 내드렸던 학생 성적 관리를 배열이 아닌 클래스로 만들어서 동일하게 성적순으로 출력하세요. 
//
//지난주문제: 학생 성적 등수 및 랭킹을 정렬하세요. 
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
//————————— 
//이름   성별  국어  영어 수학 총점 평균 등수
//최태산  남자  100  0   50  150 50  1

class Student {
	private String name;
	private String sex;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private int rank;
	
	public Student(String name, String sex, int kor, int eng, int math) {
		this.name = name;
		this.sex = sex;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = kor + eng + math;
		this.avg = tot / 3;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}	
}

public class ClassHomework {
	public static void main(String[] args) {
		String[] studentName = {"studentA", "studentB", "studentC", "studentD", "studentE"};
		String[] studentSex = {"남자", "여자", "남자", "여자", "남자"};
		int[] kor = {60, 80, 50, 100, 90};
		int[] eng = {30, 40, 30, 70, 20};
		int[] math = {70, 30, 20, 10, 10};

		Student[] students = new Student[studentName.length];
		
		for(int i = 0, size = studentName.length; i < size; i++) {
			students[i] = new Student(studentName[i], studentSex[i], kor[i], eng[i], math[i]);
		}
		
		
		for(int i = 0, size = students.length; i < size; i++) {
			
			if(i > 0) {
				for(int j = 0, jSize = i; j < jSize; j++) {
					
					if(students[i].getTot() > students[j].getTot()) {
						students[i].setRank(students[i].getRank() + 1);
					} else {
						students[j].setRank(students[j].getRank() + 1);
					}
				}
			}
		}
		
		for(int i = students.length - 1, k = 1; i >= 0; i--, k++) {
			for(int j = 0, jSize = students.length; j < jSize; j++) {
				if(students[j].getRank() == i) {
					System.out.println("name : " + studentName[j] + " / tot : " + students[j].getTot() + " / 등수 : " + k);
					break;
				}
			}
		}
	}
	
}
