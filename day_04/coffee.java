package day_04;

import java.util.Scanner;

public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String menu = null;
		int cost=0;
		
		while(true) {
			System.out.print("1번: 아메리카노, 2번 : 아프리카노, 3번 : 아시아노(0입력시 종료) ");
			int i = sc.nextInt();
			if(i==0) {
				break;
			}
		
		
			System.out.print("수량을 입력하세요.(0입력시 종료) : ");
			int j = sc.nextInt();
			if(j==0) {
				break;
			}
			//switch로 다시 풀어보기
			if (i==1) {
				menu = "아메리카노";
				cost = 1000;
			} else if (i==2) {
				menu = "아프리카노";
				cost = 2000;
			} else if (i==3) {
				menu = "아시아노";
				cost = 3000;
			}
			System.out.println(menu+", "+j+"잔 의 가격 : " + cost*j);
			
		}
		
	}

}
