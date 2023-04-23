package day_09;

import java.util.Arrays;

class Stud{
	String kind, name;
	int [] jum;
	int tot, avg;
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t";
		ttt += tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

class GenStud extends Stud{
	public GenStud(String name, int kor, int eng, int mat){
		kind = "일반";
		this.name= name;
		jum = new int[] {kor, eng, mat};
		calc();
	}
	
	void calc() {
		tot = 0;
		for(int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
}

class SpecStud extends Stud{
	public SpecStud(String name, int kor, int eng, int mat){
		kind = "특기";
		this.name= name;
		jum = new int[] {kor, eng, mat};
		calc();
	}
	
	void calc() {
		tot = 0;
		avg = 0;
		double [] rate = {0.1, 0.2, 0.7};
		for(int i = 0; i< jum.length; i++) {
			tot += jum[i];
			avg += jum[i] * rate[i];
		}
	}
}

public class ExamMain {
	public static void main(String[] args) {
		Stud st = new Stud();
		GenStud st1 = new GenStud("윤수영", 28, 48, 90);
		SpecStud st2 = new SpecStud("윤수영", 28, 48, 90);
		st.ppp();
		st1.ppp();
		st2.ppp();
	}
}
