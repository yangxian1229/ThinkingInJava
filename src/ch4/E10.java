package ch4;

public class E10 {
	public static void main(String[] args) {
		int startDigit[] = new int[4];
		int productDigit[] = new int[4];
		
		for(int num1=10;num1<=99;num1++){
			for(int num2=num1;num2<=99;num2++){
				// Pete Hartley's theoretical result:
				//If x¡¤y is a vampire number then x¡¤y == x+y (mod 9)
				if((num1*num2)%9 != (num1+num2)%9)
					continue;
				int product = num1*num2;
				startDigit[0] = num1/10;
				startDigit[1] = num1%10;
				startDigit[2] = num2/10;
				startDigit[3] = num2%10;
				productDigit[0] = product/1000;
				productDigit[1] = (product%1000)/100;
				productDigit[2] = product%1000%100/10;
				productDigit[3] = product%1000%100%10;
				int count=0;
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						if(startDigit[i] == productDigit[j]){
							count++;
							startDigit[i] = -1;
							productDigit[j] = -2;
							if(count == 4){
								System.out.println(product+"="+num1+"*"+num2);
								break;
							}
						}
					}
				}
			}
		}
	

	}

}/* Output:
1395=15*93
1260=21*60
1827=21*87
2187=27*81
1530=30*51
1435=35*41
6880=80*86
*///:~
