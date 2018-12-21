package ch14;

class Rhomboid extends Shape {
	public String toString() {
		return "Rhombid";
	}
	
}

public class E03 {
	public static void main(String[] args) {
		Shape sr = new Rhomboid();
		Rhomboid r = null;
		if(sr instanceof Rhomboid){
			r = (Rhomboid) sr;
			System.out.println(r.toString());
		}
		Circle c = null;
		if(sr instanceof Circle) {
			c = (Circle) sr;
			System.out.println(c.toString());
		}
		//Circle ci = (Circle) sr;
	}

}
