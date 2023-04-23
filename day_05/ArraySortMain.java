package day_05;

import java.util.Arrays;

public class ArraySortMain {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		int buf = a;
		a = b;
		b = buf;
		
		System.out.println(a+":"+b);
		
		int [] arr = {88, 66, 99, 66, 55, 77};
		System.out.println("정렬전 : "+Arrays.toString(arr));
		int temp;
		
//		for (int i = 0; i<arr.length-1; i++) {
//			if (arr[i+1]<arr[i]) {
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1]=temp;
//			}
//		}
		for (int me = 0; me < arr.length; me++){
			System.out.println(me+":"+arr[me]+">");
			for (int you = me+1; you<arr.length; you++) {
				
				if(arr[me]>arr[you]) {
					int bb = arr[me];
					arr[me] = arr[you];
					arr[you] = bb;
				}
				System.out.print(arr[you]+",");
			}
			System.out.println("");
		}
				
		System.out.println("정렬후 : "+Arrays.toString(arr));
		//55, 66, 66, 77, 88, 99
		

	}

}
