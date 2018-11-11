//: ch3/E04_Velocity.java
//{Args: 30.5 3.2}
/****************** Exercise 4 *****************
* Write a program that calculates velocity
* using a constant distance and a constant time.
***********************************************/
package ch3;
public class E04_Velocity {
	public static void main(String[] args) {
		if(args.length < 2){
			System.err.println("Usage: java E04_Velocity distance time");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		System.out.println("Velocity = "+distance/time+" m\\s");
	}
}/* Output:
Velocity = 9.53125 m\s
*///:~
