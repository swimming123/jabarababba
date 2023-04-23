package day_06;

import java.util.Arrays;

class ClaStud{
	String name;
	int [] jum = new int [3];
	int tot;
	double avg;
	
	void ppp() {
		String ttt = name + "\t";
			   ttt += Arrays.toString(jum)+"\t";
			   ttt += tot+"\t"+avg;
			   
		System.out.println(ttt);
	}
}

public class ClassExamMain {

	public static void main(String[] args) {
		ClaStud st1 = new ClaStud();
		st1.name = "윤수영";
		st1.jum[0] = 97;
		st1.jum[1] = 67;
		st1.jum[2] = 78;
		st1.tot = 0;
		for (int j : st1.jum) {
			st1.tot += j;
		}
		st1.avg = (double)st1.tot/st1.jum.length;
		
		ClaStud st2 = new ClaStud();
		st2.name = "윤자영";
		st2.jum[0] = 78;
		st2.jum[1] = 98;
		st2.jum[2] = 70;
		st2.tot = 0;
		for (int j : st2.jum) {
			st2.tot += j;
		}
		st2.avg = (double)st2.tot/st2.jum.length;
		
		st1.ppp();
		st2.ppp();
		

	}

}
