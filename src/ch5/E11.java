package ch5;

public class E11 {
	protected void finalize(){
		System.out.println("finalized");
	}
	public static void main(String[] args) {
		new E11();
		System.gc();
		System.runFinalization();
	}
}///:~
