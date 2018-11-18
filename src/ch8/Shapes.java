package ch8;

import static net.mindview.util.Print.*;

import java.util.Random;

import net.mindview.util.New;

class Shape{
	public void draw(){}
	public void erase(){}
	public void test(){print("Shape test");}
}

class Circle extends Shape{
	@Override
	public void draw(){print("Circle draw()");}
	@Override
	public void erase(){print("Circle draw()");}
	public void test(){print("Circle  test");}
}

class Square extends Shape{
	@Override
	public void draw(){print("Square draw()");}
	@Override
	public void erase(){print("Square draw()");}
}

class Triangle extends Shape{
	@Override
	public void draw(){print("Triangle draw()");}
	@Override
	public void erase(){print("Triangle draw()");}
}

class RandomShapeGeneration{
	private Random rand = new Random(47);
	public Shape next(){
		switch (rand.nextInt(3)) {
		default:
		case 0:return new Circle();
		case 1:return new Square();
		case 2:return new Triangle();
		}
	}
}


public class Shapes {
	private static RandomShapeGeneration gen = new RandomShapeGeneration();
	
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		//Fill up the array with shapes:
		for(int i=0;i<s.length;i++)
			s[i] = gen.next();
		for(Shape shp : s){
			//shp.draw();
			shp.test();
		}
	}
}/* Output:
Triangle draw()
Triangle draw()
Square draw()
Triangle draw()
Square draw()
Triangle draw()
Square draw()
Triangle draw()
Circle draw()
*///:~
