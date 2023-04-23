package day_07;

import java.util.Arrays;

class ParamVar{
	void meth_1(int a, int b) {
		System.out.println("meth_1() : "+a+", "+b);
	}
	void meth_2(int a, int [] arr) {
		System.out.println("meth_2() : "+a+", "+Arrays.toString(arr));
	}
	//int ...arr : 가변 매개변수
	//arr 이후의 매개변수들으르 배열로 처리 (얘 뒤에 다른변수 선언할 수 없다)
	void meth_3(int a, int ...arr) {
		System.out.println("meth_3() : "+a+", "+Arrays.toString(arr));
	}
	void meth_4(int a, int [] arr, int b) {
		System.out.println("meth_4() : "+a+", "+b+", "+Arrays.toString(arr));
	}
	// 가변 매개변수 뒤에 다른 매개변수를 정의할 수 없다!
//	void meth_5(int a, int ...arr, int b) {
//		
//	}
	// 가변매개변수는 1개만 가능~
//	void meth_6(int a, int ...arr1, int ...arr2) {
//	
//}
	void meth_7(int a, int [] arr1, int [] arr2, int [] arr3, int b) {
		System.out.println("meth_7() 시작 : "+a+", "+b);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println("meth_7() : 끝 ");
	}
	void meth_8(int a, int [] arr1, int [] arr2, int ...arr3) {
		System.out.println("meth_8() 시작 : "+a);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println("meth_8() : 끝 ");
	}
//	void meth_9(int a, int [] arr1, int ...arr3, int [] arr2) {
//		error 입니다.	가변 매개변수는 맨 뒤에~
//	}
}



public class ParamVarMain {

	public static void main(String[] args) {
		// 가변 매개변수
		ParamVar pv  = new ParamVar();
		pv.meth_1(10, 20);
		pv.meth_2(100, new int[] {11, 22, 33, 44});
		pv.meth_3(100, new int[] {11, 22, 33, 44});
		//pv.meth_2(111, 777, 888, 999); // error
		pv.meth_3(111, 777, 888, 999); //arr = new int []{777, 888, 999}
		pv.meth_4(1010, new int[] {12, 23, 34, 45}, 2020);
		pv.meth_7(1, new int[] {99, 88, 77, 66}, new int[] {55, 44, 33, 22}, new int[] {01, 02, 03}, 2);
		pv.meth_8(1, new int[] {99, 88, 77, 66}, new int[] {55, 44, 33, 22}, 22, 33, 44, 55, 66);
	}

}
