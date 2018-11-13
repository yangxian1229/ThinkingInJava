package ch5;

public class E10 {
	protected void finalize(){
		System.out.println("finalized");
	}
	public static void main(String[] args) {
		new E10();
	}
}///:~
