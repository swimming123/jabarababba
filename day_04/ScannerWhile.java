package day_04;

import java.util.Scanner;

public class ScannerWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tot = 0;
		while(true) {
			System.out.print("숫자입력 : (0입력시 종료) ");
			int i = sc.nextInt();
			
			if(i==0) {
				break;
			}
			
			tot += i;
		}
		System.out.println("종료 : "+ tot);
	}

}
