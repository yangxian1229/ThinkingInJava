package ch5;


public class E03_E04 {
	E03_E04(){
		System.out.println("This is default constructor");
	}
	E03_E04(String s){
		System.out.println(s+" This is another constructor");
	}
	public static void main(String[] args) {
		E03_E04 e=new E03_E04();
		E03_E04 e1=new E03_E04("E03_E04:");

	}

}
