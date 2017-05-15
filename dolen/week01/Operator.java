package jsmine.task.dolen.week01;

/**
 * Created by imcts on 2017. 3. 25..
 */
public class Operator {
    public static void main(String[] args) {
//      - 입력받은 수: 상수로 입력 합니다. ex: int a = 33;
        int input = 3333;

//      1. 입력받은 수에 따라 '양수', '음수', '0' 을 출력하는 코드를 삼항연산자를 이용하여 작성하시오.
        System.out.println(input < 0 ? "음수" : input == 0 ? "0" : "양수");

//      2. 입력받은 수의 백의 자리 이하를 버리는 코드를 작성하시오. (ex> 456 입력시 400 출력)
        System.out.println(input / 100 * 100); // 3333

//      3. 입력받은 수의 일의 자리를 1로 바꾸는 코드를 작성하시오. (ex> 777 입력시 771 출력)
        System.out.println(input / 10 * 10 + 1); // 777 -> 77.7 -> 77 -> 770 -> 77 + 1 -> 771

//      4. 입력받은 수보다 크면서 입력받은 수에 가장 가까운 10의 배수에서 입력받은 수를 뺀 수를 구하는 코드를 작성하시오.
        System.out.println(input / 10 * 10 + 10 - input); // 3333 -> 3340 - 3333 =>

//      5. 화씨를 섭씨로 변환하는 코드를 작성하시오. (공식은 ((f - 32) / 1.8))
        System.out.println((int) ((input - 32) / 1.8));

//      6. 대문자를 소문자로, 소문자를 대문자로 변경하는 코드를 작성하시오.
        String lower = "a"; //97
        String upper = "A"; //65

        System.out.println((char) (lower.charAt(0) - 32)); // a: 97   - 32 -> 65: A
        System.out.println((char) (upper.toCharArray()[0] + 32)); //97 -> a
    }
}

