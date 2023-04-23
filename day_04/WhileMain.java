package day_04;

public class WhileMain {

	public static void main(String[] args) {
//		
//		int a = 5; //초기
//		while(a<10) { // 조건
//			System.out.println("while 실행 : "+a);
//			a++; //증감
		
		
		int a = 1;
		int tot = 0;
		while(a <= 100) {
			a+= a%2;
			tot +=a;
			System.out.println(a+":"+tot);
			a+=2;
		}
		System.out.println("1 > 100 짝수합계 : "+tot);
		
		// 1 ~ 20 까지 369게임 3, 6, 9, 13, 16, 19
		int b = 1;
		while (b<=20) {
			if (b%10 == 3 | b%10 == 6 | b%10 == 9 ) {
				System.out.println("짝");
			}else 
				System.out.println(b);
			b++;
		}
		// 1 ~ 20 까지 369게임 3, 6, 9, 13, 16, 19
		int c = 1;
		while (c<=20) {
			int one = c%10;
			int three = one%3;
			
			if (one!=0 && three==0 ) {
				System.out.println("짝");
			}else 
				System.out.println(c+","+one+","+three);
			c++;
		}
	}

}
