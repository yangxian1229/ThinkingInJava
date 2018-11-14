package ch6_1;

public class ConnectionManager2 {
	private static Connection2[] pool = new Connection2[10];
	static {
		for(int i=0;i<pool.length;i++)
			pool[i] = new Connection2();
	}
	//Produce the first available connection:
	public static Connection2 getConnection2(){
		for(int i=0;i<pool.length;i++)
			if(pool[i] != null){
				Connection2 c2 = pool[i];
				pool[i] = null;//Indicates "in use"
				return c2;
			}
		return null; //None left
	}
	public static void checkIn(Connection2 c2){
		for(int i=0;i<pool.length;i++)
			if(pool[i] == null){
				pool[i] = c2; //Check it back in
				return;
			}
	}
}///:~
