package day_06;

import java.util.Arrays;

public class MulVarArrMain {

	public static void main(String[] args) {
		int [] arr1 = {11, 22, 33, 44};
		int [] arr2, arr3;
		int [][] big1 = {
				{123, 456},
				{777, 888, 999}
		};
		int [][]big2 = {
			{1000, 2000, 3000}, 
			new int[5],
			arr1, // shallow copy
			//big1 X
			big1[1],
			//arr2 X
			arr3 = new int[] {101, 202},
			arr1.clone()  //deep copy
		};
		System.out.println("변경전>>>");
		System.out.println("arr1:"+arr1+"=>"+Arrays.toString(arr1));
		//System.out.println("arr2:"+arr1+"=>"+Arrays.toString(arr1));
		System.out.println("arr3:"+arr3+"=>"+Arrays.toString(arr3));
		
		System.out.println("big1 : "+big1+","+big1.length);
		for (int[] arr : big1) {
			System.out.println(arr+", "+arr.length);
			System.out.println("big1:"+arr+"=>"+Arrays.toString(arr));
		}
		System.out.println("big2 : "+big2+","+big2.length);
		for (int[] arr : big2) {
			System.out.println("big2:"+arr+"=>"+Arrays.toString(arr));
		}
		arr1[1] = 2323;
		arr3[0] = 1100;
		big1[1][2] = 9876;
		big1[0][1] = 34555;
		big2[2][3] = 4545;
		big2[3][0] = 7654;
		big2[4][1] = 4100;
		
		System.out.println("변경후>>>");
		System.out.println("arr1:"+arr1+"=>"+Arrays.toString(arr1));
		//System.out.println("arr2:"+arr1+"=>"+Arrays.toString(arr1));
		System.out.println("arr3:"+arr3+"=>"+Arrays.toString(arr3));
		
		System.out.println("big1 : "+big1+","+big1.length);
		for (int[] arr : big1) {
			System.out.println(arr+", "+arr.length);
			System.out.println("big1:"+arr+"=>"+Arrays.toString(arr));
		}
		System.out.println("big2 : "+big2+","+big2.length);
		for (int[] arr : big2) {
			System.out.println("big2:"+arr+"=>"+Arrays.toString(arr));
		}

	}

}
