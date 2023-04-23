package day_05;

import java.util.Arrays;

public class MulArrayMain {

	public static void main(String[] args) {
		
		String [][] arr = {									//1차원
			{"0_0",		"0_1",		"0_2",		"0_3"},		//arr[0]
			{"1_0",		"1_1",		"1_2",		"1_3"},		//arr[1]
			{"2_0",		"2_1",		"2_2",		"2_3"}		//arr[2]
//2차원		arr[?][0]  arr[?][1]  arr[?][2]  arr[?][3]
		};
		
		System.out.println("arr:"+arr);
		System.out.println("arr.length : "+arr.length);
		System.out.println("arr[0] : "+arr[0]+Arrays.toString(arr[0])+","+arr[0].length);
		System.out.println("arr[1] : "+arr[1]+Arrays.toString(arr[1])+","+arr[1].length);
		System.out.println("arr[2] : "+arr[2]+Arrays.toString(arr[2])+","+arr[2].length);
		//System.out.println("arr[3] : "+arr[3]);
		
		System.out.println("arr[1][2]:"+arr[1][2]);
		
		System.out.println("기본 for----------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] "+arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr["+i+"]["+j+"] "+arr[i][j]);
			}
		}
		
		System.out.println("향상된 for----------------");
		
		for (String[] sub : arr) {
			System.out.println(sub);
			for (String  ttt : sub) {
				System.out.println(ttt);
			}
		}
	}

}
