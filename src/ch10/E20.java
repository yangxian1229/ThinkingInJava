package ch10;

interface E20I{
	class E20C{
		public void print(){
			System.out.println("E20C");
		}
	}
}

class E20A implements E20I{}

public class E20 {
	public static void main(String[] args) {
		E20A ea = new E20A();
		E20I.E20C ec = new E20I.E20C();
		ec.print();
	}
}
