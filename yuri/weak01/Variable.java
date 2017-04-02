package homework;

public class Variable {

	public static void main(String [] args) {
		int personalNumber = 870203-2560211;
		long personalNumber2 = 870203_2560211L;
		int year = 0;
		int age = 14;
		
		System.out.println(personalNumber);
		System.out.println(personalNumber2);
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		double d = 85.4;
		int score = (int)d;
		
		System.out.println(score);
		System.out.println(d);
	}

}
