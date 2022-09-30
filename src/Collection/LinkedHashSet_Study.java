package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Study {

	public static void main(String[] args) {
		
		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add("Akshay");
		lh.add("Koyale");
		lh.add(25);
		lh.add(1995);
		lh.add(null);
		lh.add(null);
		lh.add("Akshay");
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		System.out.println(lh.contains(1995));
		System.out.println(lh.add("Latur"));
		System.out.println(lh);
		System.out.println(lh.remove(25));
		System.out.println(lh);
		System.out.println("==============================");
		
		Iterator it = lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println("==============================");
		
		for(Object o:lh) {
			System.out.println(o);
		}System.out.println("==============================");
		
		lh.clear();
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());

		
		
		
		
	}

}
