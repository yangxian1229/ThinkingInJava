package ch15_addition;

import java.util.*;

public class GenericTest {
	public static void main(String[] args) {
		/*
		List list = new ArrayList();
		list.add("qqyumidi");
		list.add("corn");
		list.add(100);
		*/
		/*
		 List<String> list = new ArrayList<String>();
	     list.add("qqyumidi");
	     list.add("corn");
	     //list.add(100);   // 1  ÌáÊ¾±àÒë´íÎó

		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); // 1
			System.out.println("name:" + name);
		}
		*/
		/*
		Box<String> name = new Box<String>("corn");
		 
        System.out.println("name:" + name.getData());
        */
        Box<Number> name = new Box<Number>(99);
	}

}


class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}