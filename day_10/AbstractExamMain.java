package day_10;

import java.util.Arrays;

abstract class AbsStud{
	final String kind, name;
	final int [] jum;
	int tot, avg;
	
	public AbsStud(String kind, String name, int ... jum) {
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}
	
	abstract void calc(); // 계산하는 메소드 abstract
	
	final void ppp() { // 츌력용 메소드 final, 자동계산하라고 clac메소드 호출
		calc();
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
}
class AbsGenal extends AbsStud{

	AbsGenal(String name, int kor, int eng, int mat) {
		super("일반", name, kor, eng, mat);
	}

	void calc() { //반드시 재정의 해야 함
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
}
class AbsSpec extends AbsStud{ // error : AbsSpec 부모생성자 , calc 메소드 재정의,,,
	AbsSpec(String name, int kor, int eng, int mat, int art){
		super("예체능", name, kor, eng, mat, art);
	}
	void calc() {
		tot = 0;
		avg = 0;
		double [] rate = {0.05, 0.1, 0.15, 0.7};
		for (int i = 0; i < rate.length; i++) {
			tot += jum[i];
			avg += jum[i]*rate[i];			
		}
	}
}

public class AbstractExamMain {

	public static void main(String[] args) {
		AbsStud [] sts = {
			new AbsGenal("하나", 71,67,89),
			new AbsSpec("원", 62, 49, 58, 62),
			new AbsGenal("둘", 55,64,24),
			new AbsSpec("투", 68, 97, 48, 52),
			new AbsGenal("셋", 66,55,66),
			new AbsSpec("쓰리", 69, 29, 48, 62),
			new AbsGenal("넷", 71,66,89),
			new AbsSpec("풔", 26, 94, 87, 92),
			new AbsGenal("다섯",25,67,89),
			new AbsSpec("파잎", 86, 69, 48, 25),
			new AbsGenal("여섯", 77,44,89),
			new AbsSpec("식스", 66, 29, 38, 2),
		};
		
		for (AbsStud st : sts) {
			st.ppp();
		}

	}

}