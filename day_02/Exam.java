package day_02;

public class Exam {
	public static void main(String[] args) {
		int no = 21;
		int kor = 78, eng = 81, mat = 92;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		double avg2 = avg;
		
		System.out.println("번호:"+no);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		System.out.println("평균2:"+avg2);
		System.out.printf("%.2f", avg2);
		
		System.out.println("평균2:"+avg2);
		//83.66666666666667
		
		double avg3 = (double)(int)(avg2*100)/100;
		System.out.println("평균3:"+avg3);
		//8366.666666666667
		//8366
		//8366.0
		//83.66

	}

}
