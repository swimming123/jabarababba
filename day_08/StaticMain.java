package day_08;

class ClaStatic{
	int a = 10;
	static int sa = 100;
	void meth_1(){
		System.out.println("meth_1() 실행");
	}
	
	static void meth_s1(){
		System.out.println("meth_s1() 실행");
	}
	
	void meth_2(){
		System.out.println("meth_2() 시작 : "+a+", "+sa);
		
		System.out.println("meth_2()  끝 -------");
	}
	
	static void meth_s2(){
		System.out.println("static meth_s2() 시작 : "+sa);
		//static 에서 instance 멤버 접근 불가
		//static method에서 a가 호출이 안된다.
		//static method에서는 static 변수만 호출을 할 수 있다.
		//meth_1();
		meth_s1();
		
		
		System.out.println("meth_s2()  끝 -------");
	}
	
}

public class StaticMain {
	public static void main(String[] args) {
		
		System.out.println("ClaStatic.sa : "+ClaStatic.sa);
		//System.out.println("ClaStatic.a : "+ClaStatic.a);
		ClaStatic.meth_s1();
		//ClaStatic.meth_1();
		ClaStatic.meth_s2();
		
		ClaStatic cs1 = new ClaStatic();
		ClaStatic cs2 = new ClaStatic();
		
		// static은 왠만하면 설계하지 말자.
		// 어디서든 접근할 수 있기 때문에 보안상 취약.
		cs1.a = 11;
		cs1.sa = 1111;
		System.out.println("cs1:"+cs1.a+", "+cs1.sa);
		cs1.meth_1();
		cs1.meth_s1();
		cs1.meth_2();
		cs1.meth_s2();
		System.out.println("cs1:"+cs2.a+", "+cs2.sa);
		cs2.meth_1();
		cs2.meth_s1();
		cs2.meth_2();
		cs2.meth_s2();
		
	}

}
