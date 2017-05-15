package javaStudy;

//문제1 클래스 만들기 
class SutdaCard {
	
	int num;
	boolean isKwang;
	
	public int info() {
		this.num = 10;  //1 ~ 10
		return this.num;
	}
	
	public SutdaCard() {}
	
	public SutdaCard(int num, boolean iskwang) {}	
	
	public void shuffle() {
		
	}
	
	public int pick(int[] arr) {
		
		int location = 0;
		
		return location;
	}
	
	public int pick() {
		
		int random = 0;
		
		return random;
		
	}
	
}

public class OOP1 {
	
	String name;
	String ban;
	String no;
	int kor = 100;
	int eng = 88;
	int math = 77;
	
	public void getTotal() {
		System.out.println("getTotal : " + (this.kor + this.eng + this.math));
	}
	
	public void getAverage() {
	
		double aver = (this.kor + this.eng + this.math) / 3.0;
		//소수점 둘째에서 반올림
		System.out.println("getAver : " + Math.round(aver * 100) / 100.0);
	}
	
	public static void main(String[] args) {
		
		OOP1 student = new OOP1();
		student.getTotal();
		student.getAverage();
	}

}
