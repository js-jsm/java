package javaStudy;


//static 을 붙여야 하는 경우
//각 인스턴트들이 공통적으로 같은 값이 유지되어야 하는 경우 	
public class OOP1_Marine {
	
	int x;
	int y;
	//모든 마린의 최고체력 
	static int hp = 60;
	//모든 마린의 공격력은 동일해애 한다.	
	static int weapon = 10;
	static int armor = 0;
	
	
	static void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		
		OOP1_Marine mar = new OOP1_Marine();
		
	}
}
