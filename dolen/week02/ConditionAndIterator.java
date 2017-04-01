package jsmine.task.dolen.week02;

/**
 * Created by imcts on 2017. 3. 25..
 */
public class ConditionAndIterator {
    public static void main(String[] args) {
        String result = "";
        String input = "";
        int sum = 0;
        int count = 0;

        //      1. 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
        for(int i = 1; i < 21; i++) { // 1 -> 20    i % 2 != 0 && i % 3 != 0
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }
        }

        System.out.println("1. question = " + sum);

//      2. 1 + (1 + 2) + (1 + 2 + 3 ) …. + (1 + 2 + …. + 10) 의 결과를 구하시오.
        sum = 0;

        for(int i = 1; i < 11; i++) {
            sum = i * (i + 1) / 2; //   n ( n + 1 ) / 2 == 1 ~ n 합
        }

        System.out.println("2. question = " + sum);

//      3. 1 + (-2) + 3 + (-4) ….. 이렇게 계속 더하였을 때 몇까지 더해야 총합이 100 이상이 나오는지 구하시오.
        sum = 0;
        count = 0;

        for(int i = 0, j = 0; sum < 100; i += 1, j = i % 2 == 0 ? i * -1 : i, count += 1) {
            sum += j;
        }

        System.out.println("3. question = " + count);

//      4. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.
        result = "";

        for(int i = 1; i < 7; i++) {
            for(int j = 1; j < 7; j++) {
                if(i + j == 6) {
                    result += "(" + i + ", " + j + ") ";
                }
            }
        }

        System.out.println("4. question = " + result);

//      5. 방정식 2x + 4y = 10 의 모든 해를 구하시오.
        result = "";

        for(int x = 1; x < 5; x++) {
            for(int y = 1; y < 5; y++) {
                if(2 * x + 4 * y == 10) {
                    result += "(x = " + x + ", y = " + y + ")" ;
                }
            }
        }

        System.out.println("5. question = " + result);

//      6. 숫자를 입력받아 각 자리의 합을 더한 결과를 출력하는 코드를 작성하시오. (ex> 12345 입력시 1 + 2 + 3 + 4 + 5 의 결과 출력)
        result = "";
        input = "12345";

        for(int i = 0, len = input.toCharArray().length; i < len; i++) {
            result += input.charAt(i);

            if(i < len - 1) {
                result += " + ";
            }
        }

        System.out.println("6. question = " + result);

//      7. 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 작성하시오.
//      (피보나치 수열이란 바로 전의 두 수를 더한 수가 다음 수가 되는 수열이다. 0, 1, 1, 2, 3, 5, 8, 13 …. )
        count = 10;
        sum = 0;

        for(int i = 0, n1 = 0, n2 = 1; i < count; i++) {
            if(i == 0) {
                sum = 0;
                continue;
            } else if(i == 1) {
                sum = 1;
                continue;
            }

            sum = n1 + n2;

            n1 = n2;
            n2 = sum;
        }

        System.out.println("7. question = " + sum);

//      8. 주어진 문자열이 숫자인지 판별하는 프로그램을 작성하시오.
        boolean isNumber = true;

        input = "3333a";

        for(char c : input.toCharArray()) {
            if(c < 48 && c > 57) { // <<<<< 48: 0, 49: 1, 50: 2.... 57: 9 <<<<
                isNumber = false;
                break;
            }
        }

        System.out.println("8. question = " + isNumber);


//      9. 숫자맞추기 게임
//          1) 컴퓨터는 1부터 100까지의 수 중 임의의 수를 지정합니다.
//          2) 사용자가 숫자를 입력 시 up, down 으로 지정된 수보다 큰지 작은지를 알려줍니다.
//          3) 사용자가 숫자를 맞추면 컴퓨터는 몇 번 만에 숫자를 맞추었는지 출력합니다.
        count = 0;

        for(int i = 0, in = 33, com = 80; i < 100; i++) {
            if(com < in) {
                in--;
            } else if(com > in) {
                in++;
            } else {
                break;
            }

            count++;
        }

        System.out.println("9. question = " + count);

///     10. 입력받은 수가 회문수가 맞는지를 검사하는 프로그램을 작성하시오.
//      (회문수(palindrome)란 ? 앞으로 읽어도 뒤로 읽어도 같은 수. ex> 12321)

        boolean isPalindrome = true;
        input = "12321"; //5

        for(int i = 0, len = input.length(), start = 0, end = len; i < len / 2; i++, start += 1, end -= 1) {

            if(input.charAt(start) != input.charAt(end - 1)) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("10. question = " + isPalindrome);
    }
}
