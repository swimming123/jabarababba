package day_05;

import java.util.Arrays;

public class ArrayAppendMain {

	public static void main(String[] args) {

		int [] arr1 = {23,123,56,789,34,567,8,45,325};
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		
		int cnt = 0;
		for (int i : arr1) {
			if(i>=100) {
				cnt++;
				//System.out.println(i);
			}
		}
		//System.out.println(cnt);
		int [] arr2 = new int[cnt];
		cnt = 0;
		for (int i : arr1) {
			if(i>=100) {
				arr2[cnt] = i;
				cnt++;
				
			}
		}
		
		System.out.println("arr2:"+Arrays.toString(arr2));
		
		//점수 : 87,65,73,82,46,98,88,65,72,34,91,79,45,67
		// 70~80점대 배열을 구현하세요 --> 높은 점수순으로 정렬
		
		arr1 = new int[] {87,65,73,82,46,98,88,65,72,34,91,79,45,67};
		cnt = 0;
		for (int i : arr1) {
			if(i >= 70 && i < 90) {
				cnt++;
				//System.out.println(i);
			}
		}
		arr2 = new int[cnt];
		
		cnt = 0;
		for (int i : arr1) {
			if(i >= 70 && i < 90) {
				arr2[cnt] = i;
				cnt++;
				
			}
		}
		
		
		for (int me = 0; me < arr2.length; me++) {
			for (int you = me+1; you < arr2.length; you++) {
				if(arr2[me] < arr2[you]) {
					int buf = arr2[me];
					arr2[me] = arr2[you];
					arr2[you] = buf;
				}
			}
		}
		System.out.println("arr2:"+Arrays.toString(arr2));
	}

}
