package day_07;

import java.util.Arrays;

class RetStud{
	String name;
	int [] jum;
	int tot, avg;
	
	void input(String name, int ...jum) {
		this.name = name;
		this.jum = jum;
	}
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

class RetStudMake{
	RetStud make(String name, int kor, int eng, int mat) {
		RetStud st = new RetStud();
		st.input(name, kor, eng, mat);
		st.calc();
		return st;
	}
	
}

public class RetExamMain {

	public static void main(String[] args) {
//		RetStud [] studs = {
//				new RetStud(), 
//				new RetStud(), 
//				new RetStud()
//		};
		System.out.println("이름"+"\t"+"점수"+"\t\t"+"총점"+"\t"+"평균");
		System.out.println("-------------------------------------");
		RetStudMake rsm = new RetStudMake();
		
		RetStud [] studs = {
				rsm.make("수영", 90, 89, 97),
				rsm.make("자영", 70, 78, 45),
				rsm.make("미영", 78, 75, 34),
				rsm.make("주영", 26, 45, 67),
				rsm.make("보영", 79, 0, 68)
		};
		
		for (RetStud st : studs) {
			st.ppp();
		}

	}

}
