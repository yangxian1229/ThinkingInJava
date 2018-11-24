package ch10;

interface E11I{
	public void print();
}

class Outer10{
	private class E11C implements E11I{
		public void print(){
			System.out.println("E11 E11C");
		}
	}
	E11I get1(){
		return new E11C();
	}
	E11C get2(){
		return new E11C();
	}
}

public class E11 {
	

	public static void main(String[] args) {
		Outer10 e = new Outer10();
		E11I ei = e.get1();
		ei.print();
		
		//! E11C ec = e.get2();
		//! ec.print();
		

	}

}
