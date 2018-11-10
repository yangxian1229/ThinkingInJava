package object;

public class E04_DataOnly {
	int i;
	double d;
	boolean b;

	public static void main(String[] args) {
		E04_DataOnly dataOnly = new E04_DataOnly();
		dataOnly.i = 47;
		dataOnly.d = 1.1;
		dataOnly.b = false;
		System.out.println(dataOnly.i+"   "+dataOnly.d+"   "+dataOnly.b);

	}

}
