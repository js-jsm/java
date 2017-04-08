package jaenam.week04;

class Grades {
	String[] names;
	String[] genders;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] tot;
	float[] avg;
	int[] rank;
	String[] res;
	
	public void init(String[] names, String[] genders, int[] kor, int[] eng, int[] mat) {
		this.names = names;
		this.genders = genders;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = new int[names.length];
		this.avg = new float[names.length];
		this.rank = new int[names.length];
		this.res = new String[names.length];
		
		for(int i = 0; i < names.length; i++) {
			this.tot[i] = 0;
			this.avg[i] = 0;
			this.rank[i] = 0;
			this.res[i] = "";
		}
		
		this.getTotalAndAverage();
	}
	
	private void getTotalAndAverage() {
		for(int i = 0; i < this.names.length; i++) {
			this.tot[i] = this.kor[i] + this.eng[i] + this.mat[i];
			this.avg[i] = (float) Math.floor(this.tot[i] * 100 / 3) / 100;
		}
		
		for(int i = 0; i < this.names.length ; i++) {
			for(int j = 0; j < this.names.length; j++) {
				if(this.avg[i] > this.avg[j]) this.rank[j] += 1;
			}
		}
	}
	
	public String getRanks() {
		String result = "";
		for(int i = 0; i < this.names.length; i++) {
			int j = this.rank[i];
			this.res[j] = this.names[i] + "\t" + this.genders[i] + "\t"
					+ this.kor[i] + "\t" + this.eng[i] + "\t" + this.mat[i] + "\t"
					+ this.tot[i] + "\t" + this.avg[i] + "\t" + (this.rank[i]+1) + "\n";
		}
		for(String r : this.res) {
			result += r;
		}
		return result;
	}	
}

public class ArrClass {
	public static void main(String[] args) {
		Grades gg = new Grades();
		String[] names = {"가가멜", "나랏님", "다래끼", "라미란", "마구간"};
		String[] genders = {"남", "여", "남", "남", "여"};
		int[] kor = {100, 80, 50, 65, 85};
		int[] eng = {90, 90, 80, 70, 90};
		int[] mat = {95, 85, 80, 40, 70};
		gg.init(names, genders, kor, eng, mat);
		System.out.println(gg.getRanks());
		
		Grades gg2 = new Grades();
		String[] names2 = {"가가레이디", "나란말", "다죽자", "라랄랄", "마징가"};
		String[] genders2 = {"남", "여", "여", "남", "여"};
		int[] kor2 = {100, 80, 70, 60, 85};
		int[] eng2 = {90, 90, 100, 70, 90};
		int[] mat2 = {95, 85, 80, 65, 70};
		gg2.init(names2, genders2, kor2, eng2, mat2);
		System.out.println(gg2.getRanks());
	}
}
