package jsmine.task.dolen.week03;

/**
 * Created by imcts on 2017. 4. 2..
 */
public class Array {
    public static void main(String[] args) {
        int sum;
        String str;

        //1. 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오.
        int [] intArr = { 1, 2, 3, 4, 5 };
        sum = 0;

        for(int v : intArr)
            sum += v;

        System.out.println("1. question = " + sum);

        //2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
        int [][] question2 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8},
                {9, 10, 11, 12}
        };

        sum = 0;

        for(int [] questionInnerArr : question2) {
            for(int v : questionInnerArr) {
                sum += v;
            }
        }

        System.out.println("2. question = " + sum);


        //3. 배열을 사용하여 1 과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 작성하시오.
        intArr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        str = "";

        for(int i = intArr.length, MAX_COUNT = 3, len = i - 3, random, temp; i > len; i--) {
            random = (int) (Math.random() * 9);
            temp = intArr[i - 1];
            intArr[i - 1] = intArr[random];
            intArr[random] = temp;
        }

        for(int i = intArr.length, MAX_COUNT = 3, len = i - 3; i > len; i--) {
            str += intArr[i - 1];
        }

        System.out.println("3. question = " + str);


        //4. 금액 money 를 동전으로 변환할 때 각각 몇 개의 동전으로 변환이 가능한지 출력하라. (단, 동전의 갯수가 가장 작은 경우의 수를 구할 것.)
        int money = 3050;
        int cnt = 0;
        int [] moneys = {500, 100, 50, 10};
        str = "";

        for(int m : moneys) {
            cnt = money / m;
            str +=  m + "원" + cnt + "개 ";
            money -= m * cnt;
        }

        System.out.println("4. question = " + str);

        //5. 배열 int [] answer = {1, 4, 4, 3, 5, 4, 2, 1};  의 데이터를 읽고 각 숫자의 갯수만큼 *을 출력하는 코드를 작성하시오.
        intArr = new int [] {1, 4, 4, 3, 5, 4, 2, 1};
        str = "";

        for(int v : intArr) {

            for(int i = 0; i < v; i++) {
                str += "*";
            }

            str += "\n";
        }

        System.out.println("5. question = " + str);



        //6. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오.
        //{100, 100, 100},
        //{ 20,  70,   80},
        //{ 40,  35,   70},
        //{ 50,  40,   30}

        int [][] question6 = {
            {100, 100, 100},
            { 20,  70,  80},
            { 40,  35,  70},
            { 50,  40,  30}
        };

        int [][] questionResult = new int [question6.length + 1][];

        for(int i = 0, len = questionResult.length; i < len; i++) {
            if(i == len - 1) {
                //여기에서는 세로를 계산한다.
                questionResult[i] = new int [question6[i - 1].length + 1];

                for(int j = 0, result, jLen = questionResult[i].length; j < jLen; j++) {
                    result = 0;

                    for(int k = 0; k < jLen; k++) {

                        result += questionResult[k][j];

                    }

                    questionResult[i][j] = result;
                }

            } else {
                //여기에서는 가로를 계산한다
                questionResult[i] = new int [question6[i].length + 1];

                for(int j = 0, jLen = question6[i].length; j < jLen; j++) {
                    questionResult[i][j] = question6[i][j];

                    if(j == jLen - 1) {
                        sum = 0;

                        for(int value : questionResult[i])
                            sum += value;

                        questionResult[i][j + 1] = sum;
                    }
                }
            }
        }

        for(int [] arr : questionResult) {
            for(int value : arr) {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        //7. 학생 성적 등수 및 랭킹을 정렬하세요.
        //- 학생 수 5명
        //        - 학생 이름
        //        - 학생 성별
        //        - 국어 성적
        //        - 영어 성적
        //        - 수학 성적
        //        - 총점
        //        - 평균
        //
        //평균을 기준으로 성적순으로 정렬하여 출력하세요.
        //        -------------------
        //        이름   성별  국어  영어 수학 총점 평균 등수
        //최태산  남자  100  0   50  150 50  1

        str = "";

        String [] names = {
                "A",
                "B",
                "C",
                "D",
                "E"
        };

        String [] sexs = {
                "남",
                "여",
                "남",
                "여",
                "남"
        };

        int [] kors = {
                100,
                90,
                70,
                80,
                90
        };

        int [] engs = {
                100,
                80,
                70,
                80,
                50
        };

        int [] maths = {
                100,
                90,
                40,
                65,
                70
        };

        int [] avg = new int [names.length];

        int [] sumArr = new int [names.length];

        int [] rank = new int [names.length];


        System.out.println("이름\t성별\t국어\t영어\t수학\t총점\t평균\t등수");


        //평균을 구한다.
        for(int i = 0, len = names.length; i < len; i++) {
            sumArr[i] = kors[i] + engs[i] + maths[i];
            avg[i] = sumArr[i] / 3;
            rank[i] = 1;
        }

        //랭킹을 구해봅니다.
        for(int i = 0, len = names.length; i < len; i++) {

            for(int j = 0; j < len; j++) {

                if(avg[i] > avg[j]) {
                    rank[j] += 1;
                }

            }

        }

        //등수대로 출력 합니다.
        for(int i = 0, r = 1, len = names.length; i < len; i++) {

            for(int j = 0; j < len; j++) {

                if(rank[j] == r) {
                    System.out.println(
                            names[j] + "\t" + sexs[j] + "\t" +  kors[j] + "\t" + engs[j] + "\t" + maths[j] + "\t" + sumArr[j] + "\t" + avg[j] + "\t" + rank[j]
                    );

                    r++;
                    break;
                }

            }


        }



    }
}
