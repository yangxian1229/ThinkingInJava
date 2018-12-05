package ch11;

import net.mindview.util.*;

public class E15 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		char data[] = s.toCharArray();
		for(int i=0;i<data.length;)
			switch(data[i++]){
			case '+' : stack.push(data[i++]);
						break;
			case '-' : System.out.print(stack.pop());
			}
	}
}/* Output:
cnUtreaiytn ursel
*///:~
