package ch11;

import java.util.*;

public class E17 {
	public static void main(String[] args) {
		Map<String,Gerbil> gerbils = new HashMap<String,Gerbil>();
		gerbils.put("Fuzzy",new Gerbil(1));
		gerbils.put("Spot",new Gerbil(2));
		gerbils.put("A",new Gerbil(3));
		Iterator<String> it = gerbils.keySet().iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s+" :"+gerbils.get(s));
			gerbils.get(s).hop();
		}

	}
}
