package day_09;

class Par{
	int a = 10;
	String b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
}

class Uncle{
	
	
}


class Child_1 extends Par{ //, Uncle {} > 다중상속 불가
		
	String c = "자식 c";
	
	void meth_3() {
		System.out.println("자식 meth_3() 실행");
	}
}

class Child_2 extends Par{
	
	String d = "자식2 d";
	
	void meth_4() {
		System.out.println("자식 meth_4() 실행");
	}
}

public class ExtendMain {

	public static void main(String[] args) {
		Par pp = new Par();
		Child_1 cc1 = new Child_1();
		Child_2 cc2 = new Child_2();
		System.out.println("pp : "+pp.a+", "+pp.b);
		//System.out.println("pp : "+pp.a+", "+pp.b+", "+pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3(); 부모에서 자식클래스 접근이 안됨
		
		//System.out.println("cc1 : "+cc1.c);
		System.out.println("cc1 : "+cc1.a+", "+cc1.b+", "+cc1.c);
		//형제 클래스의 멤버 접근 불가
		//System.out.println("cc1 : "+cc1.a+", "+cc1.b+", "+cc1.c+", "+cc1.d);
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		//cc1.meth_4();
		
		System.out.println("cc2 : "+cc2.a+", "+cc2.b+", "+cc2.d);
		//System.out.println("cc2 : "+cc2.a+", "+cc2.b+", "+cc2.c+", "+cc2.d);
		cc2.meth_1();
		cc2.meth_2();
		//cc2.meth_3();
		cc2.meth_4();


	}

}
