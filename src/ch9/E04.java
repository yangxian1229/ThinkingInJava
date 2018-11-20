package ch9;

abstract class E04A{}

class E04B extends E04A{
	public void hello(){
		System.out.println("E04B say hello!");
	}
}

abstract class E04A1{
	abstract public void hi();
}

class E04B1 extends E04A1{
	public void hi(){
		System.out.println("E04B1 say hi!");
	}
}


public class E04 {
	static public void test(E04A e04){
		//must downcast
		System.out.println("E04.test(): ");
		((E04B)e04).hello();
	}
	
	static public void test1(E04A1 e041){
		//no downcast necessary
		System.out.println("E041.test1(): ");
		e041.hi();
	}

	public static void main(String[] args) {
		E04A e = new E04B();
		test(e);
		
		E04A1 e1 = new E04B1();
		test1(e1);

	}

}
