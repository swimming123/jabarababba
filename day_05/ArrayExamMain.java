package day_05;

public class ArrayExamMain {

	public static void main(String[] args) {
		String [] name = {"현빈","원빈","투빈","김우빈","장희빈"};

		int [][] jum = {
				{67,68,61},
				{87,88,81},
				{77,78,71},
				{57,58,51},
				{97,98,91}
		};
		
		//int [] tot = new int[name.length];
		//int [] avg = new int[name.length];
		//0 - tot, 1 - avg
		int [][] res = new int[name.length][2];
		
		//연산부
		for (int i = 0; i < jum.length; i++) {
			//tot[i] = 0;
			res[i][0] = 0;
			for (int j : jum[i]) {
				//tot[i]+=j;
				res[i][0]+=j;
			}
			//avg[i] = tot[i]/jum[i].length;
			res[i][1] = res[i][0]/jum[i].length;
		}
		
		///출력부
		for (int i = 0; i < jum.length; i++) {
			String ttt = name[i]+"\t";
			for (int j : jum[i]) {
				ttt += j+"\t";
			}
			for (int j : res[i]) {
				ttt += j+"\t";
			}
			//ttt += tot[i]+"\t"+avg[i];
			System.out.println(ttt);
		}
	}

}
