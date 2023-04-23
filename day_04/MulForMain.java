package day_04;

public class MulForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int h = 1; h<=12; h++) {
			System.out.println(h+"시");
			
			for(int m = 0; m<60; m++) {
				System.out.println(h+"시"+m+"분");
			}
		}
		
		//구구단
		System.out.println("2단부터 9단까지");
		for (int i=2; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println(" ");
		}
		System.out.println("----------------------------");
		// 1*1 2*1 3*1 4*1
		
		for (int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+" * "+i+" = "+j*i+"\t");
			}
			System.out.println(" ");
		}
		
		for (int i=1; i<=5; i++) {
			
		}
	}

}
