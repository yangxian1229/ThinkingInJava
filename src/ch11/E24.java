package ch11;

import java.util.*;

import net.mindview.util.Countries;

public class E24 {
	public static void main(String args[]){
		Map<String,String> countries = new LinkedHashMap<String,String>(Countries.capitals(25));
		System.out.println(countries);
		List<String> keys = new ArrayList<String>(countries.keySet());
		Collections.sort(keys,String.CASE_INSENSITIVE_ORDER);
		Map<String,String> m2 = new LinkedHashMap<String, String>();
		for(String s : keys)
			m2.put(s,countries.get(s));
		System.out.println(m2);
	}
}
