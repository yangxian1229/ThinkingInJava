package ch6_1;

public class Connection2 {
	private static int counter = 0;
	private int id = counter++;
	Connection2() {}
	public String toString(){
		return "Connection2 "+id;
	}
	public void doSomething(){}
	public void checkIn(){
		ConnectionManager2.checkIn(this);
	}

}///:~
