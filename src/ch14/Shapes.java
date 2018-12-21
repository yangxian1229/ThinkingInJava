package ch14;
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
  //Ðý×ª
  void rotate(int degrees) {
	  System.out.println("Rotating "+this+"by "+degrees+" degrees");
  }
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
  void rotate(int degrees) {
	  throw new UnsupportedOperationException();
  }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}	

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
      shape.draw();
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
