package ch5;

public class E15 {
	String s;
	{
		s = "initialization";
	}
	E15(){
		System.out.println("default s="+s);
	}
	E15(int i){
		System.out.println("int arg s="+s);
	}
	public static void main(String[] args) {
		new E15();
		new E15(1);
	}
}/* Output:
default s=initialization
int arg s=initialization
*///:~
