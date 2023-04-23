package day_09;
/*
핸드폰을 구현하세요
핸드폰 - 사진찍기, 통화하기

갤럭시 - 사진찍기 : 100배 줌
통화하기 : 일반통화음질

아이폰 - 사진찍기 : 흔들림 없음
통화하기 : 노이즈 캔슬링

 * */
class OverPhone{
	String name;
	
	OverPhone(String name){
		this.name = name;
	}
	
	void call(String target) {
		
	}
	void photo(String target) {
		
	}
}

class OverGalaxy extends OverPhone{
	public OverGalaxy() {
		super("갤럭시");
	}
	
	void call(String target) {
		System.out.println(name+"로 "+target+"과 일반 전화해요");
	}
	void photo(String target) {
		System.out.println(name+"로 "+target+" x100  확대 사진 찍어요");
	}
}

class OverIPhone extends OverPhone{
	public OverIPhone() {
		super("아이폰");
	}
	
	void call(String target) {
		System.out.println(name+"으로 "+target+"과 노이즈캔슬링 전화해요");
	}
	void photo(String target) {
		System.out.println(name+"으로 "+target+" 흔들림 없는 사진 찍어요");
	}
}
public class OverPhoneMain {

	public static void main(String[] args) {
		OverPhone ph1 = new OverPhone("시티폰");
		ph1.call("친구");
		ph1.photo("나무");
		OverGalaxy ph2 = new OverGalaxy();
		ph2.call("친구");
		ph2.photo("나무");
		OverIPhone ph3 = new OverIPhone();
		ph3.call("친구");
		ph3.photo("나무");

	}

}