package day_10;

abstract class AbsPar{ //추상클래스
	void meth_1() {
		a = 1111;
		//c = 3333;  final 변수 대입 불가
		System.out.println("부모 meth_1() 실행:"+a+","+c);
	}
	
	abstract void meth_2(); //추상메소드 - 메소드 선언만 작성
							// 정의내용은 overriding 해야함
	
	final double meth_4(int aa, String bb) {
		
		System.out.println("부모 final meth_4() 실행:"+aa+","+bb);
		return (double)aa / 100;
	}
	
	int a = 10;
	//abstract int b = 20;
	final int c = 30;
	
}

class AbsChild extends AbsPar{
	
	int d = 4000;
	final int e = 5000;
	int f;
	final int g; //final 멤버변수 : 선언시 초기화 하거나 생성시 초기화 해야한다.
	
	public AbsChild() {
		d = 4444;
		//e = 5555;  초기화된 final 변수 대입 불가
		f = 6666;
		g = 7777;
	}
	
	
	void meth_2() {		//추상메소드 재정의 -- 자식클래스는 반드시 재정의 해야 한다.
		System.out.println("자식 meth_2() 실행");
	}
	void meth_3() {
		System.out.println("자식 meth_3() 실행");
	}
	
	/* final 메소드 overriding 불가
	final double meth_4(int aa, String bb) {
		
		System.out.println("자식 final meth_4() 실행:"+aa+","+bb);
		return (double)aa / 100;
	}*/
}

public class AbstractMain {

	public static void main(String[] args) {
		AbsPar pp = new AbsPar() {//추상클래스로 생성시 추상메소드를 재정의 해야한다.
			void meth_2() {
				System.out.println("부모 생성시 재정의 meth_2() 실행");
			}
		};
		AbsChild cc = new AbsChild();
		pp.a = 11;
		//pp.c = 33; final 변경 불가
		System.out.println("pp:"+pp.a+","+pp.c);
		pp.meth_1();
		pp.meth_2();
		double dd = pp.meth_4(123,"아기상어");
		System.out.println("dd:"+dd);
		System.out.println("---------------");
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		dd = cc.meth_4(456,"엄마상어");
		System.out.println("dd:"+dd);
	}

}