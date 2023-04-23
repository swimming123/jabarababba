package day_08;
// 작동 순서 : static > instance > 생성자
class ConAAA{
	int a = 10;
	int b = setB();
	static int sa = 1000;
	static int sb = setSB();
	
	ConAAA(int c){ // 생성자 정의, 기본생성자 필요시 반드시 정의해야 함
		a++;
		b++;
		sa++;
		sb++;
		System.out.println("사용자 정의 기본 생성자 실행 : "+a+", "+b+", "+sa+", "+sb);
	}
	
	ConAAA(){ // 생성자 정의, 기본생성자 필요시 반드시 정의해야 함
		a = 1000;
		b = 2000;
		
		System.out.println("사용자 정의 기본 생성자 실행 : "+a+", "+b+", "+sa+", "+sb);
	}
	ConAAA(int a, int b){ // @@@@@@@@@@@
		this.a = a;
		this.b = b;
		System.out.println("사용자 정의 기본 생성자 실행 : "+a+", "+b+", "+sa+", "+sb);
	}
	
	ConAAA(int a1, int a2, int b1, int b2){
		//int aa = 3; 생성자 위임 전 코드 실행 불가
		//ConAAA(a1+a2, b1+b2);
		this(a1+a2, b1+b2); //생성자 위임
		//this();  //생성자 위임은 1번만 가능함
		System.out.println("사용자 정의 생성자 실행 3");
	}
	
	
	
	
	int setB() {
		System.out.println("setB() 실행");
		return 22;
	}
	static int setSB() {
		System.out.println("setSB() 실행");
		return 2222;
	}
//	ConAAA(){ // 생성자 정의 (가장 마지막에 실행됨)
//		// 멤버변수 셋팅을 주로 함
//		a++;
//		b++;
//		sa++;
//		sb++;
//		System.out.println("기본 생성자 실행 : "+a+", "+b+", "+sa+", "+sb);
//	}
	void ppp() {
		System.out.println(a+", "+b+", "+sa+", "+sb);
	}
}

public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("--------------");
		ConAAA a1 = new ConAAA(44);
		System.out.println("--------------");
		ConAAA a2 = new ConAAA(55);
		System.out.println("--------------");
		// a1.ConAAA(); xx 생성자는 최초 생성시에만 호출된다. new ~ 에만 된다.
		ConAAA a3 = new ConAAA(555, 222);
		System.out.println("--------------");
		ConAAA a4 = new ConAAA(20, 30, 200, 300);
		System.out.println("--------------");
		a1.ppp();
		a2.ppp();
		a3.ppp();
	}

}
