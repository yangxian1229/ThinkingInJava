package ch6_1;

import net.mindview.util.New;

public class ConnectionManager {
	private static Connection[] pool = new Connection[10];
	private static int counter = 0;
	static {
		for(int i=0;i<pool.length;i++)
			pool[i] = new Connection();
	}
	// Very simple -- just hands out each one once:
	public static Connection getConnection(){
		if(counter < pool.length)
			return pool[counter++];
		return null;
	}
}///:~
