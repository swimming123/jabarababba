package day_06;

//멤버 : 계속 사용할 변수를 주로 사용함
//매개 : 호출 시 변경 가능,  지역 : 변경 불가함

class MethodVar{
	//멤버변수 : 메소드 들의 공유 정
	int aa = 10, cc = 30;
	String bb = "나는문엉";
	void meth_1(int a, int b, String cc) {// int a, int b 매개변수 
										  // int c: 매개변수와 멤버변수 중첩 가능, 매개변수로 인식
		int m = 135; //지역변수 - 외부변수
		// int b = 8888; 매개변수와 지역변수 중첩 불가
		String bb = "사슴벌레"; // 지역변수와 멤버변수 중첩가능 -지역변수로 인식
		
		
		//멤버변수 접근 가능
		// this : 멤버요소 접근자 > 매개변수, 지역변수와 중첩되었을 때 멤버요소 호출 시 사용
		System.out.println("meth_1() 시작 : "+aa+", "+this.bb+bb+", "+this.cc+", "+a+", "+b+", "+m+cc+bb);
		
		if (true) {
			int k = 246; //내부변수
			System.out.println("if문 : "+aa+", "+this.bb+bb+", "+this.cc+", "+a+", "+b+", "+m+k+cc);
		}
		
		aa++;
		System.out.println("meth_1() 끝 : "+aa+", "+this.bb+bb+", "+a+", "+b+", "+m+cc);
	}
	
	void meth_2() {
		//System.out.println("meth_1() 시작 : "+aa+", "+bb+", "+cc+", "+a);
		// ㄴ 다른 메소드의 매개변수 접근 불가 : meth_1의 a 접근 불가!
		aa++;
		System.out.println("meth_1() 끝 : "+aa+", "+bb+", "+cc);
//		System.out.println(a); // 다른 메소드의 매개변수 접근 불가
//		System.out.println(m); // 다른 메소드의 지역변수 접근 불가
	}
	
}

public class MethodVarMain {

	public static void main(String[] args) {
		MethodVar mv1 =  new MethodVar();
		MethodVar mv2 =  new MethodVar();
		
		mv1.aa = 1111;
		mv2.bb = "나는 상어닷";
		
		
		System.out.println("mv1 : "+mv1.aa+", "+ mv1.bb);
		System.out.println("mv2 : "+mv2.aa+", "+ mv2.bb);
		
		mv1.meth_1(400, 500, "풍뎅이");
		mv1.meth_2();
		System.out.println("mv1 : "+mv1.aa+", "+ mv1.bb+", "+ mv1.cc);
	}

}
