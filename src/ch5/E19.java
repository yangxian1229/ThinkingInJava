package ch5;

public class E19 {
	static void f(String ...strings ){
		for(String s:strings)
			System.out.print(s+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		f("1datelgt","2lsajglg","3dljgoje");
		String[] ss={"1111","2222","3333"};
		f(ss);
	}
}/* Output:
1datelgt 2lsajglg 3dljgoje 
1111 2222 3333 
*///:~
