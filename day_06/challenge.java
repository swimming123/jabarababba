package day_06;

class Box{
	int height = 0, width = 0; 
	void area() {
		int area = height*width;
		System.out.println("사각형의 넓이는 "+area+"입니다.");
	}
	void border() {
		int border = (height+width)*2;
		System.out.println("사각형의 둘레는 "+border+"입니다.");
	}
}

public class challenge {

	public static void main(String[] args) {
		Box a1 = new Box();
		a1.height = 5;
		a1.width = 6;
		a1.area();
		a1.border();

		Box a2 = new Box();
		a2.height = 10;
		a2.width = 7;
		a2.area();
		a2.border();
//	case 2:
//		name[i] = "직사각형";
//		res[i][0] = lines[i][0] * lines[i][1];
//		res[i][1] = (lines[i][0] + lines[i][1]) * 2 ;
//	//	System.out.println("직사각형일때");
//		break;	
//		
		
		
		
		
//		//도형의 넓이와 둘레를 출력해주세요
//		int [][] lines = {
//				{5}, {5,6}, {5,6,8}, {10,4}, {8}, {10,6,3}
//				
//				
//		};
//		String [][] name = new String[lines.length][];
//		//String [][] res = new String[name.length][2];
//		
//		for (int i = 0; i<lines.length; i++) {
//			if(lines[i].length==1) {
//				name[i] = "원";
////				for (int i=0; i<res.length; i++) {
////					res[i][0] = "원";
////					//넓이
////					for(int j=0; j<jum[i].length; j++) {
////						res[i][0] = lines[i]*lines[i]*3.14;
////					}
////					//둘레
////					res[i][1] = lines[i]*2*3.14;
////				}
//				//넓이 반지름*반지름*3.14
//				
//				//둘레 반지름*2*3.14 
//				name[i+1] = lines[i]*3.14;
//			}
//			else if(lines[i].length==2) {
//				name[i] ="직사각형";
////				for (int i=0; i<res.length; i++) {
////					res[i][0] = "직사각형";
////					//넓이
////					for(int j=0; j<jum[i].length; j++) {
////						res[i][0] = lines[i][0]]*lines[i][1];
////					}
////					//둘레
////					res[i][1] = (lines[i][0]+lines[i][1])*2;
////				}
////				//넓이 가로*세로
////				//둘레 (가로*세로)*2
//			}
//			else if(lines[i].length==3) {
//				name[i] ="직각삼각형";
////				for (int i=0; i<res.length; i++) {
////					res[i][0] = "직각함각형";
////					//넓이
////					for(int j=0; j<jum[i].length; j++) {
////						res[i][0] = lines[i][0]*lines[i][1]/2;
////					}
////					//둘레
////					res[i][1] = lines[i][0]+lines[i][1]+lines[i][2];
////				}
////				//넓이 밑변*높이/2
////				//둘레 밑변+높이+빗변
//			}
//			else {
//				System.out.println("뭔가 잘못되었습니다.");
//			}
//		
//		}
//		
//		for (int i=0; i<name.length; i++) {
//			System.out.println(name[i]);
//		}
//		
//		//넓이 배열
//		for (int i=0; i<res.length; i++) {
//			for (int j=0; j<i; j++) {
//				System.out.println(res[i][j]);
//			}
//		}
//		
//		//ver 2
//		for (int i=0; i<lines.length; i++) {
//			switch(lines[i].length) {
//			
//				int range = 0, area = 0;
//				case 1:
//					System.out.println("원일때 \t");
//					range = lines[i]+lines[i]*3.14;
//					area = lines[i]*2*3.14;
//					System.out.print("원넓이는 : "+ range);
//					System.out.print("원둘레는 : "+ area);
//					
//					break;
//				case 2:
//					System.out.println("직사각형 \t");
//					break;
//				case 3:
//					System.out.println("직각삼각형 \t");
//					break;
//			
//			} //switch close
//			
//			
//			
//			
//		} //for close

	} // main close

}// class close
