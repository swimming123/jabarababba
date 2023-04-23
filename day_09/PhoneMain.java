/*
 *핸드폰은 구현하세요
 *핸드폰 : 사진찍기, 통화하기
 
  갤럭시 : 사진찍기 : 100배 줌
  		 통화하기 : 일반통화음질
  	
  아이폰 : 사진찍기 : 흔들림 없음
         통화하기 : 노이즈 캔슬링
 */
package day_09;

class Phone{
	String name, camera, call;
	
	void camera() {}
	void call() {}
	
	void ppp() {
		camera();
		call();
		String ttt = "단말기종 : "+name+", 카메라 : "+camera+", 전화 : "+call;
		System.out.println(ttt);
		
	}
}

class Galaxy extends Phone{
	public Galaxy() {
		name = "Galaxy";
	}
	void camera(){
		camera = "100배 줌";
	}
	void call(){
		call = "일반 통화 음질";
	}
	
}

class iPhone extends Phone{
	public iPhone() {
		name = "iPhone";
	}
	void camera(){
		camera = "흔들림 없음";
	}
	void call(){
		call = "노이즈 캔슬링";
	}
}
public class PhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		Galaxy g = new Galaxy();
		iPhone i = new iPhone();
		p.ppp();
		g.ppp();
		i.ppp();

	}

}
