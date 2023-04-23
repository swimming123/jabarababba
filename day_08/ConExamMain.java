package day_08;
class ConExam{
	
	String kind, name;
	int [] jum;
	int tot, avg;
	
	//최초 셋팅이나 계산을 할 때 사용하면 편하다.
	ConExam(String name, int kor, int eng, int mat){
		kind = "일반";
		this.name = name;
		jum = new int[] {kor, eng, mat};
		general();
	}
	void general() {
		tot = 0;
		for(int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	ConExam(String name, int kor, int eng, int mat, int art){
		kind = "예체능";
		this.name = name;
		jum = new int[] {kor, eng, mat};
		spec();
	}
	void spec() {
		double [] rate = {0.05, 0.1, 0.15, 0.7};
		tot = 0;
		avg = 0;
		for(int i = 0; i < rate.length; i ++) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t";
		for (int i : jum) {
			ttt += i + "\t";
		}
		ttt += tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

// 갖다쓰기 편해유 
public class ConExamMain {

	public static void main(String[] args) {
		ConExam [] studs = {
				new ConExam("윤수영", 99, 88, 77), 
				new ConExam("윤자영", 98, 68, 77), 
				new ConExam("윤희영", 89, 48, 67), 
				new ConExam("윤미영", 39, 28, 67), 
				new ConExam("윤규영", 59, 38, 17), 
				new ConExam("윤주용", 79, 85, 73, 99),
				new ConExam("윤주양", 79, 44, 24, 99),
				new ConExam("윤주영", 88, 85, 22, 99),
				new ConExam("윤주융", 79, 56, 73, 11)
		};
		for (ConExam sts : studs) {
			sts.ppp();
		}
	}

}
