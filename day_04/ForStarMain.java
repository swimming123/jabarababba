package day_04;

import java.util.Iterator;

public class ForStarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int line = 0; line < 5; line++) {
			for (int star = 0; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		System.out.println("----------------");
		
		//2번 5 4 3 2 1 
		for(int line = 0; line < 5; line++) {
			for (int star = 5; star > line; star--) {
				System.out.print("*");
			}
			System.out.println( );
		} 
		System.out.println("----------------");
		//3번 1 2 3 4 5 가 오른쪽에 붙음
		for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");                
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}

}
