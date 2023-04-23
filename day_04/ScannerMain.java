package day_04;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("문자열 입력 : ");
//		String ttt = sc.nextLine();
//		System.out.println("nextline : "+ ttt);
//		
//		System.out.println("문자열입력 : ");
//		ttt = sc.next();
//		System.out.println("next : "+ttt);
//		ttt = sc.next();
//		System.out.println("next : "+ttt);
		
//		System.out.print("정수 입력 : ");
//		int t = sc.nextInt();
//		System.out.println("nextint : "+ t);
//		
//		System.out.print("실수 입력 : ");
//		double dd = sc.nextDouble();
//		System.out.println("nextDouble : "+ dd);
		
//		System.out.print("Boolean 입력 : ");
//		boolean bb = sc.nextBoolean();
//		System.out.println("nextBoolean : "+ bb);
		
		
		//정수 > 문자열 입력 시 Next Line이 자동으로 실행되어벌임 >>> 압력 시 엔터를 쳐버려서
		System.out.print("정수 입력 : ");
		int t = sc.nextInt();
		System.out.println("nextint : "+ t);
		sc.nextLine(); // 숫자 값만 사용하고 엔터 값을 상쇄시키기
		
		System.out.print("문자열 입력 : ");
		String ttt = sc.nextLine();
		System.out.println("nextline : "+ ttt);
	}

}
