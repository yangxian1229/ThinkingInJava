package ch4;



//筛选法
public class E04_2 {
	public static void main(String[] args) {
		int max = 100;
		boolean sieve[] =new boolean [max+1];
		for(int i=2;i*i<=max;i++){
			if(!sieve[i]){
				for(int j=2*i;j<=max;j+=i){
					sieve[j] = true;
				}
			}
		}
		int count = 0;
		for(int i = 2;i<=max;i++){
			if(!sieve[i]){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.print("\n共有"+count+"个素数");
	}

}
