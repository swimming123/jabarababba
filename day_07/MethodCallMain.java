package day_07;

// Last In First Out :스택 특징
class MethodCall{
	
	int a = 1000;
	void meth_1() { //meth_2의 c를 부르지 못함.
		int b = 10;
		System.out.println("meth_1() 시작"+a+", "+b);
		meth_2();
		a++;
		b++;
		System.out.println("meth_1() 끝"+a+", "+b);
	}
	void meth_2() { // meth_1의 b를 부르지 못함.
		int c = 100;
		System.out.println("\t meth_2() 시작"+a+", "+c);
		meth_3();
		a++;
		c++;
		System.out.println("\t meth_2() 끝"+a+", "+c);
	}
	void meth_3() {
		System.out.println("\t\t meth_3() 시작"+a);
		a++; // meth_3의 끝 다음으로 출력되는 a 가 ++되어 나옴
		
		System.out.println("\t\t meth_3() 끝"+a);
	}
	
} //class methodcall close

public class MethodCallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCall mc = new MethodCall();
		mc.meth_1();
		System.out.println(mc.a);

	}

}
