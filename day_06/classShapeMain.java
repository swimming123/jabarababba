//메소드 2개
// 직각삼각형 메소드, 원 메소드

package day_06;

class shape{
	
	void triangle(int h, int w) {
		// 직각삼각형의 빗변 구하기
		double clen = Math.sqrt( Math.pow(h, 2) + Math.pow(w, 2));
		int area = h * w / 2 ;
		double border = h + w + clen ;
		System.out.print("직각삼각형 넓이 : "+area+", 둘레 : ");
		System.out.printf("%.1f", border);
		System.out.println();
	}
	
	void circle(double r) {
		double area = r*r*3.14 ;
		double border = r*2*3.14;
		System.out.print("원 넓이 : "+area+", 둘레 : ");
		System.out.printf("%.1f", border);
		System.out.println();
	}
}

public class classShapeMain {

	public static void main(String[] args) {
		shape sh = new shape();
		sh.triangle(10,15);
		sh.triangle(20,15);
		sh.triangle(30,15);
		sh.circle(10);
		sh.circle(20);
		sh.circle(30);

	}

}
