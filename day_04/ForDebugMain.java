package day_04;

import java.util.Iterator;

public class ForDebugMain {

	public static void main(String[] args) {
		int tot = 0;                        //....1
		System.out.println("For문 이전");     //....2
		
		for (int i = 0; i < 30; i += 10 ) {
			// i = 0  초기값은 한번만       .....3
			// i(0) < 30                .....4 
			//                  i+10 ........8
			// i(0) < 30                .....9
			int a = 4;                // ....5, 10
			//for 문 내부에서의 변수 선은은 for문이 돌때마다 선언, 소멸을 반복함
			
			System.out.println(i+a);  
			//                 0+4 .....6
		   
			//                 10+4 ....11
			//a 소멸 ...7, 12
		}
		
		System.out.println("For문 종료");
		// 반폭문 같은 문법울 이해할 때 디버그 모드를 사아면 이해하기 편하다.
	}

}
