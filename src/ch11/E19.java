package ch11;

import java.util.*;
import net.mindview.util.Countries;

public class E19 {
	public static void main(String[] args) {
		List<String> m1 = new ArrayList<String>(Countries.names(5));
		String[] keys = m1.toArray(new String[0]);
		Arrays.sort(keys);
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		for(String s:keys){
			hs.add(s);
			lhs.add(s);
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("HashSet: "+hs);
		System.out.println("LinkedHashSet: "+lhs);
	}
}/* Output:
ALGERIA ANGOLA BENIN BOTSWANA BURKINA FASO 
HashSet: [BENIN, BOTSWANA, ANGOLA, BURKINA FASO, ALGERIA]
LinkedHashSet: [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
*///:~
