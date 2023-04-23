package day_07;

import java.util.Arrays;

class ClaOverload{
	void meth(int a, String b) {
		System.out.println("meth() 실행 : "+a+", "+b);
	}
	void meth(int a, String b, int c) {
		System.out.println("인수 개수가 다른 경우 : "+a+", "+b+", "+c);
	}
	void meth(String a, String b) {
		System.out.println("자료형이 다른 경우 : "+a+", "+b);
	}
	void meth(int a, int b) {
		System.out.println("자료형이 다른 경우2 : "+a+", "+b);
	}
	void meth(String a, int b, int c) {
		System.out.println("자료형이 다른 경우3 : "+a+", "+b+", "+c);
	}
	void meth(String a, int ... b) {
		System.out.println("가변 매개변수 : "+a+", "+b+", "+Arrays.toString(b));
	}
	
	/* overloading 불가
	 void meth(int a, String b) {
		System.out.println("meth() 실행 : "+a+", "+b);
	}
	 
	 리턴형은 overloading과 관련 없음
	 void meth(int a, String b) {
	 	return 1234;
	}
	
	매개변수 이름만 다른 것은 overloading 불가
	void meth(int a, String c) {
		
	}
	*/
}

public class OverloadingMain {

	public static void main(String[] args) {
		
		ClaOverload col = new ClaOverload();
		col.meth(10, "아기상어 뚜루룹뚜룹");
		col.meth(20, "마미상어 뚜루룹뚜룹", 333);
		col.meth("삼십", "대디상어 뚜루룹뚜룹");
		col.meth(10, 4);
		col.meth("할머니상어", 10, 4);
		col.meth("할아버지상어", 11, 22, 33, 44, 55, 66);
	}

}
