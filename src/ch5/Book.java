/*
 * Using finalize() to detect an object that hasn't been properly cleaned up.
 */
package ch5;

public class Book {
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkInt(){
		checkedOut = false;
	}
	protected void finalize() {
		if(checkedOut){
			System.out.println("Error: checked out");
		}
	//  Normally, you'll also do this:
	//  super.fianlize(); //Call the base-class version
	}
	public static void main(String[] args) {
		Book novel = new Book(true);
		//Proper cleanup:
		novel.checkInt();
		//Drop the reference, forget to clean up:
		new Book(true);
		//Force garbage collection & finalization
		System.gc();
	}
}/* Output:
Error: checked out
*///:~
