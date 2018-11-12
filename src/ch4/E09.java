package ch4;

public class E09 {
	static void fibonacci(int n){
		int f[] = new int[n];
		f[0]=f[1]=1;
		System.out.print(f[0]+" "+f[1]+" ");
		for(int i=2;i<n;i++){
			f[i]=f[i-1]+f[i-2];
			System.out.print(f[i]+" ");
		}
	}
	//ตÝน้
	static int fib(int n){
		if(n<2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		fibonacci(20);
		System.out.println();
		int n = 20;
		for(int i=0;i<n;i++){
			System.out.print(fib(i)+" ");
		}

	}

}/* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 
*/