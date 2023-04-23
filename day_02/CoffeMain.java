package day_02;

public class CoffeMain {
	public static void main(String[] args) {
		String coffeName = "아프리카노";
		boolean togo = true;
		char size = 'L';
		int price = 2100;
		int count = 3;
		// byte cnt = 3;
		int total = price * count;
		
		System.out.println("menu:"+coffeName);
		System.out.println("포장유무:"+togo);
		System.out.println("size:"+size);
		System.out.println("단가:"+price);
		System.out.println("수량:"+count);
		System.out.println("금액:"+total);
	}

}
