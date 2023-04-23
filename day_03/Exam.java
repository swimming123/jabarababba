package day_03;

public class Exam {

	public static void main(String[] args) {
		int no = 21;
		int kor = 91, eng = 99, mat = 92;
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
		
//		90 80 70 60 
		
		String grade = avg3>=90 ? "수 " : 
			avg3>=80 ? "우 " :
			avg3>=70 ? "미 " : 
			avg3>=60 ? "양 " : 
			"가 " ;
		System.out.println("평균 : "+avg3+", 성적 : "+grade);
		
		// 이름 국어 영어 수학 총점 평균
		// 평균 : 수우미양가 + 소수점
		// 등급 우 > 모든 과목 점수 80 이상 (균등)
		
		String name = "수영", grade2;
		int kor2 = 91, eng2 = 99, mat2 = 92;
		int tot2 = kor2 + eng2 + mat2;
		double avg4 = (double)tot2 / 3;
		double avg5 = (double)(int)(avg4*100)/100;
	
		if (avg2 > 90) {
			grade2 = "수";
		}else if (avg2 > 80) {
			grade2 = "우";
			if (kor2 >= 80 && mat2 >= 80 && eng2 >=80) {
				grade2 += "(균등)";
			}
		}else if (avg2 > 70) {
			grade2 = "미";
		}else if (avg2 > 60) {
			grade2 = "양";
		}else {
			grade2 = "가";
		}
		System.out.println(name+" 학생의 점수 총점은 "+tot2+", 평균은 "+avg5+"\n 등급은 "+grade2+"입니다.");
		System.out.println("국어:"+kor2);
		System.out.println("영어:"+eng2);
		System.out.println("수학:"+mat2);

	}
	
}

