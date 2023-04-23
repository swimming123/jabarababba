package day_05;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		// 배열 변수 선언 및 초기화
		int [] arr1 = {11, 44, 22, 33, 11};
		//           new int [] {11, 44, 22, 33, 11}
		
		System.out.println(a);
		System.out.println(arr1); // [   I    @    ea30797 : 
//								     배열 자료형 구분  hashCode  출력 -> 주소
		
		System.out.println(arr1[0]); // 배열호출
		System.out.println(arr1[1]); // 배열호출
		System.out.println(arr1[2]); // 배열호출
		System.out.println(arr1[3]); // 배열호출
		System.out.println(arr1[4]); // 배열호출
		//System.out.println(arr1[5]); // 없는 인덱스 호출 시 에러
		
		System.out.println(arr1.length);//원소개수
		// arrays + option+space + arrays import > toString()
		System.out.println(Arrays.toString(arr1));
		
		arr1[1] = 234; //원소대입
		System.out.println(Arrays.toString(arr1));
		
		//arr1 = 123;
		//arr = [123, 123, 23]; 배열 초기화는 배열 선언 시에만 가능
		
		int [] arr2 = new int [5]; // 초기값을 0으로 배열변수 선언 및 초기화
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
		int [] arr3;
		//arr = {111, 333, 555} // 안됨안됨
		arr3 = new int[4];
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
		
		int [] arr4;
		arr4 = new int[] {123, 234, 345};
		System.out.println(arr4);
		System.out.println(Arrays.toString(arr4));
		
		arr4 = new int[] {1010, 1020, 1030, 1040}; //주소변경
		System.out.println(arr4);
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		
		System.out.println("--------------");
		
		for (int i = 0; i<arr4.length; i++) { // 원소의 순서를 알 수 있음
			System.out.println(arr4[i]);
		}
		
		System.out.println("--------------");
		
		for (int b : arr4) { // 원소의 순서를 알 수 없음
			System.out.println(b);
		}
	}

}
