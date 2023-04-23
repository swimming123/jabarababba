package day_07;
// 가변매개변수를 사용하여 숫자를 입력받아
//최대값, 최소값, 평균, 총점을 구하시오

class nums{
	void meth(int ...arr) {
		int tot = 0;
		int max = arr[0];
		int min = arr[0];
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
			tot += i;
		}
		System.out.println("합계 : "+ tot+", 평균 : "+ tot/arr.length+", 최대 : "+ max+", 최소 : "+ min);
	}
	
}


//class Nums{
//	void meth(int ...arr) {
//		int tot = 0, cnt = 0;
//		for (int i : arr) {
//			for (int j=i+1 : arr) {
//				if (arr[i+1] <= arr[i]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					cnt++;
//				} //if close
//			} // for j close
//			
//		} // for close
//		for (int i : arr) {
//			tot += i;
//		}
//		System.out.println("arr의 총합 : "+tot);
//		System.out.println("arr의 평균 : " + (tot/cnt));
//		System.out.println("arr의 최소값 : " + arr[0]);
//		System.out.println("arr의 최대값 : " + arr[-1]);
//		
//	}
//}
public class quize {

	public static void main(String[] args) {
//		Nums n = new Nums();
//		n.meth(48, 56, 79, 12, 45, 9, 7, 81, 32, 100, 54, 56);
		
		nums nn = new nums();
		nn.meth(48, 56, 79, 12, 45, 9, 7, 81, 32, 100, 54, 56);

	}

}
