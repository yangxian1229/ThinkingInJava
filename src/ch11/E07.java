package ch11;

import java.util.*;

class MyClass07{
	private int i=0;
	MyClass07(int ii){
		i = ii;
	}
	public String toString(){
		return "MyClass: "+i;
	}
}

public class E07 {
	public static void main(String[] args) {
		List<MyClass07> myclass = new ArrayList<MyClass07>();
		for(int i=0;i<10;i++)
			myclass.add(new MyClass07(i));
		
		for(MyClass07 mc:myclass)
			System.out.println(mc.toString());
		List<MyClass07> sub = myclass.subList(1,4);
		System.out.println(sub);
		myclass.removeAll(sub);
		System.out.println(myclass);
	}

}
