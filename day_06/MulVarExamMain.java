package day_06;

public class MulVarExamMain {

	public static void main(String[] args) {
		String [] name = {"수영", "자영", "선영", "아영", "지영"};
		
		int [][] jum = {
				{37, 58, 73, 96},
				{97, 63, 36},
				{97, 78, 53, 36},
				{37, 68, 93},
				{67, 68, 63, 66}
		};
		
		String [] kind = new String[name.length];
		int [][] res = new int[name.length][2];
		
		for (int i=0; i<res.length; i++) {
			res[i][0] = 0;
			for(int j=0; j<jum[i].length; j++) {
				//System.out.println(jum[i][j]);
				res[i][0] += jum[i][j];
			}
			//평균
			res[i][1] = res[i][0]/jum[i].length;
		}
		
		
		for (int i = 0; i<res.length; i++) {
			if(jum[i].length==3) {
				kind[i] = "일반";
			}
			else if(jum[i].length==4) {
				kind[i] ="특기생";
			}
		
		}
		
		//출력부
		for(int i=0; i<res.length; i++) {
			//String ttt = name[i]+"\t";
			String ttt = kind[i]+"\t"+name[i]+"\t";
			
			for(int j : jum[i]) {
				ttt += j + "\t";
			}
			
			if(jum[i].length == 3) {
				ttt+="\t";
			}
			
			for(int j : res[i]) {
				ttt += j + "\t";
			}
			
			System.out.println(ttt);
			
		};//for

	}//main

}//class
