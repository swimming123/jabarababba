package day_08;

class SelfCall{
	
	String pre = "";
	
	int meth(int no) {
		int res = 0;
		if (no % 2 == 0) {
			res = no;
		}
		String myPre = pre;
		pre+="\t";
		System.out.println(myPre + "meth 시작 : "+no+", "+res);

		if(no > 0) { 			//조건
					 // no-1 : 증감
				res += meth(no-1); //재귀호출
		}
		System.out.println(myPre + "meth 끝 : "+no+", "+res);
		return res;
	}
}

public class SelfCallMain {

	public static void main(String[] args) {
		SelfCall sc = new SelfCall();
		
		int rr = sc.meth(5); //초기값 : 4
		System.out.println("rr : "+rr);
		
		//스택구조로 출력되는 메소드, 스택의 출력을 그려서 이해하기, 스택의 메모리 반환
		
		// 짝수들의 합을 구하세요
	}

}
