package ch11;

import java.util.*;
import shape.*;

class RandomShapeGenerator implements Iterable<Shape>{
	private int counter = 0;
	RandomShapeGenerator(int c){
		counter = c;
	}
	
	private  Random rand = new Random(47);
	public Shape nextShape() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}

	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < counter;
			}

			@Override
			public Shape next() {
				index++;
				return nextShape();
			}
			
		};
	}
	public static void display(Iterator<Shape> it) {
		while(it.hasNext())
			System.out.println(it.next()+" ");
		System.out.println();
	}
}

public class E31 {
	public static void main(String[] args){
		RandomShapeGenerator rsg = new RandomShapeGenerator(5);
		RandomShapeGenerator.display(rsg.iterator());
	}

}
