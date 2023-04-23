package day_07;

import java.util.Arrays;

class RetData{
	String name;
	int age;
	boolean marriage;
	int [] arr;
	
	void input(String name,	int age, boolean marriage, int ...arr) {
		this.name = name;
		this.age = age;
		this.marriage = marriage;
		this.arr = arr;
	}
	
	void ppp() {
		System.out.println(name+", "+age+", "+marriage+", "+Arrays.toString(arr));
	}

}

class ClaReturn{
	void meth_1() {
		System.out.println("meth_1() 실행 1----------------");
		return; //1회 메소드 마지막에 실행해야 함.
		//System.out.println("meth_1() 실행 2");
		//return; 두번 안됨.
		//System.out.println("meth_1() 실행 3");
	}
	//상황에 따라 return 시점을 다르게 한 경우 : 조건에 맞는 리턴 1개만 실행
	void meth_2() {
		int a = 90;
		System.out.println("meth_2() 실행 1----------------");
		if (a > 80) {
			return;
		}
		System.out.println("meth_2() 실행 2");
		if (a > 30) {
			return;
		}
		System.out.println("meth_2() 실행 3");
	}
	int meth_3() {
		System.out.println("meth_3 실행");
		return 100;
	}
//	error 예제.
//	int, int meth_4() {
//		
//		return 100, 200;
//	}
//	(int, int) meth_5() {
//	
//	return (100, 200);
//}
	
	//리턴이 여러개인 경우
	//1. 자료형이 같은 경우
	// 배열로 같은 자료형 묶음을 리턴
	int [] meth_6() {
		int [] res = new int [] {11, 22, 33, 44};
		System.out.println("meth_6 실행"+res);
		return res;
	}
	
	//1. 자료형이 다른 경우
	// 클래스를 생성하여 리턴
	RetData meth_7() {
		
		System.out.println("meth_7 실행");
		RetData res = new RetData();
		res.input("윤수영", 27, false, 56, 78, 46);
		return res;
	}
} // Class ClaReturn closed

public class ReturnMain {

	public static void main(String[] args) {
		ClaReturn cr = new ClaReturn();
		cr.meth_1();
		cr.meth_2();
		int r3 = cr.meth_3();
		System.out.println("r3 : "+	r3);
		
		//배열 1개
		int [] arr1 = cr.meth_6();
		System.out.println("arr1 : "+Arrays.toString(arr1));
		arr1[1] = 2020;
		System.out.println("arr1 : "+Arrays.toString(arr1));
		
		//배열 2개째
		System.out.println("바로출력1 : "+Arrays.toString(cr.meth_6()));
		cr.meth_6()[2] = 3030;
		//배열 3개째
		System.out.println("바로출력2 : "+Arrays.toString(cr.meth_6()));
		// 배열을 받아올 때 변수 처리를 해서 사용해야지 배열을 바로 출력하면 계속 초기 상태의 배열을 호출하게 됨 
		
		RetData r7 = cr.meth_7();
		r7.ppp();
	}

}
