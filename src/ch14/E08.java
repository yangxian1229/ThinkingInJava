package ch14;

import static net.mindview.util.Print.*;



public class E08 {
	static void printClasses(Class<?> c){
		// getSuperclass() returns null on Object:
		if(c == null) return;
		print(c.getName());
		// Produces the interfaces that this class implements:
		for(Class<?> k : c.getInterfaces()){
			print("Interface: "+k.getName());
			printClasses(k.getSuperclass());// 递归实现
		}
		printClasses(c.getSuperclass()); // 递归实现
	}

	public static void main(String[] args) throws ClassNotFoundException {
		printClasses(Class.forName("ch14.toys.FancyToy"));

	}

}
