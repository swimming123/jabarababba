package day_07;

class PVNums{
	void meth(int no, int ...arr) {
		int tot = 0;
		int cnt = 0;
		
		for (int i : arr) {
			if (i % no == 0) {
				tot += i;
				cnt++;
				//System.out.println(i+", "+tot+","+cnt);
			} //if close
		} // for close
		
		System.out.println(no+"배수 합계 : "+tot+", 평균 : "+tot/cnt);
	} //meth close
} // PVNums class close

public class PVNumbersMain {

	public static void main(String[] args) {
		
		PVNums pvn = new PVNums();
		pvn.meth(3, 45, 7, 8, 12, 34, 15, 17, 21, 5);
		

	} //main close

} // PVNumbersMain class close
