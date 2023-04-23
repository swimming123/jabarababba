package day_08;


// 아빠 가져가기x 
// 딸아들 벌어오기x


class DragonMoney{
	
	String name;
	int myMoney = 0 ;
	static int mom = 100;
	static int papa = mom;
	
	// 아빠 x 
	void showMeTheMoney(int money) {
		if(name.equals("아빠")) {
			System.out.println("이사람이!!!!!!!");
			return;
		}
		
		myMoney += money;
		mom -= money;
		System.out.println(name+" : "+money+"만원 가져갈게~ (잔액 : "+myMoney+"만원)");
		System.out.println("\t남은금액 : "+mom);
	}
	
	// 딸아들 x
	void makeMoney(int money) {
		if(!name.equals("아빠")) {
			System.out.println("건강하게 자라다오~");
			return;
		}
		mom += money;
		System.out.println(money+"만원 벌어왔다. (잔액 : "+mom+"만원)");
	}
	
	
}

public class DragonMoneyMain {

	public static void main(String[] args) {
		DragonMoney son  = new DragonMoney();
		DragonMoney daughter  = new DragonMoney();
		DragonMoney papa  = new DragonMoney();
		
		son.name = "아들";
		daughter.name = "딸";
		papa.name  = "아빠";
		
		son.showMeTheMoney(13);
		son.makeMoney(22); //실행하면 안됨
		
		daughter.showMeTheMoney(12);
		daughter.makeMoney(1); //실행하면 안됨
		
		papa.showMeTheMoney(23); //실행하면 안됨
		papa.makeMoney(100);
		
		
		
	}

}
