package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {

	public static void main(String[] args) {
	
		HashSet h = new HashSet();
		
		h.add("Akshay");
		h.add("Koyale");
		h.add(1995);
		h.add(null);
		h.add(null);
		h.add(1995);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains("Koyale"));
        System.out.println(h.isEmpty());
        System.out.println(h.remove("null"));
        h.add("Latur");
        System.out.println(h);
        System.out.println("============================");
        
        Iterator it = h.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        } System.out.println("============================");
        
       for(Object o:h) {
    	   System.out.println(o);
       } System.out.println("============================");
        
        h.clear();
        System.out.println(h.isEmpty());
        
        
	}

}
