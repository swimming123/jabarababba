package day_06;

class MethodExam{
	
	void exam(String name, int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		int avg = tot / 3;
		System.out.println(name+" : "+kor+", "+eng+", "+mat+", "+tot+", "+avg);
	}
	
}

public class MethodExamMain {

	public static void main(String[] args) {
		MethodExam me = new MethodExam();
		me.exam("윤수영", 79, 86, 97);
		me.exam("윤자영", 67, 69, 49);
		me.exam("윤다영", 72, 66, 99);
		me.exam("윤가영", 77, 56, 39);
		me.exam("윤나영", 74, 06, 89);
		me.exam("윤구영", 17, 56, 59);
		me.exam("윤두영", 57, 66, 39);
		me.exam("윤주영", 79, 86, 90);
	}

}
