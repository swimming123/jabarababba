package day_07;

class  CirCleMake{
	
	ReCirCle rrr = new ReCirCle();
	int cnt = 0;
	
	ReCirCle make(int r) {
		ReCirCle res = new ReCirCle();
		res.init(r);
		
		rrr.area += res.area;
		rrr.border += res.border;
		cnt++;
		
		return res;
	}
}

class ReCirCle{
	int r;
	double area, border;
	void init(int r) {
		this.r = r;
		double PI = 3.141592;
		
		area = r * r * PI;
		border = 2 * r * PI;
	}
	
	void ppp() {
		System.out.println(r+" => "+area+"\t"+border);
	}
}

public class CirCleMakeMain {

	public static void main(String[] args) {
		CirCleMake ccm = new CirCleMake();
		ReCirCle [] arr = {
				ccm.make(5),
				ccm.make(10),
				ccm.make(7),
				ccm.make(20),
				ccm.make(3)
		};
		
		for (ReCirCle rc : arr) {
			rc.ppp();
		}
		System.out.println("합계");
		ccm.rrr.ppp();
		System.out.println("평균");
		System.out.println(ccm.rrr.area/ccm.cnt+", "+ccm.rrr.border/ccm.cnt);

	}

}