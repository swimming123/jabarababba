package day_08;
/*
 * 정보 : 넓이, 둘레
 * 초기화 메소드 : 가로, 세로
 * 계산메소드, 출력메소드
 *직사각형의 넓이, 둘레를 출력하시오
 * */
class MethodRec{
	int w, h, border, area;
	
	void rectangle(int w, int h) {
		input(w, h);
		calc();
		ppp();
	}
	
	void input(int w, int h) {
		this.w = w;
		this.h = h;
	}
	void calc() {
		border = 2*(w+h);
		area = w * h;
	}
	void ppp() {
		System.out.println("직사각형의 둘레 : "+border+", 직사각형의 넓이 : "+area);
	}
}

public class MethodRecMain {

	public static void main(String[] args) {
		MethodRec mr = new MethodRec();
		mr.rectangle(3, 5);

	}

}
