package ch10.ch10_2;

import ch10.ch10_1.E05I;

public class E05C {
	protected class Inner implements E05I{
		public Inner(){}
		public void toPrint(){
			System.out.println("E10C Inner");
		}
	}

}
