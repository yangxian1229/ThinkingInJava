package object;

class StaticTest{
	static int i = 47;
}

public class E07_Incrementable {
	static void increment(){
		StaticTest.i ++;
	}

	public static void main(String[] args) {
		E07_Incrementable sf = new E07_Incrementable();
		sf.increment();
		
		E07_Incrementable.increment();
		
		//还可以直接调用
		increment();
		
		System.out.println(StaticTest.i);

	}

}
