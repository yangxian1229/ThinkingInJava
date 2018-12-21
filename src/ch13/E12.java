package ch13;

import java.util.*;
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class E12 {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		Matcher m =
				Pattern.compile("\\b((?![A-Z])\\w+)\\b").matcher(Groups.POEM);
		while(m.find())
			words.add(m.group(1));
		print("Number of unique words = " + words.size());
		print(words.toString());
	}
}
