/*
도형 클래스를 추상화하여 구현하세요
부모 
클래스 : 도형
calc 추상메소드
ppp 변경불가

자식
클래스 : 
직사각형(가로, 세로)
원(반지름)

ppp() 로 출력
*/

package day_10;


abstract class AbsShape{
	final String name;
	int border, area;
	
	abstract void calc();
	
	AbsShape(String name){
		this.name = name;
	}
	
	final void ppp() { 
		calc();
		String ttt = "도형 : "+ name+", 둘레 : "+border+", 넓이 : "+area;
		System.out.println(ttt);
		System.out.println("--------------------");
	}

	
}

class AbsRect extends AbsShape{
	int w, h;
	public AbsRect(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
	}

	@Override
	void calc() {
		// TODO Auto-generated method stub
		border = 2 * (w + h);
		area = w * h;
		
	}

}

class AbsCir extends AbsShape{
	int r;
	AbsCir(double r) {
		super("원");
	}


	@Override
	void calc() {
		// TODO Auto-generated method stub
		double PI = 3.14;
		
		border = (int)(2 * r * PI);
		area = (int)(r * r * PI);
		
	}

}
public class AbsShapeMain {

	public static void main(String[] args) {
		AbsShape [] shapes = {
				new AbsRect(1, 2),
				new AbsCir(2),
				new AbsRect(3, 4),
				new AbsCir(3),
				new AbsRect(5, 6),
				new AbsCir(5),
				new AbsRect(7, 8),
				new AbsCir(7)
		};
		for (AbsShape sh : shapes) {
			sh.ppp();
		}
	}

}
