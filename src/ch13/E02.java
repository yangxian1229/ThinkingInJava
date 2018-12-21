package ch13;

import java.util.ArrayList;
import java.util.List;

public class E02 {
	public String toString() {
	    return " E02 address: " + super.toString() + "\n";
	  }
	  public static void main(String[] args) {
	    List<E02> v =
	      new ArrayList<E02>();
	    for(int i = 0; i < 10; i++)
	      v.add(new E02());
	    System.out.println(v);
	  }

}
