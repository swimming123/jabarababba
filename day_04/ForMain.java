package day_04;

public class ForMain {

	public static void main(String[] args) {
		//   초기화식  조건식  증감
		for(int i = 0;i<10;i++) {
			System.out.println("For 이지롱 "+i);
		}
		System.out.println("for 종료~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		int tot = 0;
		
		for (int a = 10; a <=100; a+=5) {
			tot += a;
			System.out.println(a+":"+tot);
		}
		System.out.println("for 종료~~~~"+tot);
		
		
		
		//1부터 100까지의 짝수들의 합 1
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%2==0) {
				sum += i;
			}
		}
		System.out.println("짝수의 합은 "+sum+"입니다.");
		
		//1부터 100까지의 짝수들의 합 2
		int sum2 = 0;
		for (int i=0; i<=100; i=i+2) {
			sum2 += i;
		}
		System.out.println("짝수의 합은 "+sum2+"입니다.");
		
		//1부터 100까지의 짝수들의 합 3
		int sum3 = 0;
		for (int i=1; i<=100; i=i+2) {
			i += i%2;
			sum3 += i;
		}
		System.out.println("짝수의 합은 "+sum3+"입니다.");
	}

}
