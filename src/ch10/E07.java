package ch10;

class E07Class{
	private int i;
	private String setString(String s){
		return "E07Class :"+s;
	}
	
	class Inner{
		void setInt(int ii){
			i = ii;
			System.out.println("i = "+ i);
			System.out.println(setString("Inner call setString()"));
		}
	}
	
	void f(int i){
		Inner inner = new Inner();
		inner.setInt(i);
	}
}

public class E07 {
	public static void main(String[] args) {
		E07Class e = new E07Class();
		e.f(5);
	}
}/* Output:
i = 5
E07Class :Inner call setString()
*///:~
