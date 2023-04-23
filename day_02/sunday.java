package day_02;

public class sunday {
public static void main(String[] args) {
		
		
		boolean bo = true;
		System.out.println(bo);
		bo = false;
		System.out.println(bo);
		//bo = 1;
		//bo = True;
		//bo = "true";
		
		byte bb = 100;  // -128 ~ 127
		System.out.println(bb);
		//bb = true;
		//bb = "1234";
		bb = 127;
		//bb = 128;
		System.out.println(bb);
		
		short sh = 128;
		System.out.println(sh);
		sh = -32768;
		System.out.println(sh);
		sh = 32767;
		//sh = 32768;
		System.out.println(sh);
		
		int i = 32768;
		System.out.println(i);
		i = 2147483647;
		System.out.println(i);
		//i = 2147483648L;
		//System.out.println(i);
		
		long lo = 2147483648L;
		System.out.println(lo);
		lo = 9223372036854775807L;
		System.out.println(lo);
		//lo = 9223372036854775808L;
		
		bb = 123;
		//bb = 123.456;
		
		float ff = 123;
		System.out.println(ff);
		ff = 123.456F;
		System.out.println(ff);
		
		double dd = 456;
		System.out.println(dd);
		dd = 456.798;
		System.out.println(dd);
		
		char ch = 'a';
		System.out.println(ch);
		
		//클래스 > 기본 자료형이 아님
		String tt = "asdfasdf";
		System.out.println(tt);

	}

}
