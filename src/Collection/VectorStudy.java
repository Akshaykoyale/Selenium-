package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Akshay");
		v.add("Koyale");
		v.add(25);
		v.add(1995);
		v.add(null);
		v.add(null);
		v.add(true);
		//v.add("Akshay");
		//v.add("Koyale");
		//v.add(25);
		//v.add(1995);
		//v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(25));
		System.out.println(v.indexOf(1995));
		System.out.println(v.get(4));
		System.out.println("=============================");
		
		for(Object o:v) {
			System.out.println(o);
		}
		System.out.println("=============================");
		
		Iterator it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}System.out.println("=============================");
		
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());}
		System.out.println("=============================");
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}System.out.println("=============================");
		
		
	}

}
