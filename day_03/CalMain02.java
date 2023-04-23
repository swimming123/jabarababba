package day_03;

public class CalMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.1증감연산자 ");
		int a = 5;
		// a = a+1;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		// a**
		// a//
		// a%%
		
		System.out.println("a++ : " + a++); //후치연산
		System.out.println(a);
		
		System.out.println("++a : " + ++a); //전치연산 
		System.out.println(a);
		
		int aa = 5, bb = 6, cc = 10, dd;
		dd = aa++ + ++cc - (bb-- * --aa) + a++;
//		     5++     ++10   6--   --aa   a++   
//			5		11      6     5       5
		System.out.println(dd);
		
		System.out.println(aa + "," + bb + "," + cc + "," + dd);
//		6, 5, 11, -9  계산이 왜 다를
		
		System.out.println("2.4 대입연산자 ");
		a = 3;
		a=a+3;
		System.out.println(a);
		a = 3;
		a+=3;
		System.out.println(a);
		a=7;
		
		System.out.println("a-=2"+ (a-=2));
		System.out.println("a*=6"+ (a*=6));
		System.out.println("a/=3"+ (a/=3));
		System.out.println("a%=7"+ (a%=7));
		
		System.out.println("3. 조건연산자 ");
		System.out.println(true ? "참이지롱 " : "거짓이지롱");
		System.out.println(false ? "참이지롱 " : "거짓이지롱");
		
		a = 18;
		String res = a>=80 ? "합격 " :"불합격 " ;
		System.out.println(a+" : "+res);
		
		res = a>=80 ? "우수 " : 
			  a>=60 ? "양호" : 
			  a>=40 ? "정상 " :
			  "미흡 " ;
		System.out.println(a+" : "+res);
		
		res = a>=80 ? "우수 " : (a>=60 ? "양호" : a>=40 ? "정상 " :"미흡 ") ;
		System.out.println(a+" : "+res);
		
		a = 68;
		res = a>=80 ? "우수 " : 
			  a>=40 ? "정상 " :
			  a>=60 ? "양호" : 
			  "미흡 " ;
		System.out.println(a+" : "+res);
		//68인데 정상이 뜸, 점진적인 범위로 설계해야 함 
	}

}
