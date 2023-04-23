package day_09;

import java.util.Arrays;

class OverStud{
	String kind, name;
	int [] jum;
	int tot, avg;
	
	void calc() {}  // 정의
	
	void ppp() {
		calc(); // 정의만 한 것을 호출함
		// ㄴ 자식의 calc를 호출함!
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t";
		ttt += tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

class OverGenStud extends OverStud{
	public OverGenStud(String name, int kor, int eng, int mat){
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
class OverSpecStud extends Stud{
	public OverSpecStud(String name, int kor, int eng, int mat){
		kind = "특기";
		this.name= name;
		jum = new int[] {kor, eng, mat};
		calc();
	}
	
	void calc() { //override
		tot = 0;
		avg = 0;
		double [] rate = {0.1, 0.2, 0.7};
		for(int i = 0; i< jum.length; i++) {
			tot += jum[i];
			avg += jum[i] * rate[i];
		}
	}
}
public class OverExamMain {

	public static void main(String[] args) {
		OverStud st1 = new OverStud();
		OverGenStud st2 = new OverGenStud("수영이", 67, 87, 48);
		OverSpecStud st3 = new OverSpecStud("수영이", 67, 87, 48);
		st1.ppp();
		st2.ppp();
		st3.ppp();
		
	}

}
