package ch6;

public class E05 {
	public int a;
	private int b;
	protected  int c;
	int d;
	public void f1(){
		System.out.println("public");
	}
	private void f2(){
		System.out.println("private");
	}
	protected void f3(){
		System.out.println("protected");
	}
	void f4(){
		System.out.println("friendly");
	}

	public static void main(String[] args) {
		E05 e05 = new E05();
		e05.f1();
		e05.f2();
		e05.f3();
		e05.f4();
		e05.a = 3;
		e05.b = 4;
		e05.c = 5;
		e05.d = 6;
			

	}

}
