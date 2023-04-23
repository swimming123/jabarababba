package day_07;

class OverShape{
	void shape(int r) {
		double PI = 3.14;
		double area = r * r * PI;
		double border = r * 2 * PI;
		
		System.out.println("원넓이 : "+area+", 둘레"+border);
	}
	void shape(int w, int h) {
		
		int area = w * h;
		int border = 2 * ( w + h );
		
		System.out.println("직사각형 넓이 : "+area+", 둘레"+border);
	}
	void shape(int w, int h, int a) {
			
		int area = w * h / 2;
		int border = w + h + a;
		
		System.out.println("직각 삼각형 넓이 : "+area+", 둘레"+border);
	}
	
}

public class OverShapeMain {

	public static void main(String[] args) {
		OverShape os = new OverShape();
		os.shape(5);
		os.shape(5, 6);
		os.shape(5, 6, 8);

	}

}
