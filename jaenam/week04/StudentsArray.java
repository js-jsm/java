package jaenam.week04;

class Student {
	String name;
	String gender;
	int kor;
	int eng;
	int mat;
	int tot;
	float avg;
	int rank;
	String res;
}

class Grades {
	Student[] students;
	
	public Grades(String[] names, String[] genders, int[] kor, int[] eng, int[] mat) {
		this.students = new Student[names.length];
		
		for(int i = 0; i < names.length; i++) {
			Student student = new Student();
			student.name = names[i];
			student.gender = genders[i];
			student.kor = kor[i];
			student.eng = eng[i];
			student.mat = mat[i];
			student.tot = kor[i] + eng[i] + mat[i];
			student.avg = (float) (student.tot * 100 / 3) / 100;
			this.students[i] = student;
		}
	}
	
	public String getRanks() {
		String result = "이름\t성별\t국어\t영어\t수학\t총합\t평균\t순위\n";
		
		for(int i = 0; i < this.students.length; i++) {
			Student si = this.students[i];
			for(int j = 0; j < this.students.length; j++) {
				Student sj = this.students[j];
				if(si.avg < sj.avg) si.rank += 1;
			}
		}
		
		for(int i = 0; i < this.students.length; i++) {
			Student student = this.students[i];
			int j = student.rank;
			
			Student sj = this.students[j];
			sj.res = student.name + "\t" + student.gender + "\t" + student.kor + "\t" + student.eng + "\t"
					+ student.mat + "\t" + student.tot + "\t" + student.avg + "\t" + (student.rank + 1) + "\n";
		}
		
		for(Student s : this.students) {
			result += s.res;
		}
		
		return result;
	}	
}

public class StudentsArray {
	public static void main(String[] args) {
		String[] names = {"가가멜", "나랏님", "다래끼", "라미란", "마구간"};
		String[] genders = {"남", "여", "남", "남", "여"};
		int[] kor = {100, 80, 50, 65, 85};
		int[] eng = {90, 90, 80, 70, 90};
		int[] mat = {95, 85, 80, 40, 70};
		Grades g1 = new Grades(names, genders, kor, eng, mat);
		System.out.println(g1.getRanks());
		
		String[] names2 = {"가가레이디", "나란말", "다죽자", "라랄랄", "마징가"};
		String[] genders2 = {"남", "여", "여", "남", "여"};
		int[] kor2 = {100, 80, 70, 60, 85};
		int[] eng2 = {90, 90, 100, 70, 90};
		int[] mat2 = {95, 85, 80, 65, 70};
		Grades g2 = new Grades(names2, genders2, kor2, eng2, mat2);
		System.out.println(g2.getRanks());
	}
}
