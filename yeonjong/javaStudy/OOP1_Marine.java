package javaStudy;


//static �� �ٿ��� �ϴ� ���
//�� �ν���Ʈ���� ���������� ���� ���� �����Ǿ�� �ϴ� ��� 	
public class OOP1_Marine {
	
	int x;
	int y;
	//��� ������ �ְ�ü�� 
	static int hp = 60;
	//��� ������ ���ݷ��� �����ؾ� �Ѵ�.	
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
