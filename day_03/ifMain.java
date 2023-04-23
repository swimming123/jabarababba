package day_03;

public class ifMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true) {
			System.out.println("참1");
			System.out.println("참1");
			System.out.println("참1");
			System.out.println("참1");
			// () 조건식이 참일떄 if 문 실행
			// (false)일경우 실행안함
		}
		System.out.println("이프 종료 >_<");
		
		//이프문 중괄호 없삼
		if(true) 
			System.out.println("참2");
			System.out.println("참2");
			System.out.println("참2");
			System.out.println("참2");
		
		System.out.println("이프 종료 >_< 2");
		
		//이프문 중괄호 없삼,조건식 false
		//중괄호가 없을 경우 이프문 다음 실행구문 1개만 종속구문임
		if(false) 
			System.out.println("참3");
			System.out.println("참3");
			System.out.println("참3");
			System.out.println("참3");
				
			System.out.println("이프 종료 >_< 3");
			
//		if(true)
//			 if문이 중괄호 없을 경우 종속구문 1개가 반드시 필요하다.
		int b=20, c, d;
		if(true) {
			int a = 10; // 내부변수 : 현재 구간(if문 내부, 중괄호 안에서)에서만 사용 가능 
			c=30;
			System.out.println("yes cham : "+a+","+b+","+c);
			
			
		}
		System.out.println("이프 종료 >_< 4!! "+b+","+c);
		
		boolean bo = true;
		if(bo) { //변수 
				// 현재 구간이 반드시 실행한다는 보장이 없다.
			int a = 10; // 내부변수 : 다른 구간일 경우 중복 선언 가능 
			d = 40;
			System.out.println("yes cham : "+a+","+b+","+d);
			
			
		}
//		System.out.println("이프 종료 >_< 5"+b+","+d); //error : 변수는 항상 true 할 수 없기 때문에 초기값을 저장하지 않고 if를 빠져나온다
  		System.out.println("이프 종료 >_< 5   "+b+",");
  		
  		if(true) {
  			System.out.println("참");
  		}else {
  			System.out.println("거짓거");
  		}
  		System.out.println("if else end");
  		
  		if(false) {
  			System.out.println("참");
  		}else {
  			System.out.println("거짓거");
  		}
  		System.out.println("if else end");
//  	노노 
//  		else(true) {
//  			System.out.println("참");
//  		}if {
//  			System.out.println("거짓거");
//  		}
//  		System.out.println("if else end");
  		
  		bo = true;
  		// if와 else문에서는 둘 중 하나의 조건을 반드시 실행하기 때문에
  		// e : 초기화되지 않고 조건문을 변수로 처리하여도 모든 경우에서 외부변수를 초기화
  		int e, f;
  		if(bo) {
  			int a = 11;
  			e = 50;
  			f  =70;
  			System.out.println("chammmmm : "+a+e+f);
  		}else {
  			int a = 22;
  			e = 60;
  			System.out.println("falseeeee : "+a+e);
  		}
  		 	
//  	System.out.println("if else end"f); // else에서 f를 초기화하지 않았기 때무네 거짓
  		System.out.println("if else end"+e);
  		
  		int jum = 72;
  		
  		if (jum >=80) {
  			System.out.println("합격");
  		}
  		else {
  			System.out.println("불합격");
  		}
  		
  		jum = 90;
  		if (jum >=80) {
  			System.out.println("우수"); //출력
  		}
  		if (jum >=60) {
  			System.out.println("양호");//출력 : 각각 다른 조건문 if 의 시작이므로 둘 다 출력된다.
  		}
  		else {
  			System.out.println("미흡");
  		}
  		
  		//위에거를 elif로 바꾸면
  		if (jum >=80) {
  			System.out.println("우수"); 
  		}
  		else if (jum >=60) {
  			System.out.println("양호");
  		}
  		else if (jum >=40) {
  			System.out.println("정상");
  		}
  		else {
  			System.out.println("미흡");
  		}
  	jum = 62;
  	//중첩 if 문
  		if (jum >=80) {
  			System.out.println("우수"); 
  		}
  		else if (jum >=60) {
  			System.out.println("양호");
  			if (jum %2 == 0) {
  	  			System.out.println("짝수"); 
  	  		}else {
  	  			System.out.println("홀수");
  	  		}
  		}
  		else if (jum >=40) {
  			System.out.println("정상");
  		}
  		else {
  			System.out.println("미흡");
  		}

	}

}
