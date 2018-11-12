package ch4;

import net.mindview.util.Print;

public class E04 {

	public static void main(String[] args) {
		int flag,count=0;
		for(int i=2;i<100;i++){
			flag = 0;
			for(int j=2;j*j<=i;j++){
				if(i%j == 0){
					flag = 1;
					break;
				}
			}
			
			if(flag == 0){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.print("\n共有"+count+"个素数");
	}
}
