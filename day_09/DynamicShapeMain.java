package day_09;
/*
 * 도형 정보 클래스를 작성하세요
 * calc로 분리해서 계산
 * 도형 정보 클래스 : 도형 종류, 넓이, 둘레 :정보 출력 메소드 void ppp()
 * clac() 메소드를 오버라이딩 하세요
 * 도형의 종류 사각형, 원, 삼각형
 * */
class DyShape{
	String name;
	int border, area;
	
	DyShape(String name){
		this.name = name;
	}
	
	void calc() {}
	
	void ppp() {
		calc();
		String ttt = "도형 : "+ name+", 둘레 : "+border+", 넓이 : "+area;
		System.out.println(ttt);
		System.out.println("--------------------");

	}
	
}
	

class DyRect extends DyShape{
	public DyRect() {
		super("사각형");
	}
	
	void calc(int h, int w){
		border = 2 * (h + w);
		area = h * w ;
	}
	
}
class DyCircle extends DyShape{
	public DyCircle() {
		super("원");
	}
	
	void calc(int r){
		double PI = 3.14;
		border = (int)(2 * r * PI);
		area = (int)(r * r * PI) ;
	}
	
}
class DyTriangle extends DyShape{
	public DyTriangle() {
		super("삼각형");
	}
	
	void calc(int h, int w, int r){
		border = (h + w + r);
		area = h * w / 2;
	}
	
}

public class DynamicShapeMain {

	public static void main(String[] args) {
		DyRect dr = new DyRect();
		dr.calc(4, 5);
		dr.ppp();
		DyCircle dc = new DyCircle();
		dc.calc(5);
		dc.ppp();
		DyTriangle dt = new DyTriangle();
		dt.calc(5, 6, 8);
		dt.ppp();

	}

}
