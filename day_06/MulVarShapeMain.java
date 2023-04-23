package day_06;

public class MulVarShapeMain {

	public static void main(String[] args) {
		int [][] lines = {
				  
				   {5},
				   {5,6},
				   {5,6,8},
				   {10,4},
				   {8},
				   {10,6,13}
				  };
		
		String [] name = new String [lines.length];
		int [][] res = new int[lines.length][2];
		
		double PI = 3.141592;
		for (int i = 0; i < lines.length; i++) {
			switch(lines[i].length) {
			case 1:
				name[i] = "원";
				res[i][0] = (int)(lines[i][0] * lines[i][0] * PI);
				res[i][1] = (int)(lines[i][0] * 2 * PI);
				//System.out.println("원일때");
				break;
			case 2:
				name[i] = "직사각형";
				res[i][0] = lines[i][0] * lines[i][1];
				res[i][1] = (lines[i][0] + lines[i][1]) * 2 ;
			//	System.out.println("직사각형일때");
				break;
			case 3:
				name[i] = "직각삼각형";
				res[i][0] = lines[i][0] * lines[i][1] / 2;
				res[i][1] = lines[i][0] + lines[i][1] + lines[i][2] ;
		//		System.out.println("직각삼각형일때");
				break;
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(name[i]+" : "+res[i][0] +","+res[i][1]);
		}

	}

}
