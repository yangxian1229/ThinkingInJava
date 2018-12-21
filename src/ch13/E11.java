package ch13;

import static net.mindview.util.Print.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E11 {
	
	public static void main(String[] args){
		Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
	     Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any");
	      while(m.find()) {
	        print("Match \"" + m.group() + "\" at positions " +
	          m.start() + "-" + (m.end() - 1));
	      }
	}

}
