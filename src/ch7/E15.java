package ch7;

import ch7_1.Villain;

class HH extends Villain{
	public HH(String name) {
		super(name);
		System.out.println("HH constructor");
	}
	public void set(String nm){
		super.set(nm);
	}
	public String toString(){
		return super.toString();
	}
}

public class E15 {

	public static void main(String[] args) {
		Villain v = new Villain("HAHA");
		//v.set("HeiHEI");
		System.out.println(v.toString());
		
		HH hh = new HH("nihao");
		System.out.println(hh.toString());
		hh.set("Hello");
		System.out.println(hh.toString());

	}

}
