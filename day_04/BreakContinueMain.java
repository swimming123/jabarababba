package day_04;

public class BreakContinueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Break 시작 : "+i);
			if (i==2) {
				break;
			}
			
			System.out.println("Break End: "+i);
		}
		System.out.println("Break 종료");
		System.out.println("-------------------");
		//continue 보다 아래 if 문 조건을ㅆ서 해결하ㅡㄴ게 더 짧고 편함
		for (int i = 0; i < 5; i++) {
			System.out.println("Continue 시작 : "+i);
			if (i==2) {
				continue;
			}
			
			System.out.println("Continue End: "+i);
		}
		System.out.println("Continue 종료");
		System.out.println("-------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("if 시작 : "+i);
			if (i!=2) {
				System.out.println("if End: "+i);
			}
		}
		System.out.println("if 종료");
	}
	

}
