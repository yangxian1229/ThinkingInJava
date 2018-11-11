//: ch3/E05_Dogs.java
/****************** Exercise 5 *****************
* Create a class called Dog with two Strings:
* name and says. In main(), create two dogs,
* "spot" who says, "Ruff!", and "scruffy" who
* says, "Wurf!". Then display their names and
* what they say.
***********************************************/
/****************** Exercise 6 *****************
* Following Exercise 5 assign, a new Dog
* reference to spot's object. Test for comparison
* using == and equals() for all references.
***********************************************/
package ch3;

import static net.mindview.util.Print.*;

class Dog{
	String name,says;
	void shuchu(){
		System.out.println(name + " says:"+says);
	}
}

public class E5_Dogs {
	static void compare(Dog dog1, Dog dog2) {
		print("== on top references: " + (dog1 == dog2));
		print(
		"equals() on top references: " + dog1.equals(dog2)
		);
		print("== on names: " + (dog1.name == dog2.name));
		print(
		"equals() on names: " + dog1.name.equals(dog2.name)
		);
		print("== on says: " + (dog1.says == dog2.says));
		print(
		"equals() on says: " + dog1.says.equals(dog2.says)
		);
		}
	public static void main(String[] args) {
		Dog aDog = new Dog();
		aDog.name = "spot";
		aDog.says = "Ruff";
		Dog bDog = new Dog();
		bDog.name = "scruffy";
		bDog.says = "Wurf";
		
		aDog.shuchu();
		bDog.shuchu();
		
		//compare the sopt's object and scruffy's object
		print("\n compare aDog and bDog:");
		compare(aDog,bDog);
		//a new Dog reference to spot's object.
		Dog newDog = aDog;
		print("\n compare aDog and newDog:");
		compare(aDog, newDog);
		print("\n compare bDog and newDog:");
		compare(bDog, newDog);
		
	}
}/* Output:
spot says:Ruff
scruffy says:Wurf

 compare aDog and bDog:
== on top references: false
equals() on top references: false
== on names: false
equals() on names: false
== on says: false
equals() on says: false

 compare aDog and newDog:
== on top references: true
equals() on top references: true
== on names: true
equals() on names: true
== on says: true
equals() on says: true

 compare bDog and newDog:
== on top references: false
equals() on top references: false
== on names: false
equals() on names: false
== on says: false
equals() on says: false
*///:~
