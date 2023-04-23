package day_05;

public class ArrayForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {56, 78, 91, 83};
		int tot = 0;
		for (int i :arr) {
			tot += i;
//			System.out.println(i+":"+tot);
		}
		System.out.println(tot+":"+tot/arr.length);
		
		
		
		
		// 짝수들의 합과 평균을 구하시오
		// 88, 7, 36, 99, 14, 75, 89, 86, 42, 37, 51, 62
		
		int [] arr1 = {88, 7, 36, 99, 14, 75, 89, 86, 42, 37, 51, 62};
		int evenTotal = 0;
		int cnt = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) { // 짝수
				evenTotal += arr1[i];  //짝수 합 누적
				cnt++;
			} 
		}

		System.out.println("짝수 합 : " + evenTotal);

			
		System.out.println("짝수평균:"+evenTotal/cnt);
	}

}
