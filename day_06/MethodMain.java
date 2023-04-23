package day_06;

class ClaMethod{
	//메소드 정의
	//메소드 이름 : meth_1
	//매개변수 : String a, boolean b
	//리턴형 : int
	int meth_1(String a, Boolean b) {
		System.out.println("meth_1() 실행 => param : "+a+", "+b+", ret : "+1234);
		
		return 1234; // 리턴형에 맞게 리턴값을 리턴
		
		//System.out.println("리턴 뒤에 실행 구문이 올 수 없다!");
	}
	
	//void : 리턴이 없다.
	void meth_2(){
		System.out.println("meth_2() 실행 => param : x, ret : x");
		// return 100; error
		return;
	}
	void meth_3(String a, int c) {
		System.out.println("meth_3() 실행 => param : "+a+", "+c+", ret : X");
	}
	double meth_4(){
		System.out.println("meth_4() 실행 => param : x, ret : 123.456");
		return 123.456;
	}
	
	
}// class ClaMethod Close

public class MethodMain {

	public static void main(String[] args) {
		
		ClaMethod cm = new ClaMethod();
		//cm.meth_1(null, null)
		// ㄴ 메소드 호출 : 호출 시 매게변수를 맞추어 대입
		cm.meth_1("abc", false);
		
		//메소드 실행 후 리턴값을 변수에 대입
		int rr = cm.meth_1("abc", true);
		System.out.println("rr : "+rr);
		
		//rr = cm.meth_2("abc", true); 매개변수 에러
		//rr = cm.meth_2(); 리턴 에러
		cm.meth_2();
		
		//cm.meth_3("엄마상어", true); // 매개변수 자료형 에러
		cm.meth_3("엄마상어", 135);
		
		double dd = cm.meth_4();
		System.out.println("dd : "+dd);
		
	} //main close

}// class MethodMain close
