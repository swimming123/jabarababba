package pacTest;

public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("반가워요여러분");
		
//		1. 숫자
		System.out.println(100);
		System.out.println(123.123);
		System.out.println(123+12);
		System.out.println(123-12);
		System.out.println(123*12);
		System.out.println(123/12);
		System.out.println(123%12);
		
//		2. 문자
		System.out.println('가');
//		System.out.println(''); //error
//		System.out.println('가나다');/error
		System.out.println('a');
		System.out.println('★');
		
//		3. 문자열
		System.out.println("가나다");
		System.out.println("");
		System.out.println("abcd");
		System.out.println("d");
		System.out.println("....?");
		System.out.println("100"+"50"); //문자열이므로 숫자를 써도 붙여쓰기만 됨
		
//		4. 서식문자 (\~)
		System.out.println("나폴레옹은 '이 산이 아닌데?'라고 생각했다..?");
		System.out.println("나폴레옹은 \'이 산이 아닌데?\'라고 생각했다..?");
//		System.out.println("나폴레옹은 "불이야!"라고 외쳤다!!"); 문자열 안에 쌍따옴표!!
//							"나폴레옹은 "     "라고 외쳤다!!"
		System.out.println("나폴레옹은 \"불이야!\"라고 외쳤다!!");
		System.out.println("아기상어\t뚜루루 뚜루\n귀여운\t뚜루 뚜루\n바닷속\t뚜루루뚜루\n아기상어");
		
//		\'  '
//		\"  "
//		\t  tab
//		\n enter
		
		System.out.println("장수풍뎅이"); //출력문 실행 후 줄바꿈 함
		System.out.print("하늘소"); // 출력문만 실행 줄바꿈 안함, 항상 출력 내용이 있어야 함.
//		System.out.print(""); // 내용 없으면 error
		System.out.println("/t 땅소");
		System.out.print("/n 땅소");
		System.out.print("바다소");
		System.out.print("갯벌소");
		
	
	
	
	
	
	
	
	}

}