package jsmine.task.dolen.week04;

/**
 * Created by imcts on 2017. 4. 2..
 */

class Student { //구조체
    String name;
    String sex;
    int kor;
    int eng;
    int math;
    int avg;
    int sum;
    int rank;
}

public class ArrayStudent {
    public static void main(String[] args) {
        Student [] students = new Student[5]; //  학생 5명을 넣을 공간을 선언하고 = 그 공간을 할당함;

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

        for(int i = 0; i < names.length; i++) {
            Student student = new Student();
            student.name = names[i];
            student.sex = sexs[i];
            student.kor = kors[i];
            student.eng = engs[i];
            student.math = maths[i];
            student.sum = student.kor + student.eng + student.math;
            student.avg = student.sum / 3;
            student.rank = 1;

            students[i] = student;
        }

        System.out.println("이름\t성별\t국어\t영어\t수학\t총점\t평균\t등수");

        //랭킹을 구해봅니다.
        for(int i = 0, len = students.length; i < len; i++) {

            for(int j = 0; j < len; j++) {

                if(students[i].avg > students[j].avg) {
                    students[j].rank += 1;
                }

            }

        }

        //등수대로 출력 합니다.
        for(int i = 0, r = 1, len = students.length; i < len; i++) {

            for(int j = 0; j < len; j++) {

                if(students[j].rank == r) {
                    System.out.println(
                            students[j].name + "\t" + students[j].sex + "\t" +  students[j].kor + "\t" + students[j].eng + "\t" + students[j].math + "\t" + students[j].sum + "\t" + students[j].avg + "\t" + students[j].rank
                    );

                    r++;
                    break;
                }

            }


        }



    }
}
