package day_09;
//부모 : 도형 이름 넓이 둘레 출력 메소드
//자식 : 사각형 (가로세로), 원(반지름), 삼각형(밑변,높이,빗변)
class Shape{
	String name;
	int border, area;
	
	void ppp() {
		String ttt = "도형 : "+ name+", 둘레 : "+border+", 넓이 : "+area;
		System.out.println(ttt);
		System.out.println("--------------------");
	}
	
}

class Rect extends Shape{
	public Rect(int w, int h) {
		name = "사각형";
		border = 2 * (w + h);
		area = w * h ;
	}
	
}

class Circle extends Shape{
	public Circle(int r) {
		name = "원";
		double PI = 3.14;
		border = (int)(2 * r * PI);
		area = (int)(r * r * PI) ;
	}
}

class Triangle extends Shape{
	public Triangle(int w, int h, int r) {
		name = "직각삼각형";
		border = w + h + r;
		area = (w * h)/2 ;
	}
	
}


public class ShapeMain {

	public static void main(String[] args) {
		Rect r = new Rect(2, 3);
		r.ppp();
		Circle c = new Circle(2);
		c.ppp();
		Triangle t = new Triangle(2, 3, 5);
		t.ppp();
		

	}

}
