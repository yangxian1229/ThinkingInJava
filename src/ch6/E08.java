package ch6;

import ch6_1.Connection;
import ch6_1.ConnectionManager;

public class E08 {

	public static void main(String[] args) {
		Connection c = ConnectionManager.getConnection();
		while(c != null){
			System.out.println(c);
			c.doSomething();
			c = ConnectionManager.getConnection();
		}
	}
}/* Output:
Connection 0
Connection 1
Connection 2
Connection 3
Connection 4
Connection 5
Connection 6
Connection 7
Connection 8
Connection 9
*/
