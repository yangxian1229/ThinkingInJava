package ch10;

public class E12 {
	private int i =10;
	private void f(){
		System.out.println("E12.f()");
	}
	public void h(){
		new Object(){
			void g(){
				i++;
				f();
			}
		}.g();
	}
	public static void main(String[] args) {
		E12 e = new E12();
		e.h();
	}
}/* Output:
E12.f()
*///:~
