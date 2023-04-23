package day_03;

public class switchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		switch(true) {} ㄴㄴ
//		switch(123.23) {} ㄴㄴ
//		switch('a') {} ㅇㅇ
//		switch("아기상어") {} ㅇㅇ
		switch(20) {
		case 30:
			System.out.println("30이지롱");
		case 20:
			System.out.println("20이지롱");
		case 10:
			System.out.println("10이지롱");
		case 50:
			System.out.println("50이지롱");
		}
		System.out.println("case종료~!");
//		case값 중첩 불
//		case 30:
//			System.out.println("30이지롱");
			
		switch(42) {
		case 30:
			System.out.println("30이지롱");
			break; // 참이면 탈출!
		case 20:
			System.out.println("20이지롱");
			break;
		case 10, 100: //여러 값도 가능하다~!
			System.out.println("10, 100이지롱");
			break;
		default : 
			System.out.println("기본값입니다 어디든 위치 할 수 이써!!!!");
		case 50:
			System.out.println("50이지롱");
			break;		
		}
		System.out.println("case종료~! 2222");
		//if, else if, else와 다른 점 : case의 순서가 상관없다. 같은 값을 찾기 때무네

	

	}
}
