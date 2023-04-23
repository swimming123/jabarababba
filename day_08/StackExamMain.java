package day_08;

import java.util.Arrays;

class StackExam{
	String name;
	int [] jum;
	int tot, avg;
	//공통 멤버변수를 사용하여 컴퍼넌스 형태로 구분하여 설계
	void exam(String name, int kor, int eng, int mat) {
		input(name, kor, eng, mat);
		calc();
		ppp();
	}
	// 데이터 입력부
	void input(String name, int ...jum) {
		this.name = name;
		this.jum = jum;
	}
	// 연산부
	void calc() {
		tot = 0;
		for( int i : jum ) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	// 출력부
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

public class StackExamMain {

	public static void main(String[] args) {
		StackExam se = new StackExam();
		se.exam("윤수영", 78,56,90);
		

	}

}
