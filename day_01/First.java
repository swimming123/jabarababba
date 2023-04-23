package day_01;

public class First {  //대표 클래스 시작

	public static void main(String[] args) { //main 메소드 시작
		
		// 주석 - 코드 진행에 영향을 주지 않는 구문
				//       설명이나 요청사항 등을 기재
				
				/*  --> 주석시작
				   주석구간
				 
				 
				  주석 끝 --> */
		
		System.out.println("첫번째 입니다.");
		//콘솔창에 출력하는 메소드
		
		//1. 숫자
		System.out.println(100);
		System.out.println(123.456);
		System.out.println(15+7);
		System.out.println(15-7);
		System.out.println(15*7);
		System.out.println(15/7);
		System.out.println(15%7);
		
		//2. 문자
		System.out.println('a');
		//System.out.println('');
		//System.out.println('abcd');
		System.out.println('가');
		System.out.println('★');
		System.out.println('日');
		
		//3. 문자열
		System.out.println("a");
		System.out.println("");
		System.out.println("abcdefg");
		System.out.println("100"+"50");
		
		//4. 서식문자
		/*
		 \'		'
		 \"		"
		 \t		탭
		 \n		줄바꿈
		 
		 * */
		System.out.println("나폴레옹은 \'이 산이 아닌데?\'라고 생각했다");
		System.out.println("나폴레옹은 \"불이야!\"라고 외쳤다");
		System.out.println("아기상어\t뚜루루 뚜루\n귀여운\t뚜루루 뚜루\n바닷속\t뚜루루 뚜루\n아기상어");
		
		
		System.out.println("장수풍뎅이"); //출력문 이후 줄바꿈 실행
		System.out.print("사슴벌레");	//출력문만 실행
		System.out.print("소벌레");
		System.out.print("양벌레");
		System.out.println("\n println");
		System.out.println();
		System.out.println("print 끝");
		//System.out.print();  출력내용이 없으면 에러
		
	}		//main 메소드 끝
	
}	//대표 클래스 끝