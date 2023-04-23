package day_04;

public class ForBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BIG : for (int b = 100; b < 500; b+=100) {
			System.out.println("b 시작 : "+ b);
			
			SMALL : for (int s = 1; s < 5; s++) {
				System.out.println("\t s 시작 : "+ s);
//				if(s == 3) {
//					break; // s for문 탈출할 때 사용
//				}
				if(b == 200) {
					// break; //작은 for문 탈출 ;
					break BIG; // 큰 For 문 탈출
				}
				System.out.println("\t s  끝: "+ s);
			}
//			if(b == 200) {
//				break; // b for문 탈출할 때 사용
//			}
			System.out.println("b  끝: "+ b);
		}
		System.out.println("-------종료------");
	}

}
