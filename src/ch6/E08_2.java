package ch6;

import ch6_1.Connection2;
import ch6_1.ConnectionManager2;

public class E08_2 {

	public static void main(String[] args) {
		Connection2[] ca = new Connection2[10];
		//Use up all the connections
		for(int i=0;i<10;i++)
			ca[i] = ConnectionManager2.getConnection2();
		//Should produce "null" since there are no more connections:
		System.out.println(ConnectionManager2.getConnection2());
		//Return connections, then get them out:
		for(int i=0;i<5;i++){
			ca[i].checkIn();
			Connection2 c2 = ConnectionManager2.getConnection2();
			System.out.println(c2);
			c2.doSomething();
			//c2.checkIn();
		}
	}
}/* Output:
null
Connection2 0
Connection2 1
Connection2 2
Connection2 3
Connection2 4
*/
