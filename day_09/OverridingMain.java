package day_09;
class OvGrand {
	String g1 = "할아버지g1";
	void meth_g1() {
		System.out.println("grandfather meth_g1() 실행 1");
	}
	String g2 = "할아버지g2";
	void meth_g2() {
		System.out.println("grandfather meth_g2() 실행 2");
	}
}
class OvPar extends OvGrand{
	String a = "부모a", b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행 3");
	}
	void meth_2() {
		System.out.println("부모 meth_2() 실행 4");
	}
	void meth_g2() {
		System.out.println("부모 meth_2() 실행 5");
	}
}

class OvChild extends OvPar{
	//b - hiding
	String b = "자식b", c = "자식 c";
	
	void meth_3() {
		System.out.println("자식 meth_3() 실행 6");
	}
	
	//overriding 상속관계일 때 메소드가 같을 때 자식의 클래스에서 이름이 동일한 
	//자식 메소드가 재정의 되는 것
	void meth_2() {
		System.out.println("자식 meth_2() 실행 7");
	}
	// this : 멤버 접근자. 클래스 정의부에서만 사용가능
	// super : 부모 접근자. 클래스 정의부에서만 사용가능
	void meth_tot() {
		System.out.println("자식 meth_tot() 시작 : "+a+", "+super.a+", " +this.a+", "+b+", "+this.b+", "+c+", "+super.b+"8");
		this.meth_1();
		this.meth_2();
		this.meth_3();
		System.out.println("--------------- 9");
		super.meth_1();
		super.meth_2();
		//super.meth_3();
		System.out.println("--------------- 10");
		System.out.println(g1+", "+g2+"11");
		meth_g1();
		meth_g2();
		
		System.out.println("자식 meth_tot() 끝 ---------------12");
	}
	
}


public class OverridingMain {

	public static void main(String[] args) {
		OvChild cc = new OvChild();
		System.out.println(cc.a+", "+cc.b+", "+cc.c+"13");
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		System.out.println("---------------14");
		System.out.println(cc.g1+", "+cc.g2+"15");
		cc.meth_g1();
		cc.meth_g2();
		System.out.println("---------------16");
		cc.meth_tot();
		//System.out.println(cc.this.a+", "+cc.super.b+", "+cc.c);
		//cc.this.meth_1();
		//cc.super.meth_2();
		
	}

}
