package ch11;

import java.util.*;

public class E08 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList();
		for(int i = 0;i<3;i++)
			gerbils.add(new Gerbil(i));
		Iterator<Gerbil> it = gerbils.iterator();
		while(it.hasNext()){
			Gerbil g = it.next();
			g.hop();
		}
	}

}
