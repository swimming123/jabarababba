package day_09;

import java.util.Arrays;

class DyStud{
	String kind, name;
	int [] jum;
	int tot, avg;
	
	void calc() {} 
	
	void ppp() {
		calc(); 
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t";
		ttt += tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

class DyGenStud extends DyStud{
	public DyGenStud(String name, int kor, int eng, int mat){
		kind = "일반";
		this.name= name;
		jum = new int[] {kor, eng, mat};
	}
	
	void calc() {
		tot = 0;
		for(int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
}
class DySpecStud extends DyStud{
	public DySpecStud(String name, int kor, int eng, int mat){
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
public class DynamicExamMain {

	public static void main(String[] args) {
//		DyStud st1 = new DyStud();
//		DyGenStud st2 = new DyGenStud("수영이", 67, 87, 48);
//		DySpecStud st3 = new DySpecStud("수영이", 67, 87, 48);
//		st1.ppp();
//		st2.ppp();
//		st3.ppp();
		
		DyStud [] arr = {
				new DyStud(),
				new DyGenStud("수영이", 67, 87, 48),
				new DySpecStud("수영이", 67, 87, 48)
		};
		for (DyStud st : arr) {
			st.ppp();
		}
	}

}
