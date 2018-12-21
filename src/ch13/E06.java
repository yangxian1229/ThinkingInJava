package ch13;

import java.util.*;
import static java.lang.String.*;

class A06{
	int intField = 1;
	long longField = 2L;
	float floatField = 3.0f;
	double doubleField = 4.4;
	public String toString(){
		StringBuffer sb = new StringBuffer("A06: \n");
		sb.append(format(Locale.US, "intField: %d\n", intField));
		sb.append(format(Locale.US, "longField: %d\n", longField));
		sb.append(format(Locale.US, "floatField: %f\n", floatField));
		sb.append(format(Locale.US, "doubleField: %e\n", doubleField));
		return sb.toString();
	}
}

public class E06 {
	public static void main(String[] args){
		A06 a = new A06();
		System.out.println(a.toString());
	}

}
