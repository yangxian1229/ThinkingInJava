package ch14;

import static net.mindview.util.Print.*;

import java.lang.reflect.Field;

public class E09 {
	
	static void printFields(Class<?> c){
		if(c == null)
			return ;
		print(c.getName());
		Field[] fields = c.getDeclaredFields();
		if(fields.length != 0)
			print("Fields:");
		for(Field fld : fields){
			print("  "+fld);
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		printFields(Class.forName("ch14.toys.FancyToy"));
	}
}
