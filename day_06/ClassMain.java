package day_06;


//클래스 정의 ...1
class ClaAAA{
	int abc = 10; //멤버변수, 필드(상태)
	String efg = "아기상어";
	int [] arr = {12,22,12,23};
	//메서드(동작, 연산)
	void meth_1() {
		System.out.println("ClaAAA.meth_1() 입니다.");
	}
	void meth_2() {
		System.out.println("ClaAAA.meth_2() 입니다.");
	}
} //ClaAAA Close


public class ClassMain {
	public static void main(String[] args) {
		// 인스턴스 변수 선언 ...2
		ClaAAA a1;
		ClaAAA a2 = new ClaAAA(); //선언과 동시에생성
		// System.out.println(a1); error
		
		
		// 인스턴스 생성 및 주소 대입 ...3
		a1 = new ClaAAA();
		System.out.println(a1);
		System.out.println(a2);
		
		a1.abc = 1111; //같은 클래스를 따로따로 각각 사용할 수 있다~!
		a2.efg = "나는문어";
		
		// 인스턴스 멤버 호출 ...4
		System.out.println("a1 : "+a1.abc+", "+a1.efg);
		a1.meth_1();
		a1.meth_2();
		System.out.println("a2 : "+a2.abc+", "+a2.efg);
		a2.meth_1();
		a2.meth_2();

	}//main close
} //ClassMain Close
