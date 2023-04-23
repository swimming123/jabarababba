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
 * 1. 문자를 입력하면 가격을 출력하는 메소드
 * 
 * */

package day_07;

class CoffeeOrder{
	int cnt = 0;
	
	void order(String coffee, int cups) {
		int price = 0;
		
			//switch(coffee)
			if (coffee == "아메리카노") {
				price = 2000;
			}else if (coffee == "아프리카노") {
				price = 2400;
			}else if (coffee == "아시아노") {
				price = 2700;
			}else {
				System.out.println("무언가 잘못되었습니다.");
			}
		cnt++;	
		int tot = price * cups;
		System.out.println(cnt+"번째 주문 : " + tot);
			
	}

	void order(String ...coffee) {
		String coffee[];
		
		int price = 0;
		int tot = 0;
		for(int i : coffee) {
			if (coffee[i] == "아메리카노") {
				tot += 2000;
			}else if (coffee[i] == "아프리카노") {
				tot += 2400;
			}else if (coffee[i] == "아시아노") {
				tot += 2700;
			}else {
				System.out.println("무언가 잘못되었습니다.");
			}
			
		}
			
		cnt++;	
		System.out.println(cnt+"번째 주문 : " + tot);
			
	}
}
	

public class CoffeeOrderMain {

	public static void main(String[] args) {
		CoffeeOrder co = new CoffeeOrder();
		co.order("아메리카노", 5);
		co.order("아메리카노", "아메리카노", "아프리카노");

	}

}
