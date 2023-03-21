package Problem.practise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractise {
	
	public static void main(String[] args) {
	
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1, "Raju");
		m.put(2, "MM");
		
		Set s=m.keySet();
		System.out.println(s);
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		Collection c=m.values();
		System.out.println(c);
		 
		Iterator it=s1.iterator();
		while(it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();
			System.out.println(m1.getKey()+"--"+m1.getValue());
		}
		          
		for(Map.Entry <Integer,String> m1 : m.entrySet())
			System.out.println(m1.getKey()+"----"+m1.getValue());
		
	}
}
