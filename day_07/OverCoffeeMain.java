/*
 * 커피 주문 함수를 정의 호출하세요.
 * 
 * order("아메리카노", 2) -> 1번째 주문(2잔) : 6000원
 * order("아메리카노", "아메리카노", "아시아노") -> 2번째 주문 : 6700원
 * 
 * 가격
 * 아메리카노 : 2000원
 * 아프리카노 : 2400원
 * 아시아노 : 2700원
 * 
 * */
package day_07;

//1. 문자를 입력하면 가격을 출력하는 메소드
class OverCoffee{
	int price(String menu) {
		int res;
		switch(menu) {
		case "아메리카노" :
			res = 2000;
			break;
		case "아프리카노" :
			res = 2400;
			break;
		case "아시아노" :
			res = 2700;
			break;
		default : 
			res = 0;
		}
		return res;
		
	}// int close
	
	int tot = 0;
	void order(String menu, int cnt) {
		int pp = price(menu);
		if (pp==0) {
			System.out.println("안팔아");
			return;
		}
		
		System.out.println(++tot + "번째 주문 : "+cnt+"잔, "+pp*cnt);
		
	}
	void order(String ...menus) {
		int money = 0;
		for (String mm : menus) {
			int pp = price(mm);
			if (pp==0) {
				System.out.println("안팔아");
				return;
			}
			money += pp;
		}
		
		
		System.out.println(++tot + "번째 주문 : "+menus.length+"잔, "+money);
		
	}
	
	
} // class overcoffee



public class OverCoffeeMain {

	public static void main(String[] args) {
		
		OverCoffee oc = new OverCoffee();
		//System.out.println(oc.price("아메리카노"));
		oc.order("아메리카노", 2);
		oc.order("카푸치노", 2);
		oc.order("아메리카노", "아메리카노", "아프리카노");
		oc.order("아메리카노", "휘핑크림얹은초코라떼", "아프리카노");
		oc.order("아메리카노", "아시아노", "아프리카노", "아시아노");
		
	}

}
