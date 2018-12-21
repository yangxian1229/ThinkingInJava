package ch14;

import java.util.*;

public class E05 {
	static void rotateAll(List<Shape> shapes) {
		for(Shape shape : shapes)
		if(!(shape instanceof Circle))
			shape.rotate(45);
	}
	public static void main(String[] args) {
		List<Shape> shapes = Arrays.asList(
				new Circle(), new Square(), new Triangle()
		);
		rotateAll(shapes);
	}
}
