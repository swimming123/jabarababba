package day_05;

import java.util.Arrays;

public class ArrayAddressMain {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = a;
		
		int [] arr1 = {11,22,33,44};
		int [] arr2 = {11,22,33,44};
		int [] arr3 = arr1;  //shallow copy, 얕은복사 , 주소복사
		
		//deep copy , 깊은복사 
		//case 1
		int [] arr4 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr4[i] = arr1[i];
		}
		
		//case2
		int [] arr5 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr5, 0, arr1.length);
		
		//case3
		int [] arr6 = arr1.clone();
		

		System.out.println(a+","+b+","+c);
		System.out.println("arr1 "+arr1+Arrays.toString(arr1));
		System.out.println("arr2 "+arr2+Arrays.toString(arr2));
		System.out.println("arr3 "+arr3+Arrays.toString(arr3));
		System.out.println("arr4 "+arr4+Arrays.toString(arr4));
		System.out.println("arr5 "+arr5+Arrays.toString(arr5));
		System.out.println("arr6 "+arr6+Arrays.toString(arr6));
		
		a = 20;
		arr1[2] = 3030;
		
		System.out.println(a+","+b+","+c);
		System.out.println("arr1 "+arr1+Arrays.toString(arr1));
		System.out.println("arr2 "+arr2+Arrays.toString(arr2));
		System.out.println("arr3 "+arr3+Arrays.toString(arr3));
		System.out.println("arr4 "+arr4+Arrays.toString(arr4));
		System.out.println("arr5 "+arr5+Arrays.toString(arr5));
		System.out.println("arr6 "+arr6+Arrays.toString(arr6));
		
		System.out.println("a==b:"+(a==b));
		System.out.println("a==c:"+(a==c));
		System.out.println("arr1==arr2:"+(arr1==arr2));
		System.out.println("arr1==arr3:"+(arr1==arr3));
		System.out.println("arr1==arr4:"+(arr1==arr4));
		System.out.println("arr1==arr5:"+(arr1==arr5));
		System.out.println("arr1==arr6:"+(arr1==arr6));
		
	}

}
