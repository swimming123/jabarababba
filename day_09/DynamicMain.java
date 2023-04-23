package day_09;

class DyPar{
	String a = "부모a", b = "부모b";
	void meth_1() {
		System.out.println("부모 meth_1() 실행 : "+a+", "+b);
	}
	void meth_2() {
		System.out.println("부모 meth_2() 실행 : "+a+", "+b);
	}
}

class DyChild1 extends DyPar{
	String a = "자식1a", c = "자식1c";
	void meth_1() {
		System.out.println("자식1 meth_1() 실행 : "+a+", "+c);
	}
	void meth_3() {
		System.out.println("자식1 meth_2() 실행 : "+a+", "+c);
	}
}

class DyChild2 extends DyPar{
	int a = 100, d = 400;
	void meth_1() {
		System.out.println("자식2 meth_1() 실행 : "+a+", "+d);
	}
	void meth_4() {
		System.out.println("자식2 meth_2() 실행 : "+a+", "+d);
	}
}

public class DynamicMain {

	public static void main(String[] args) {
		DyPar pp = new DyPar();
		DyPar pc1 = new DyChild1();
		//DyPar c1p = new DyPar(); 부모로 생성해서 자식으로 ~ 
		DyChild1 cc1 = new DyChild1();
		DyChild2 cc2 = new DyChild2();
		
		System.out.println("pp : "+pp.a+", "+pp.b/* + ", " + pp.c */);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		
		System.out.println("pc1 : "+pc1.a+", "+pc1.b/* + ", " + pc1.c */);
		pc1.meth_1();
		pc1.meth_2();
		//pc1.meth_3();
		
		cc1.c = "son_c";
		System.out.println("cc1 : "+cc1.a+", "+cc1.b + ", " + cc1.c );
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		
		DyPar pcc1 = cc1; // Upcasting 자동 형 변환, 묵시적 형 변환
		//System.out.println("pcc1 : "+pcc1.a+", "+pcc1.b+", "+pcc1.c );
		System.out.println("pcc1 : "+pcc1.a+", "+pcc1.b);
		pcc1.meth_1();
		pcc1.meth_2();
		//pcc1.meth_3();
		
		DyChild1 cpcc1 = (DyChild1)pcc1; // Downcasting 강제 형 변환, 명시적 형 변환
		System.out.println("cpcc1 : "+cpcc1.a+", "+cpcc1.b+", "+cpcc1.c );
		cpcc1.meth_1();
		cpcc1.meth_2();
		cpcc1.meth_3();
		
		//DyChild1 cpp = (DyChild1)pp; error 코드 진행에 문제가 생긴다.
		//어떤 클래스에 있는지 알아보기
		System.out.println("pp.getClass() : "+pp.getClass());
		System.out.println("pcc1.getClass() : "+pcc1.getClass());
		
		System.out.println("pp instanceof DyPar : "+(pp instanceof DyPar));
		System.out.println("pp instanceof DyChild1 : "+(pp instanceof DyChild1)); //false
		System.out.println("pcc1 instanceof DyPar : "+(pcc1 instanceof DyPar));
		System.out.println("pcc1 instanceof DyChild1 : "+(pcc1 instanceof DyChild1));
		
		System.out.println("------------------------");
		cc1.c = "son_c";
		System.out.println("cc1 : "+cc1.a+", "+cc1.b + ", " + cc1.c );
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		System.out.println("cc2 : "+cc2.a+", "+cc2.b + ", " + cc2.d );
		cc2.meth_1();
		cc2.meth_2();
		cc2.meth_4();
		
		DyPar npp = cc1;
		System.out.println("npp : "+npp.a+", "+npp.b);
		npp.meth_1();
		npp.meth_2();
		
		npp = cc2;
		System.out.println("npp : "+npp.a+", "+npp.b);
		npp.meth_1();
		npp.meth_2();
		
	}

}
