package ch16;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Sphere " + id;
	}
}

public class E01 {
	static void hide(BerylliumSphere[] b){ 
		System.out.println("length: " + b.length);
	}

	public static void main(String[] args) {
		
		hide(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
		
		BerylliumSphere[] bls  = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
		hide(bls);
		
		BerylliumSphere[] b;
		b = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};
		hide(b);
		
	}

}
