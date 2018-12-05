package ch11;

import java.util.*;
import net.mindview.util.*;

public class E20 {
	public static void main(String[] args) {
		Set<Character> vowels  = new HashSet<Character>(
				Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		Map<Character,Integer> vowCount = new HashMap<Character,Integer>();
		TextFile tf = new TextFile("src\\ch11\\UniqueWords.java","\\W+");
		for(String word:tf) {
			for(char c:word.toCharArray()){
				if(vowels.contains(c)){
					c = Character.toLowerCase(c);
					Integer freq = vowCount.get(c);
					vowCount.put(c,freq==null ? 1:freq+1);
				}
			}
		}
		System.out.println(vowCount);
	}
}/* Output:
{a=31, e=36, u=16, i=39, o=27}
*///:~
