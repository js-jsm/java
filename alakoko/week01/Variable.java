//변수 문제 
//1. 주민등록번호를 숫자로 저장하려 한다. 
//   변수를 선언하고 자신의 주민등록번호를 초기화 하는 코드를 작성하시오.
//2. 메인 메소드를 작성하시오.

package homework;

public class Variable {
	public static void main(String [] args){
		
		String identifyNo;
		identifyNo = "870908-2123456";
		
		System.out.println("identifyNo : " + identifyNo);
		
		String birthday = identifyNo.substring(0,6);
		String lastNo = identifyNo.substring(7);
		
		System.out.println(birthday);
		System.out.println(lastNo);

		int toIntBirthDay = Integer.parseInt(birthday);
		int toIntLastNo = Integer.parseInt(lastNo);
		
		System.out.print(toIntBirthDay);
		System.out.print(toIntLastNo);
		
	}
}
