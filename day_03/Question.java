package day_03;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		직급별 월급을 계산하시오
//		부장 50 과장 30 대리 20 사원 10 
//		우러급 기본급 + 기본급*보너스
//		직급과 기본급은 입력받아 처리
//		기본급 300, 직급 과장

		
		String pos = "과장";
		int basic = 300;
		double bonus = 0;
		
		switch(pos) {
		case "부장":
			bonus = 0.5;
			break;
		case "과장":
			bonus = 0.3;
			break;
		case "대리":
			bonus = 0.2;
			break;
		case "사원":
			bonus = 0.1;
			break;
		}

		int money = basic + (int)(basic * bonus);
		
		System.out.println(money);
		System.out.println("---------------------------------");
		
		
		//커피 종류 잔수 
		// 아메 2000 아시아3000 아프리카4000
		
		String menu = "아프리카노";
		int cups = 3, price = 0, total = 0;
		
		switch(menu) {
		case "아메리카노" : 
			price = 2000;
			break;
		case "아시아노" : 
			price = 3000;
			break;
		case "아프리카노" : 
			price = 4000;
			break;
		}
		total = price * cups;
		System.out.println(menu + ","+cups+"잔은 "+total+"원 입니다.");
		
		/*
		 * 
		 * 99
		 * 98
		 * 97
		 * 96
		 * 95
		 * 94
		 * 93
		 * 92 >> 9 수
		 * 91
		 * 90
		 * ----------------------
		 * 89
		 * 88
		 * 87
		 * 86 >> 8 우
		 * 85
		 * 84
		 * 83
		 * 82
		 * 81
		 * 80
		 * ----------------------
		 * 79
		 *  | >> 7 미
		 * 70
		 * ----------------------
		 * 69
		 *  | >> 6 양
		 * 60
		 * ----------------------
		 * 가
		 * */

		
		String name = "수영", grade;
		int kor = 99, eng = 99, mat = 88;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		double avg2 = (double)(int)(avg*100)/100;
		
		int ss = (int)avg/10;
		
		switch(ss) {
		case 10, 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
			break;
		}
		System.out.println("case종료~!");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println(name+" 학생의 점수 총점은 "+tot+", 평균은 "+avg2+"\n 등급은 "+grade+"입니다.");
		
		
		//학점쓰
		String name2 = "수영", grade2;
		double kor2 = 4.4, eng2 = 3.3, mat2 = 3.9;
		double grade1 = (kor2 + eng2 + mat2)/3;
		System.out.println(grade1);
		int ss2 = (int)grade1;
//		System.out.println(ss2);
				
		switch(ss2) {
		case 4:
			grade2 = grade1*10%10 >= 5 ?"A+":"A" ;
			break;
		case 3:
			grade2 = grade1*10%10 >= 5 ?"B+":"B" ;
			break;
		case 2:
			grade2 = grade1*10%10 >= 5 ?"C+":"C" ;
			break;
		case 1:
			grade2 = grade1*10%10 >= 5 ?"D+":"D" ;
			break;
		default:
			grade2 = "F";
			break;
		}
		System.out.println(name2+" 학생의 학점은 "+grade2+"입니다.");
				
		
		double jum = 3.8;
		System.out.println((int)(jum*2));
		String grade3;
		
		switch((int)(jum*2)) {
		case 9:
			grade3 = "A+";
			break;
		case 8:
			grade3 = "A";
			break;
		
		case 7:
			grade3 = "B+";
			break;
		case 6:
			grade3 = "B";
			break;
			
		case 5:
			grade3 = "C+";
			break;
		case 4:
			grade3 = "C";
			break;
			
		case 3:
			grade3 = "D+";
			break;
		case 2:
			grade3 = "D";
			break;
			
		default:
			grade3 = "F";
			break;
		}
		System.out.println(jum+" : "+grade3);
	}
	}
// 연산자계산 속도가 제어문보다 짱빠름!!!!!!!!!!!!!

